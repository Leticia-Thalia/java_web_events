//    @ManyToOne
//    private EventoModel eventoModel;

//    public UsuarioModel(EventoModel eventoModel) {
//        this.eventoModel = eventoModel;
//    }

package com.springboot.demo.events.java.model;

import jakarta.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "EVENTOS_WEB_USUARIO")
public class UsuarioModel implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idUsuario;
    @Column(nullable = false, unique = true, length = 10)

    private String nome;

    @Column(nullable = false, unique = true, length = 50)

    public long getId() {
        return idUsuario;
    }

    public void setId(long id) {
        this.idUsuario = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNomeUsuario(String nome) {
        this.nome = nome;
    }

}