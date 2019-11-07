/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.app.apresentacao;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Aluno
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ClienteModel {
    
    private Long id;
    private String nome;
    private int idade;
    private double limiteCredito;
    private String telefone;
    
}
