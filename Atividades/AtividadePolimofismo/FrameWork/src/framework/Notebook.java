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
public class Notebook extends Dispositivo{
    
    
        @Override
    public double redimensionar() { 
           return this.conteudo.getTamanho()*2;
    }



}
