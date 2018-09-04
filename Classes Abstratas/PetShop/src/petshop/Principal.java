/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petshop;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       //  Pet pet = new Pet();

        Gato gato = new Gato();
        gato.setPeso(0);
        Cachorro cachorro = new Cachorro();
        cachorro.setIdade(0);
        Coelho coelho = new Coelho();
        coelho.setNome("bichano");
        
         
    }
    
}
