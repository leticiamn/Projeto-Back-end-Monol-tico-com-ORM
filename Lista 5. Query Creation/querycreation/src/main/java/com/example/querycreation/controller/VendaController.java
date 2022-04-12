package com.example.querycreation.controller;

import java.util.List;

import com.example.querycreation.model.Venda;
import com.example.querycreation.service.VendaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("venda")
public class VendaController {

    @Autowired
    VendaService vendaService;

    @GetMapping("a")
    ResponseEntity<List<Venda>> exa() {
        return ResponseEntity.status(HttpStatus.OK).body(vendaService.a());
    }

    @GetMapping("b")
    ResponseEntity<List<Venda>> exb() {
        return ResponseEntity.status(HttpStatus.OK).body(vendaService.b());
    }

    @GetMapping("c")
    ResponseEntity<List<Venda>> exc() {
        return ResponseEntity.status(HttpStatus.OK).body(vendaService.c());
    }

    @GetMapping("d")
    ResponseEntity<List<Venda>> exd() {
        return ResponseEntity.status(HttpStatus.OK).body(vendaService.d());
    }

    @GetMapping("e")
    ResponseEntity<List<Venda>> exe() {
        return ResponseEntity.status(HttpStatus.OK).body(vendaService.e());
    }

    @GetMapping("f")
    ResponseEntity<List<Integer>> exf() {
        return ResponseEntity.status(HttpStatus.OK).body(vendaService.f());
    }
}
