package com.alisson.autores.e.obras.gestao.service;

import com.alisson.autores.e.obras.gestao.autores.Autor;
import com.alisson.autores.e.obras.gestao.repository.AutorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AutorService {

    private AutorRepository autorRepository;

    public List<Autor> buscarAutores(Autor autor) {
        return autorRepository.findAll();
    }

    public Optional<Autor> buscarAutoresPorId(Long id) {
        return autorRepository.findById(id);
    }

    public Autor cadastrarAutor(Autor autor) {
        return autorRepository.save(autor);
    }

    public void deletarAutor(Long id) {
        autorRepository.deleteById(id);
    }



}
