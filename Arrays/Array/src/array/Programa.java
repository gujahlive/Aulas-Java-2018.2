/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

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
        /**Criar vetor de 5 posições de Conta no main 
          *Criar repetição com variaveis locais para pegar valores de dono, agencia, limite
          Instanciar posições do vetor, atribuindo valores para eles,
          Imprimir valores de todas as contas
          Criar construtor passando 0 para o saldo*/
        
        // TODO code application logic here
        int i;
        String dono;
       // double limite;
       // double saldo;
       // String agencia;
        /*Conta[] contas = new Conta[5];//
        contas[0] = new Conta();
        contas[0].setDono("Gu");*/
        Conta[] contas = new Conta[2];
        for (i=0;i<2;i++){
            contas[i] = new Conta();
            dono = JOptionPane.showInputDialog("Dono: ");//atribuindo valor para variavel local
            contas[i].setDono(dono);
            contas[i].setLimite(Double.parseDouble(JOptionPane.showInputDialog("Limite: ")));
            contas[i].setAgencia(JOptionPane.showInputDialog("Agencia: "));
        }
        for(i=0 ; i<2 ;i++){
            System.out.println("Dono: "+contas[i].getDono());
            System.out.println("Limite: "+contas[i].getLimite());
            System.out.println("Agencia: "+contas[i].getAgencia());
            System.out.println("\n");
            
        }
        
        
    }
    
}
