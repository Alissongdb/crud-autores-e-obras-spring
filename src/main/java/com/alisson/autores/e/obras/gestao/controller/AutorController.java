package com.alisson.autores.e.obras.gestao.controller;

import com.alisson.autores.e.obras.gestao.autores.Autor;
import com.alisson.autores.e.obras.gestao.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/autor")
public class AutorController {

    @Autowired
    private AutorService autorService;

    @PostMapping
    public ResponseEntity<Autor> cadastrarAutores(@RequestBody Autor autor) {
        return ResponseEntity.ok(autorService.cadastrarAutor(autor));
    }

    @GetMapping
    public ResponseEntity<List<Autor>> buscarAutores() {
        return ResponseEntity.ok(autorService.buscarAutores());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarAutores(@PathVariable Long id) {
        autorService.deletarAutor(id);
        return ResponseEntity.noContent().build();
    }

}