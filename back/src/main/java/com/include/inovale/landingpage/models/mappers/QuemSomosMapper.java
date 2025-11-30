package com.include.inovale.landingpage.models.mappers;

import org.springframework.stereotype.Component;

import com.include.inovale.landingpage.models.dtos.ReqQuemSomosDTO;
import com.include.inovale.landingpage.models.dtos.ResQuemSomosDTO;
import com.include.inovale.landingpage.models.entities.QuemSomosEntity;

@Component
public class QuemSomosMapper {
    public QuemSomosEntity toEntity(ReqQuemSomosDTO dto){
        QuemSomosEntity quemSomos = new QuemSomosEntity();

        quemSomos.setNome(dto.getNome());
        quemSomos.setCargo(dto.getCargo());
        quemSomos.setFotoUrl(dto.getFotoUrl());
        quemSomos.setGithubUrl(dto.getGithubUrl());
        quemSomos.setLinkedinUrl(dto.getLinkedinUrl());

        return quemSomos;    
    }

    public ResQuemSomosDTO toResDTO(QuemSomosEntity membro){
        ResQuemSomosDTO dto = new ResQuemSomosDTO();
    
        dto.setId(membro.getId());
        dto.setNome(membro.getNome());
        dto.setCargo(membro.getCargo());
        dto.setFotoUrl(membro.getFotoUrl());
        dto.setGithubUrl(membro.getGithubUrl());
        dto.setLinkedinUrl(membro.getLinkedinUrl());

        return dto;
    }
}