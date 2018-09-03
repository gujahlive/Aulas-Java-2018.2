/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbl2;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author gusta
 */
public class Hospedagem {
   // private String diasDeViagem;//segunda terça quarta - arraylist
    private ArrayList<DiasDaSemana> diasDeViagem;
    private int qtDias;
    private Date data_ida;
    private Date data_volta;
    private float diaria;
    private float valor_total;
   private int contHosp;
    
    public Hospedagem(){
                this.diasDeViagem = new ArrayList<>();
    } 
    public void setDiasDeViagem(ArrayList<DiasDaSemana> diasDeViagem){
      this.diasDeViagem = diasDeViagem;
    }
   public void setDiaDaSemana(DiasDaSemana dia){
        this.contHosp +=1;
        this.diasDeViagem.add(dia);
    }
   public ArrayList<DiasDaSemana> getDiaDaSemana(){
       return this.diasDeViagem;
   }
   public int getContDiasHospedagem(){
       return this.contHosp;
   }
    
    
}
