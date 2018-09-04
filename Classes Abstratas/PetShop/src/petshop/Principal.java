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
        gato.setPeso(12);
        Cachorro cachorro = new Cachorro();
        cachorro.setIdade(0);
        cachorro.setPeso(15);
        Coelho coelho = new Coelho();
        coelho.setNome("bichano");
        cachorro.setNome("bionda");
        gato.setNome("mato gente");
        double valorBanhoCoelho = coelho.calcularBanho();
        double valorBanhoGatito = gato.calcularBanho();
        double valorBanhoDog = cachorro.calcularBanho();
        System.out.println("O valor do banho em "+coelho.getNome()+" foi: "+valorBanhoCoelho); 
        System.out.println("O valor do banho em "+gato.getNome()+" foi: "+valorBanhoGatito);
        System.out.println("O valor do banho em "+cachorro.getNome()+" foi: "+valorBanhoDog);
        
    }
    
}
