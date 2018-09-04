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
        cachorro.setPeso(9);
        Coelho coelho = new Coelho();
        coelho.setNome("bichano");
        cachorro.setNome("bionda");
        gato.setNome("mato gente");
        
        Dono dono1 = new Dono();
        dono1.setNome("gugu");
        dono1.setTelefone("719999999");
        gato.setDono(dono1);
        cachorro.setDono(dono1);
        
        Dono dono2 = new Dono();
        dono2.setNome("eu");
        dono2.setTelefone("123");
        coelho.setDono(dono2);
        double valorBanhoCoelho = coelho.calcularBanho();
        double valorBanhoGatito = gato.calcularBanho();
        double valorBanhoDog = cachorro.calcularBanho();
       
        double valorDevolverC = coelho.devolverPet();
        double valorDevolverD = cachorro.devolverPet();
        double valorDevolverG = gato.devolverPet();
        
        System.out.println("O valor do banho em "+coelho.getNome()+" foi: "+valorBanhoCoelho+"Valor de devolução"+valorDevolverC); 
        System.out.println("O valor do banho em "+gato.getNome()+" foi: "+valorBanhoGatito+"Valor de devolução"+valorDevolverC);
        System.out.println("O valor do banho em "+cachorro.getNome()+" foi: "+valorBanhoDog+"Valor de devolução"+valorDevolverC);
        
    }
    
}
