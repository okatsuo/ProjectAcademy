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
public enum Status {
    
    ATIVO("Ativo"),
    INATIVO("Inativo"),
    TRANCADO("Trancado"),
    CANCELADO("Cancelado");
    
    private String status;

    private Status(String status) {
        this.status = status;
    }
    
    
    
}
