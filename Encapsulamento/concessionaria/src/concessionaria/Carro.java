/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concessionaria;

/**
 *
 * @author aluno
 */
public class Carro {
    
    String modelo;
    String marca;
    int ano;
   private String cor;
    
    
    void atribuiCor(String cor){ //setCor set atribui
        this.cor = cor;
    }
    String retornaCor(){ // getCor get retorna
        return this.cor;
    }
    
    
}
