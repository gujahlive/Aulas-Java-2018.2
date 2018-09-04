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
    
       public FerroDePassar(String marca, float preco, int voltagem) {
        this.marca = marca;
        this.preco = preco;
        this.voltagem = voltagem;
    }

     public FerroDePassar(String marca, int voltagem) {
        this.marca = marca;
        this.voltagem = voltagem;
    }
     public FerroDePassar(){
     }
       
    
}
