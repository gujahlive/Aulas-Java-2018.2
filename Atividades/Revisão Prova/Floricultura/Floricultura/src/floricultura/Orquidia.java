/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package floricultura;

/**
 *
 * @author gusta
 */
public class Orquidia extends Planta {

    @Override
    public boolean regar(int diaRegado) {
        if(diaRegado > 3.5){
            return true;
        }
        return false;
    }

    @Override
    public boolean adubar(int diaAdubado) {
         if(diaAdubado > 175){
            return true;
        }
        return false;
    }
   // public Orquidia(){
    //}
    
}
