package com.alisson.autores.e.obras.gestao.dtos;

import lombok.Data;

import java.time.LocalDate;

@Data
public class ObraDTO {

    private Long id;

    private String nome;

    private String descricao;

    private LocalDate dtPublicacao;
}
