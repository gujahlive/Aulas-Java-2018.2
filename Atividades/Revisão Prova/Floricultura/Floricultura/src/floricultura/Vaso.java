/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package floricultura;

//import java.util.ArrayList;

/**
 *
 * @author gusta
 */
public class Vaso {
    
    private String tamanho, material; 
    private double valor;

    public double getValor() {
        return this.valor;
    }
      public String getTamanho() {
        return this.tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getMaterial() {
        return this.material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setValor() {
        if(this.material == "plastico" && this.tamanho == "P" || this.tamanho == "M"){
            this.valor = 4;
        }
        if(this.material == "plastico" && this.tamanho == "G"){ //azaleia material plastico tam g return 16
            this.valor = 6;
        }
        if(this.material == "barro" && this.tamanho == "P" || this.tamanho == "M"){
            this.valor = 8;
        }
        if(this.material == "barro" && this.tamanho == "G"){
            this.valor = 10;
        }
  
    }
   
  
    /**
     *
     */

    
  
    
}
