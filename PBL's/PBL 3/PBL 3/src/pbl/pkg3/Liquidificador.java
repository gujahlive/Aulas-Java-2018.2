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
       private ArrayList<Tampa> tampas;
       private int qtTampas = 0;
       
       
       
        public Liquidificador(String marca, float preco, int voltagem) {
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
         public Liquidificador(){
                    this.tampas = new ArrayList<>();
        } 
       
         public void setTampas(ArrayList<Tampa> tampas){
        this.tampas= tampas;
        }
       public void setTampa(Tampa tampa){
            this.tampas.add(tampa);
        }
       public ArrayList<Tampa> getTampa(){
           return this.tampas;
       }

    @Override
    public double calcDesconto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



       
    
}
