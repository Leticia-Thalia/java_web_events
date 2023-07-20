package com.springboot.demo.events.java.controller;

import com.springboot.demo.events.java.service.EventoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//*****CRUD****
//Operações básicas que deverão ser criadas:
//Realizar a criação de um evento;
//Realizar a operação de inscrição de um usuário em um evento;
//Realizar o cancelamento de uma inscrição de um usuário em um evento;
//Listar os inscritos de um evento;
//Realizar entrada do usuário no evento.*/

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/eventos-events")
public class EventoController {

    final EventoService eventoService;

    public EventoController(EventoService eventoService) {
        this.eventoService = eventoService;
    }
}