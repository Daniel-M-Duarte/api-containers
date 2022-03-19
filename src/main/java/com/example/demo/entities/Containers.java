package com.example.demo.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "TB_CONTAINER")
@Getter
@Setter
@EqualsAndHashCode
public class Containers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cliente;
    private String containerNum;
    private String tipo;
    private String status;
    private String categoria;
}
