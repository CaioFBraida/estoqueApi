package com.example.estoqueapi.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Transferencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer quantidade;
    private String data;

    @ManyToOne
    private Produto produto;
    @ManyToOne
    private Filial filialOrigem;
    @ManyToOne
    private Filial filialDestino;

}
