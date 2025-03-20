package com.alisson.autores.e.obras.gestao.dtos;

import com.alisson.autores.e.obras.gestao.autores.Sexo;
import lombok.Data;


import java.time.LocalDate;

@Data
public class AutorDTO {

    private Long id;

    private String nome;

    private Sexo sexo;

    private String email;

    private LocalDate dtNascimento;

    private String paisOrigem;

    private Integer cpf;
}
