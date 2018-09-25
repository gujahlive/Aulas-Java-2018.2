/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author gusta
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa p = new Pessoa();
        
        ArrayList<Endereco> enderecos = new ArrayList<>();
        int i;
        int statusMenu = JOptionPane.YES_NO_OPTION;
        do{
            Endereco e = new Endereco();
            e.setCep(Integer.parseInt(JOptionPane.showInputDialog("Digite o cep")));
            e.setRua(JOptionPane.showInputDialog("Digite a rua"));
            
            enderecos.add(e);
            statusMenu = JOptionPane.showConfirmDialog(null, "ir mais uma?", "menu", statusMenu);
        }while(statusMenu == 0);
        p.setEnderecos(enderecos);
        for(i=0 ; i< enderecos.size() ; i++){
            System.out.println("Rua: "+p.getEnderecos().get(i).getRua());
            System.out.println("Cep: "+p.getEnderecos().get(i).getCep());
            
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
       /* int i;
        for(i = 0 ; i < 3 ;i ++){
            Endereco e = new Endereco();
            p.setApelido(JOptionPane.showInputDialog("Digite um apelido"));
            p.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite um numero")));
            e.setCep(Integer.parseInt(JOptionPane.showInputDialog("Digite o cep")));
            e.setRua(JOptionPane.showInputDialog("Digite a rua"));
            
            p.setEndereco(e);
            
   
        }
        System.out.println("Apelidos: "+p.getApelidos());
        System.out.println("Numeros: "+p.getNumeros());
        for(i = 0 ; i < 3 ;i ++){
            System.out.println("Rua: "+p.getEnderecos().get(i).getRua());
            System.out.println("Cep: "+p.getEnderecos().get(i).getCep());
            
        }*/
        
        
        
        
    }
    
}
