package com.github.lgustavobarre351.study_api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping; // Serve para mapear o método GET
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping; // Serve para mapear a URL
import org.springframework.web.bind.annotation.RestController; // Serve para indicar que a classe é um controlador REST

@RestController // Indica que a classe é um controlador REST
@RequestMapping("produtos") // Mapeia a URL

public class ControllerProduto { 



    @PostMapping
    public ResponseEntity <String> create() {
        return ResponseEntity.status(201).body("Produto criado!");
    }

    @PutMapping
    public ResponseEntity <String> update() {
        return ResponseEntity.status(200).body("Produto atualizado!");
    }

    @GetMapping  // O browser só aceita GET e POST mappings 
    public ResponseEntity <String> find() {
        return ResponseEntity.status(200).body("Produto encontrado!");
    }

    @DeleteMapping
    public ResponseEntity <Void> delete() {
        return ResponseEntity.status(204).build();
    }

}