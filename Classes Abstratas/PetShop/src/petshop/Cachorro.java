/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petshop;

/**
 *
 * @author aluno
 */
public class Cachorro extends Pet{
    private boolean pedigree;
    
    @Override
    public double calcularBanho(){
        if(this.peso <= 5 ){
            return 20;
        }else{
             if(this.peso <= 10){
                 return 30;
             }else{
                 return 50;
             }
        }
    }
    
    public boolean isPedigree() {
        return this.pedigree;
    }

    public void setPedigree(boolean pedigree) {
        this.pedigree = pedigree;
    }
  
    public int calcIdade(int anoNasc){
        this.idade = 2018 - anoNasc;
    return this.idade;
    }
    @Override
    
    public double devolverPet(){
       double valorInicial=  super.devolverPet();
        
       double  valorFinal = (valorInicial * 0.10) + valorInicial;
       return valorFinal;
       
    }
    
}
