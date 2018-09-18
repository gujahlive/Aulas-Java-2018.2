/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package framework;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class Paragrafo extends Conteudo{
  
    protected ArrayList<Integer> paragrafos; 
    /*   public Paragrafo(){
    paragrafos = new ArrayList<>();
    }*/
    
    public Paragrafo(double tamanho, String cor) {
        super(tamanho, cor);
    }
    
}
