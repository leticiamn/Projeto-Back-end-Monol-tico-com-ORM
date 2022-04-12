package com.example.querycreation.service;

import java.util.List;

import com.example.querycreation.model.Venda;
import com.example.querycreation.repository.VendaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VendaService {

    @Autowired
    VendaRepository vendaRepository;

    public List<Venda> a() {
        return vendaRepository.findByDescontoNull();
    }

    public List<Venda> b() {
        return vendaRepository.findByDescontoNotNull();
    }

    public List<Venda> c() {
        return vendaRepository.findByOrderByValorUnitario();
    }

    public List<Venda> d() {
        List<Venda> d = vendaRepository.findByOrderByQuantidadeDesc();
        return vendaRepository.findByQuantidadeIs(d.get(0).getQuantidade());
    }

    public List<Venda> e() {
        return vendaRepository.findByQuantidadeGreaterThanEqual(10);
    }

    public List<Integer> f() {
        return vendaRepository.findByNotaFiscalAcimaDe500();
    }
}
