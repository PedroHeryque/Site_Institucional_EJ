package com.include.inovale.landingpage.services;

import org.springframework.stereotype.Service;

import com.include.inovale.landingpage.models.dtos.ReqQuemSomosDTO;
import com.include.inovale.landingpage.models.dtos.ResQuemSomosDTO;
import com.include.inovale.landingpage.models.entities.QuemSomosEntity;
import com.include.inovale.landingpage.models.mappers.QuemSomosMapper;
import com.include.inovale.landingpage.models.repositories.QuemSomosRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class QuemSomosService {
    private final QuemSomosRepository quemSomosRepository;
    private final QuemSomosMapper quemSomosMapper;

    public ResQuemSomosDTO criarMembro(ReqQuemSomosDTO dto){
        QuemSomosEntity membro = quemSomosMapper.toEntity(dto);
        quemSomosRepository.save(membro);

        return quemSomosMapper.toResDTO(membro);
    }
}