/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.figurasgeometricas;

/**
 *
 * @author aluno
 */
public abstract class CorDePreenchimentoDecorator extends Desenhar{ //meu construtor pra esse decorator
    public CorDePreenchimentoDecorator (Desenhar desenhar){
        this.desenhar = desenhar;
    }
    
    
    private Desenhar desenhar;
    
    public Desenhar getDesenhar(){
        return desenhar;
    }
    public void setDesenhar(Desenhar desenhar){
        this.desenhar = desenhar;
    }
    
   
}
