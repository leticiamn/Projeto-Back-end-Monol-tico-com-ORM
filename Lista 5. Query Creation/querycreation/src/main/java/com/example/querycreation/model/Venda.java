package com.example.querycreation.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Venda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "id_nf")
    private Integer idNotaFiscal;

    @Column(name = "id_item")
    private Integer idItem;

    @Column(name = "cod_prod")
    private Integer codigoDoProduto;

    private Integer quantidade, desconto;

    @Column(name = "valor_unit")
    private Double valorUnitario;

}
