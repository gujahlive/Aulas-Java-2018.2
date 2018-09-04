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
public class Gato extends Pet{
    @Override
    public double calcularBanho(){
        if(this.peso <= 5){
            return 30;
        }else{
            return 45;
        }
    }
}
