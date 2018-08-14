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
    float velocidadeMax;
   private String cor;// modificador de acesso private
   
   public Carro(String cor,String modelo, float velocidadeMax){
        this.cor = cor;
        this.modelo = modelo;
        this.velocidadeMax = velocidadeMax; 
    
    }
    
    void atribuiCor(String cor){ //setCor set atribui // set VOID para a atribuição
        this.cor = cor;
    }
    String retornaCor(){ // getCor get retorna // get Tipo do retorno sempre.
        return this.cor;
    }
    
    String getModelo(){ // getCor get retorna // get Tipo do retorno sempre.
        return this.modelo;
    }
    float getVelocidade(){
        return this.velocidadeMax;
    }
    
  
}
