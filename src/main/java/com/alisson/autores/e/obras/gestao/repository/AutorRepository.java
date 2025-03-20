package com.alisson.autores.e.obras.gestao.repository;

import com.alisson.autores.e.obras.gestao.autores.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepository extends JpaRepository<Autor, Long>{
}
