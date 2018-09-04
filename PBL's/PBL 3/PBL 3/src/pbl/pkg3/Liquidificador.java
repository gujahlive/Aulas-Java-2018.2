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
       
       
       
        public Liquidificador(String marca, double preco, int voltagem) {
        this.marca = marca;
        this.preco = preco;
        this.voltagem = voltagem;
    }

     public Liquidificador(String marca, int voltagem) {
        this.marca = marca;
        this.voltagem = voltagem;
    }
 
       
       
       
       public void contTampas(){
           this.qtTampas++;
       }
       public int getContTampas(){
           return this.qtTampas;
       }
       
         public void setTampas(Tampa tampa){
        this.tampa= tampa;
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
    public int validaVoltagem(int volt){
          if (volt == 110){
            return 110;
        }else return 220;
    }

       
    
}
