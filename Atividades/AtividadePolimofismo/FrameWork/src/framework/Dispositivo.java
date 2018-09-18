/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package framework;

//import java.util.ArrayList;

import java.util.ArrayList;


/**
 *
 * @author aluno
 */
public abstract class Dispositivo   {
    protected ArrayList<Conteudo> conteudos;
    
  
   
    
    public ArrayList<Conteudo> getConteudos() {
        return this.conteudos;
    }

    public void setConteudo(Conteudo conteudo) {
        this.conteudos.add(conteudo);
    }
    
     public void setConteudo(ArrayList<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }
          
    public abstract ArrayList<Double>  redimensionar();

   
}
