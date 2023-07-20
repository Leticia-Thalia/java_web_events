package com.springboot.demo.events.java.service;

import com.springboot.demo.events.java.model.EventoModel;
import com.springboot.demo.events.java.repository.EventoRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

/*Não será permitida a inscrição de usuários quando o limite de vagas for atingido;
Não será permitida a inscrição de usuários após o evento ter sido iniciado;
O usuário só poderá entrar no evento no período de uma hora antes do início do evento até a hora de término do evento;
Não será permitido o cancelamento de uma inscrição após o usuário ter realizado a entrada no evento.*/



@Service

public class EventoService {

    final EventoRepository eventoRepository;

    public EventoService(EventoRepository eventoRepository) {
        this.eventoRepository = eventoRepository;
    }
    @Transactional
    public Object save(EventoModel eventoModel) {
        return eventoRepository.save(eventoModel);
    }


//    public Page<EventoModel> findALL(Pageable pageable) {
//        return eventoRepository.findAll(pageable);
//    }
//
//    public Optional<EventoModel> findById(Long id) {
//        return eventoRepository.findById(id);
//    }
//
//    @Transactional
//    public void delete(EventoModel eventoModel) {
//        eventoRepository.delete(eventoModel);
//    }
}