/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

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
        
        Conta conta1 = new Conta();
        conta1.agencia = "1234-1";
        conta1.cpf = "123456789";
        conta1.numero = "123456";
        conta1.saldo = 100000; 
        System.out.println("Saldo Anterior: "+ conta1.saldo);
        conta1.saca(200);
        System.out.println("Saldo Atal: "+ conta1.saldo);
        double quantidade = Double.parseDouble(JOptionPane.showInputDialog("Digite um Valor"));
        conta1.saca(quantidade);
        System.out.println("Saldo Atal: "+ conta1.saldo);
        
        
    }
    
}
