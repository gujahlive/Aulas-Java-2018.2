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
public class Batedeira extends Eletrodomestico{
    private int qtHelices;
    
    public Batedeira(String marca, double preco, String voltagem) {
        this.marca = marca;
        this.preco = preco;
        this.voltagem = voltagem;
    }

     public Batedeira(String marca, String voltagem) {
        this.marca = marca;
        this.voltagem = voltagem;
    }
     public Batedeira(){
     }
    
    
       @Override
    public double calcDesconto(int mes) {
        double resultDesc = 0, totalDesc = 0;
        if(mes == 12){
            resultDesc = this.preco * 0.20;
            this.preco = this.preco - resultDesc;
        }
        return resultDesc;
    }
    
    @Override
    public String validaVoltagem(String volt){
        if (volt == "110"){
            return  this.voltagem = "110 volts";
        }else{if(volt == "220"){
            return this.voltagem = "220 volts";
        }
        
        } return "Voltagem invalida";
    }

    public int getQtHelices() {
        return this.qtHelices;
    }

    public void setQtHelices(int qtHelices) {
        this.qtHelices = qtHelices;
    }
    @Override
    public double mediaDeLtBatido(double qtL, double capacidade,double seg){
       double result = 0 ;
        if(this.qtHelices > 1 ){    
             result = super.mediaDeLtBatido(qtL, capacidade,seg) * this.qtHelices;
        }
        return result;
    }
    
}
