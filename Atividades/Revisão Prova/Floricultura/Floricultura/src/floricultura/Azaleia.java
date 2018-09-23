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
public class Azaleia extends Planta {
    
    @Override
    public boolean regar(int diaRegado) {
        if(diaRegado > 1){
            return true;
        }
        return false;
    }
    
    @Override
    public boolean adubar(int diaAdubado) {
         if(diaAdubado > 90){
            return true;
        }
        return false;
    }

}
