
package com.springboot.demo.events.java.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "WEB_EVENTOS")
public class EventoModel implements Serializable {

    private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    private long id;
    @Column(nullable = false, unique = true, length = 10)

    private String nome;
    @Column(nullable = false, unique = true, length = 50)

    private String vagas;
    @Column(nullable = false, length = 10)

    private String dataInicio;
    @Column(nullable = false, length = 10)

    private String dataFim;

    @Column(nullable = false, length = 10)

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getVagas() {
        return vagas;
    }

    public void setVagas(String vagas) {
        this.vagas = vagas;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }
}
