/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.academy.Enums;

/**
 *
 * @author rafael
 */
public enum Curso {
    
    ADMINISTRACAO("Administracao"),
    INFORMATICA("Informatica"),
    CONTABILIDADE("Contabilidade"),
    PROGRAMACAO("Programacao"),
    ENFERMAGEM("Enfermagem");
    
    private String curso;

    private Curso(String curso) {
        this.curso = curso;
    }
    
    
}
