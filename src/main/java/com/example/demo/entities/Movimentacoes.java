package com.example.demo.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "TB_MOVIMENTACOES")
@Getter
@Setter
@EqualsAndHashCode
public class Movimentacoes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tipoMovimentacao;
    private String inicio;
    private String fim;

    @ManyToOne
    @JoinColumn(name = "containers_id")
    private Containers containers;
}
