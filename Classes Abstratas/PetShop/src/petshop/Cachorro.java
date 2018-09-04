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
        return 1;
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
    
}
