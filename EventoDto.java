package com.springboot.demo.events.java.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class EventoDto {
    @NotBlank
    private String nome;

    @NotBlank
    private String vagas;

    @NotBlank
    @Size(max = 8)
    private String dataInicio;

    @NotBlank
    @Size(max = 8)
    private String dataFim;

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


//    public void setRegistrationDate(LocalDateTime utc) {
//    }