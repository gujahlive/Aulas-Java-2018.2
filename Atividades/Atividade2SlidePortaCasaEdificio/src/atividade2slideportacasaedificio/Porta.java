/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade2slideportacasaedificio;

/**
 *
 * @author aluno
 */
public class Porta {
   private boolean aberta;
   private String cor;
   private float dimensaoX;
   private float dimensaoY;
   private float dimensaoz;
   
   public void abre(){
       this.aberta = true;
   }
   public void fecha(){
       this.aberta = false;
   }
   
   public boolean estaAberta(){
      return this.aberta;
    
   }
   
   public void pinta(String cor){
       this.cor = cor;
   }
   public String getCor(){
       return this.cor;
   }
    
    
}
