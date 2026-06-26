package com.example.estoqueapi.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GerenteDeCompras extends Usuario{

    @ManyToOne
    private Filial filial; // na qual ele é gerente
}
