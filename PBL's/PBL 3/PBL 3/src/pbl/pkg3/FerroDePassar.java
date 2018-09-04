/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbl.pkg3;

/**
 *
 * @author gusta
 */
public class FerroDePassar extends Eletrodomestico{
    
       public FerroDePassar(String marca, double preco, String voltagem) {
        this.marca = marca;
        this.preco = preco;
        this.voltagem = voltagem;
    }

     public FerroDePassar(String marca, String voltagem) {
        this.marca = marca;
        this.voltagem = voltagem;
    }
     public FerroDePassar(){
     }
     
        @Override
    public double calcDesconto(int mes) {
        double resultDesc = 0, totalDesc = 0;
        if(mes == 5){
            resultDesc = this.preco * 0.15;
            this.preco = this.preco - resultDesc;
        }
        return resultDesc;
    }
    
        @Override
    public String validaVoltagem(String volt){
        if (volt == "110"){
            return this.voltagem = "110";
             
        }else{ 
           if(volt == "220"){
               return this.voltagem = "220";
        }else if(volt == "5"){
            return this.voltagem = "5";
        
        }
        }
    
        return this.voltagem = "Voltagem Invalida";
    }

}