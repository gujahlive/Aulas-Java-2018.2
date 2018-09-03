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
       
         public void setTampas(ArrayList<Tampa> tampas){
        this.tampas= tampas;
        }
       public void setTampa(Tampa tampa){
            this.tampas.add(tampa);
        }
       public ArrayList<Tampa> getTampas(){
           return this.tampas;
       }
    
}
