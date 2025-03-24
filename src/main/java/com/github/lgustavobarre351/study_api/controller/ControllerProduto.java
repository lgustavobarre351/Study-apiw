package com.github.lgustavobarre351.study_api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping; // Serve para mapear o método GET
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping; // Serve para mapear a URL
import org.springframework.web.bind.annotation.RestController; // Serve para indicar que a classe é um controlador REST
import com.github.lgustavobarre351.study_api.service.ProdutoService;
import com.github.lgustavobarre351.study_api.model.Produto;
import org.springframework.beans.factory.annotation.Autowired;


@RestController
@RequestMapping("produtos")
public class ControllerProduto {

    @Autowired
    private ProdutoService produtoService = new ProdutoService();

    @PostMapping
    public ResponseEntity<Produto> create(@RequestBody Produto request) {
        Produto produto = produtoService.save(request);
        return  ResponseEntity.status(201).body(produto);
}

    @PutMapping
    public ResponseEntity <Produto> update() {
        Produto produto = new Produto();
        return ResponseEntity.status(200).body(produto);
    }

    @GetMapping  // O browser só aceita GET e POST mappings 
    public ResponseEntity <Produto> find() {
        Produto produto = new Produto();  
        return ResponseEntity.status(200).body(produto);
    }

    @DeleteMapping
    public ResponseEntity <Void> delete() {
        return ResponseEntity.status(204).build();
    }

}