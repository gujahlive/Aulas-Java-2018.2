/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concessionaria;

/**
 *
 * @author aluno
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Carro carro1 = new Carro();
       
       carro1.atribuiCor("vermelho");
        System.out.println("Cor: "+carro1.retornaCor());
        // TODO code application logic here
    }
    
}
