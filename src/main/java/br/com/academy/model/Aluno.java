/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.academy.model;

import br.com.academy.Enums.Curso;
import br.com.academy.Enums.Status;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author rafael
 */
@Entity
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "nome")
    @NotBlank(message = "o campo nome não pode ser vazio.")
    @Size(min = 5, max = 35, message = "O nome deve conter no mínimo 5 caracteres")
    private String nome;

    @Column(name = "curso")
    @NotNull(message = "o campo curso não pode ser nulo")
    @Enumerated(EnumType.STRING)
    private Curso curso;

    @Column(name = "matricula")
    @Size(min = 3, message = "clique no botão gerar matricula")
    @NotNull(message = "clique no botão gerar.")
    private String matricula;

    @Column(name = "status")
    @NotNull(message = "o campo status não pode ser nulo")
    @Enumerated(EnumType.STRING)
    private Status status;

    @Column(name = "turno")
    @Size(min = 4, message = "não pode conter menos de 4 caracteres")
    @NotBlank(message = "o campo turno não pode ser vazio.")
    private String turno;

    //encapsulamento
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

}
