package com.include.inovale.landingpage.services;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID; 

import org.springframework.stereotype.Service;
import com.include.inovale.landingpage.models.entities.ContatoEntity;
import com.include.inovale.landingpage.models.repositories.ContatoRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ContatoService {

    private final ContatoRepository repository;
    private final UsuarioAutenticadoService usuarioAutenticadoService;

    // metodo de salvamentento nao mudou.
    public ContatoEntity salvarMensagem(ContatoEntity contato) {
        contato.setDataEnvio(LocalDateTime.now());
        contato.setLido(false);
        return repository.save(contato);
    }

    public List<ContatoEntity> listarTodas() {
        usuarioAutenticadoService.verificaPapelAdmin();
        return repository.findAll();
    }

    // MUDANÇA AQUI: Recebe UUID em vez de Long
    public void deletar(UUID id) { 
        usuarioAutenticadoService.verificaPapelAdmin();
        repository.deleteById(id); 
    }
}