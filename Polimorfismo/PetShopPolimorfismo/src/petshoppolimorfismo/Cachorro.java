/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petshoppolimorfismo;

/**
 *
 * @author gusta
 */
public class Cachorro extends Pet{ // classe filha 
    private boolean pedigree;
    
    public void setPedigree(boolean pedigree){
        this.pedigree = pedigree;
    
    }
    public boolean isPedigree(){
        return this.pedigree;
    }
    
    
    
    
    
}
