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
    
}
