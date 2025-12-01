package com.include.inovale.landingpage.models.mappers;

import org.springframework.stereotype.Component;

import com.include.inovale.landingpage.models.dtos.ContatoDTO;
import com.include.inovale.landingpage.models.entities.ContatoEntity;

@Component
public class ContatoMapper {
    public ContatoEntity toEntity(ContatoDTO dto){
        ContatoEntity contato = new ContatoEntity();

        contato.setNome(dto.getNome());
        contato.setDataEnvio(dto.getDataEnvio());
        contato.setEmail(dto.getEmail());
        contato.setTelefone(dto.getTelefone());
        contato.setMensagem(dto.getMensagem());
        contato.setLido(dto.isLido());
        
        return contato;
    }
}
