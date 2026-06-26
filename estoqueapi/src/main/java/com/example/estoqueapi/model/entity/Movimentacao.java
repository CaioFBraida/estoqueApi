package com.example.estoqueapi.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Movimentacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer quantidade;
    private String dataHora;  // RF 11 — histórico de movimentações

    @ManyToOne
    private ItemEstoque itemEstoque; // (EstoqueFilial)

    private TipoMovimentacao tipo; // ENTRADA | SAIDA | AJUSTE

}
