package com.alisson.autores.e.obras.gestao.obras;

import com.alisson.autores.e.obras.gestao.autores.Autor;
import jakarta.persistence.*;
import lombok.Data;
import org.antlr.v4.runtime.misc.NotNull;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "obra")
public class Obra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String nome;

    private String descricao;

    @NotNull
    private LocalDate dtPublicacao;

    @ManyToOne
    @JoinColumn(name = "autor_id")
    private Autor autor;
}
