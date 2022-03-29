package br.edu.iftm.manytoone;

import java.time.LocalDate;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Entity;

@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Double valorInicial;
    private LocalDate encerramento;
    @ManyToOne // Hibernate adiciona chave estrangeira --> cria coluna categoria_id
    private Categoria categoria;

    // contrutores e getters e setters
    public Item(Integer id, String name, Categoria c1ategoria) {
        this.id = id;
        this.name = name;
        this.categoria = categoria;
    }

    public Item() {
    };
}
