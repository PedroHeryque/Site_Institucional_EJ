package com.include.inovale.landingpage.models.entities;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
@Table(name= "cassos_sucessos")
public class CasosSuceso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nomeProjeto;

    private String cliente; //Nome da empresa ou pessoa fisica.

    @Column(columnDefinition = "TEXT")
    private String descricaoSolucao; // Descrição da solução implementada.

    @Column(columnDefinition = "TEXT")
    private String depoimentoCliente; // Depoimento do cliente sobre o projeto.

    private String imagemUrl; 

    @ManyToOne
    @JoinColumn(name = "servico_id")
    private Servico servico; // Relação com a entidade servicos

}

