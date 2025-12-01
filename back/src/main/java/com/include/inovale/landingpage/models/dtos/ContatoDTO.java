package com.include.inovale.landingpage.models.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID; 

@Getter
@Setter
public class ContatoDTO {

    private UUID id; 

    @NotBlank
    private String nome;

    @Email
    private String email;

    private String telefone;

    @NotBlank
    private String mensagem;
    
    private LocalDateTime dataEnvio = LocalDateTime.now();
    private boolean lido = false;
}