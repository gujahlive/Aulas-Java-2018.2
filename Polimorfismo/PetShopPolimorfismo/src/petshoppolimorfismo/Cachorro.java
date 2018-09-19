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
    private String raca;
    
//--------------------------------------------------------------    
    public String getRaca() {
        
        return this.raca;
        
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
    
    
    
    
    
public int CalcularIdade (){
         int idade;
         
         
         idade = 2018 - this.nascimento;
         
        return idade;
        
    }
}
