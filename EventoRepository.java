package com.springboot.demo.events.java.repository;

import com.springboot.demo.events.java.model.EventoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EventoRepository extends JpaRepository <EventoModel, Long> {

    boolean existsByNome(String nome);

}