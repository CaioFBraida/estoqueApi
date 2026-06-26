package com.example.estoqueapi.model.entity;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String codigoBarras;

    private BigDecimal preco;
    private Boolean ativo; // RF 10 — inativar/reativar
    private Integer quantidadeMinima; // RF 08 — limiar de alerta de estoque baixo

    @ManyToOne
    private Categoria categoria; // RF 02-03
}
