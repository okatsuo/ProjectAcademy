/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.academy.dao;

import br.com.academy.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author rafael
 */
public interface AlunoDao extends JpaRepository<Aluno, Integer>{
    
}
