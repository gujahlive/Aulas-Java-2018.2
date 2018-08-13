/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadecarro;

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
        
        
        Carro carro1 = new Carro();
        carro1.ligado = Boolean.parseBoolean(JOptionPane.showInputDialog("1 - Sim \n 0 - Não"));
       
        
         
        carro1.velocidadeAtual = Double.parseDouble(JOptionPane.showInputDialog("Digite a Velocidade Atual do carro"));
        int marcha = carro1.pegaMarcha();
        System.out.println("O Carro está na marcha: "+marcha+" velocidade: "+carro1.velocidadeAtual);
        double acelerou = Double.parseDouble(JOptionPane.showInputDialog("Acelere papai..."));
        carro1.acelera(acelerou);
        marcha = carro1.pegaMarcha();
        System.out.println("O Carro está na marcha: "+marcha+" velocidade: "+carro1.velocidadeAtual);
        
    }
    
}
