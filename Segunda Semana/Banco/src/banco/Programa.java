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
        Conta conta2 = new Conta();
        conta1.agencia = "1234-1";
        conta1.cpf = "123456789";
        conta1.numero = "123456";
        conta1.saldo = 100; 
        conta1.limite = 200;
        //conta2.saldo = 100; 
        System.out.println("Saldo Anterior: "+ conta1.saldo);
       // conta1.saca(200);
        //System.out.println("Saldo Atal: "+ conta1.saldo);
        double quantidade = Double.parseDouble(JOptionPane.showInputDialog("Digite Saque"));//convertendo com o parse o JOptionpane
        conta1.saca(quantidade,conta1.limite);// objeto conta1 chamando método saca.
        
        
        System.out.println("Saldo Atal: "+ conta1.saldo+" Permitir saque: "+ conta1.permitirSaque);
        
        
        
        /*double quantidadeDeposite = Double.parseDouble(JOptionPane.showInputDialog("Digite Deposito"));//convertendo com o parse o JOptionpane
        conta1.deposita(quantidadeDeposite);
        System.out.println("Saldo Atal: "+ conta1.saldo);
        
        
        //conta2.saca(20);
        System.out.println("saldo conta 2: " +conta2.saldo);*/
        
        
    }
    
}
