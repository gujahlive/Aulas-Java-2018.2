/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package framework;

/**
 *
 * @author aluno
 */
public class Tablet extends Dispositivo {
    
        @Override
    public double redimensionar() { 
          this.conteudo.setTamanho(this.conteudo.getTamanho() * 0.3);
           return this.conteudo.getTamanho();
    
    }
 

    
}
