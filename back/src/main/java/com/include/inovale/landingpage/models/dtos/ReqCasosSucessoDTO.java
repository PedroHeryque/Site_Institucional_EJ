package com.include.inovale.landingpage.models.dtos;

import java.util.UUID;
import lombok.Data;

@Data
public class ReqCasosSucessoDTO {
    private String nomeProjeto; 
    private String cliente;
    private String descricaoSolucao;
    private String depoimentoCliente;
    private String imagemUrl;
    private UUID idServico;
}