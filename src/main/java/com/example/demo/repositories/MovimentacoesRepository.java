package com.example.demo.repositories;

import com.example.demo.entities.Movimentacoes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovimentacoesRepository extends JpaRepository<Movimentacoes,Long> {
}
