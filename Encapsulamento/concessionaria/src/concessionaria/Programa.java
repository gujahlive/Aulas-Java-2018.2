/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concessionaria;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Carro carro1 = new Carro(JOptionPane.showInputDialog("Informe a cor:"),JOptionPane.showInputDialog("Informe o modelo: "),Float.parseFloat(JOptionPane.showInputDialog("Infome a velocidade")));
       
       //carro1.atribuiCor("vermelho");
        System.out.println("Cor: "+carro1.retornaCor()+" Modelo: "+carro1.getModelo()+" Velocidade: "+carro1.getVelocidade());
        // TODO code application logic here
    }
    
}
