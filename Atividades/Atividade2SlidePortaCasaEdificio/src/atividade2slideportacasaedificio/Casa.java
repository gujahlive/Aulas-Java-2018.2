/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade2slideportacasaedificio;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class Casa {
    private String cor;
    private int qtPortas,qTPortasAbertas;
    private ArrayList<Porta> portas;
    
      public Casa(){
            this.portas = new ArrayList<>();
        } 
   
    public void setQtPortas(int qtPortas) {
        this.qtPortas = qtPortas;
    }

    public void pinta(String cor){
        this.cor = cor;
    }
     public void setCor(String cor) {
        this.cor = cor;
    }
     public int qtPortasEstaoAbertas(){
         return this.qTPortasAbertas; // instaciar a porta aqui
     }
     public int totalDePortas(){
         return this.qtPortas;
     }
     public void cadastrarPortas(Porta porta){
         this.portas.add(porta);
     }
     
    public void setPortas(ArrayList<Porta> portas){
        this.portas = portas;
    }
     public void setPorta(Porta porta){
        this.portas.add(porta);
    }
   public ArrayList<Porta> getPortas(){
       return this.portas;
   }
     
}
