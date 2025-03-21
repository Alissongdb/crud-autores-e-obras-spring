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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(LocalDate dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public List<Obra> getObras() {
        return obras;
    }

    public void setObras(List<Obra> obras) {
        this.obras = obras;
    }

    public Autor(Long id, Sexo sexo, String nome, String email, LocalDate dtNascimento, String paisOrigem, Integer cpf, List<Obra> obras) {
        this.id = id;
        this.sexo = sexo;
        this.nome = nome;
        this.email = email;
        this.dtNascimento = dtNascimento;
        this.paisOrigem = paisOrigem;
        this.cpf = cpf;
        this.obras = obras;
    }

    public Autor() {}
}
