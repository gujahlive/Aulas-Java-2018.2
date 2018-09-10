/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbl.pkg3;

import java.util.ArrayList;

/**
 *
 * @author gusta
 */
public class Liquidificador extends Eletrodomestico {
       private Tampa tampa;
       private int qtTampas = 0;
       
       
       
       
        public Liquidificador(String marca, double preco, String voltagem) {
        this.marca = marca;
        this.preco = preco;
        this.voltagem = voltagem;
    }

     public Liquidificador(String marca, String voltagem) {
        this.marca = marca;
        this.voltagem = voltagem;
    }
 
       
       
       
       public void contTampas(){
           this.qtTampas++;
       }
       public int getContTampas(){
           return this.qtTampas;
       }
       
         public void setTampa(Tampa tampa){
        this.tampa= tampa;
        }
         public Tampa getTampa(){
             return this.tampa;
         }
 

    @Override
    public double calcDesconto(int mes) {
        double resultDesc = 0, totalDesc = 0;
        if(mes == 8){
            resultDesc = this.preco * 0.10;
            this.preco = this.preco - resultDesc;
        }
        return resultDesc;
    }

        @Override
    public String validaVoltagem(String volt){
      if (volt == "110"){
            return this.voltagem ="110 volts";
        }else{if(volt == "220"){
            return this.voltagem ="220 volts";
        }
        
        } return "Voltagem invalida";
    }

       
    
}
