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
        conta2.saldo = 10; 
        int escolha = Integer.parseInt(JOptionPane.showInputDialog("1- Saque\n2- Deposito\n3-Transferir"));
        switch(escolha){
        
            case 1: 
                double quantidade = Double.parseDouble(JOptionPane.showInputDialog("Digite Saque"));//convertendo com o parse o JOptionpane
                conta1.saca(quantidade,conta1.limite);// objeto conta1 chamando método saca.

                if(conta1.permitirSaque == true){
                    if(conta1.saldo<0){
                        System.out.println("Você utilizou uma parte do limite, vc nos deve "+ conta1.saldo);
                    }else System.out.println("Saldo Atal: "+ conta1.saldo+" Permitir saque: "+ conta1.permitirSaque);

                }else System.out.println("Limite de saque excedido, Saldo: "+ conta1.saldo);

                
            break;
            case 2: 
                
                     double quantidadeDeposite = Double.parseDouble(JOptionPane.showInputDialog("Digite Deposito"));//convertendo com o parse o JOptionpane
                      conta1.deposita(quantidadeDeposite);
                      System.out.println("Saldo Atal: "+ conta1.saldo);
                
                
            break;
            
            
            case 3: 
                System.out.println("Saldo Anterior: "+ conta1.saldo);
                // conta1.saca(200);
                 //System.out.println("Saldo Atal: "+ conta1.saldo);
                System.out.println("saldo conta 1: "+conta1.saldo+"saldo conta 2: "+conta2.saldo); 
                double quantTrans = Double.parseDouble(JOptionPane.showInputDialog("Digite Transferencia pra conta 2"));
                conta1.tranferencia(quantTrans, conta2);
                System.out.println("saldo conta 1: "+conta1.saldo+"saldo conta 2: "+conta2.saldo); 

            break;
        
        
        
        }
         //conta2.saca(20);
        //System.out.println("saldo conta 2: " +conta2.saldo);
        
        
    }
    
}
