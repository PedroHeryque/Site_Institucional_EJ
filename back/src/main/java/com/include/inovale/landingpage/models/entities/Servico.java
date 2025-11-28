package com.include.inovale.landingpage.models.entities;
import jakarta.persistence.*;

@Entity
@Table(name="servico")//criando tabela banco de dados
public class Servico{

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;

      private String titulo;   

    @Column(columnDefinition="TEXT")
    private String descricao;

    private String imagemUrl;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
    public String getImagemUrl() { return imagemUrl; }
    public void setImagemUrl(String imagemUrl) { this.imagemUrl = imagemUrl; }
}
