package com.alisson.autores.e.obras.gestao.autores;

import com.alisson.autores.e.obras.gestao.obras.Obra;
import jakarta.persistence.*;
import lombok.Data;
import org.antlr.v4.runtime.misc.NotNull;

import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@Table(name = "autor")
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String nome;

    private Sexo sexo;

    private String email;

    private LocalDate dtNascimento;

    @NotNull
    private String paisOrigem;

    private Integer cpf;

    @OneToMany(mappedBy = "autor", cascade = CascadeType.ALL)
    private List<Obra> obras;

}
