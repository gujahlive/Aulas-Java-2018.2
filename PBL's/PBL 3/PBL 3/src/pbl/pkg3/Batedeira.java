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
    
    public Batedeira(String marca, float preco, int voltagem) {
        this.marca = marca;
        this.preco = preco;
        this.voltagem = voltagem;
    }

     public Batedeira(String marca, int voltagem) {
        this.marca = marca;
        this.voltagem = voltagem;
    }
     public Batedeira(){
     }
    
    public double desconto(int mes){
        double result;
        if(mes == 5 ){
            result = this.preco;
        }
        if(mes == 4 ){
            result = preco;
        }
        
        
        return 1;
        
    }
    
}
