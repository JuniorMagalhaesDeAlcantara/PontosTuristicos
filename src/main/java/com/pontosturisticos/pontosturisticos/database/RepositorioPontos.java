package com.pontosturisticos.pontosturisticos.database;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pontosturisticos.pontosturisticos.entidade.PontoTuristico;

public interface RepositorioPontos extends JpaRepository<PontoTuristico, Long> {
    
}
