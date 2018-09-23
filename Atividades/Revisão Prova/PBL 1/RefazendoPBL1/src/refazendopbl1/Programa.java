/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refazendopbl1;

import javax.swing.JOptionPane;

/**
 *
 * @author gusta
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // HeartRates hr = new HeartRates("Guguinha","Ferreira",25,11,1996);
       HeartRates hr = new HeartRates(JOptionPane.showInputDialog("Nome: ","Guguinha"),JOptionPane.showInputDialog("Sobrenome: ","Ferreira"),Integer.parseInt(JOptionPane.showInputDialog("Dia Nascimento: ","25")),Integer.parseInt(JOptionPane.showInputDialog("Mes Nascimento: ","11")),Integer.parseInt(JOptionPane.showInputDialog("Ano Nascimento: ","1996")));
       int idade = hr.calculaIdade(Integer.parseInt(JOptionPane.showInputDialog("Dia Atual: ","22")),Integer.parseInt(JOptionPane.showInputDialog("Mes Atual: ","9")),Integer.parseInt(JOptionPane.showInputDialog("Ano Nascimento: ","2018")));
       
       System.out.println("Nome: "+hr.getNome());
        System.out.println("Sobrenome: "+hr.getSobrenome());
        System.out.println("Dia: "+hr.getDia());
        System.out.println("Mes: "+hr.getMes());
        System.out.println("Ano: "+hr.getAno());
        System.out.println("Idade: "+ hr.calculaIdade(22, 9, 2018));
        System.out.println("Idade: "+idade);
        System.out.println("Frequencia cardiaca max: "+hr.calcFreqCardMax());
        System.out.println("50% da frequencia max: "+hr.calc50porcento());
        System.out.println("85% da frequencia max: "+hr.calc85porcento());
        System.out.println("Frequencia alvo: "+hr.calcFreqCardAlvo());
        // TODO code application logic here
        
     
    }
    
}
