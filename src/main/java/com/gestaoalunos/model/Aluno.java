package com.gestaoalunos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
public class Aluno {

    @Id
    @GeneratedValue
    private Long id;

    @NotBlank(message = "O nome é obrigatório")
    private String nome;

    @NotNull
    @Email
    private String email;

    @NotNull
    private Integer matricula;

    @NotNull
    private String curso;

    public Aluno() {
    }

    //getters e setters
    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

}
