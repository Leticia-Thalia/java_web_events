package com.springboot.demo.events.java.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*Operações básicas que deverão ser criadas:
Realizar a criação de um usuário;
Realizar a operação de inscrição de um usuário em um evento;
Realizar o cancelamento de uma inscrição de um usuário em um evento;
Listar as inscrições de um usuário;
Realizar entrada do usuário no evento.*/

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/usuario")

public class UsuarioController {

}
