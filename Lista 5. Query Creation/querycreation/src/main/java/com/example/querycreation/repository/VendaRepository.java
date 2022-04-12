package com.example.querycreation.repository;

import java.util.List;

import com.example.querycreation.model.Venda;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendaRepository extends CrudRepository<Venda, Integer> {
    // a - Retorna todos os itens que foram vendidos sem desconto.
    public List<Venda> findByDescontoNull();

    // b- Retorna todos os itens que foram vendidos com desconto.
    public List<Venda> findByDescontoNotNull();

    // c- Retorna todos os itens e ordene o resultado do maior valor para o menor.
    public List<Venda> findByOrderByValorUnitario();

    // d - Retorna o produto que mais vendeu.
    public List<Venda> findByOrderByQuantidadeDesc();

    public List<Venda> findByQuantidadeIs(Integer quantidade);

    // e - Consulte as NF que foram vendidas mais de 10 unidades de pelo menos um
    // produto.
    public List<Venda> findByQuantidadeGreaterThanEqual(Integer quantidade);

    // f - Pesquise o valor total das NF, onde esse valor seja maior que 500, e
    // ordene o resultado do maior valor para o menor.
    /*
     * Query no SQL: select id_nf, sum(quantidade*valor_unit) as soma from venda
     * group by id_nf having soma > 500 order by soma
     */
    @Query("select v.idNotaFiscal from Venda v group by idNotaFiscal having sum(quantidade*valorUnitario) > 500 order by sum(quantidade*valorUnitario)")
    public List<Integer> findByNotaFiscalAcimaDe500();
}
