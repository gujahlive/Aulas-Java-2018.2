/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petshoppolimorfismo;

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
          
        
        
          Pet coelho = new Coelho();
          Cachorro dog = new Cachorro();
          Dono dono = new Dono();
          Endereco endereco = new Endereco();
          Servico servico = new Servico();
          
          dog.setNome(JOptionPane.showInputDialog("Nome: "));
          dog.setNascimento(Integer.parseInt(JOptionPane.showInputDialog("Ano Nascimento: ")));
          dono.setNome(JOptionPane.showInputDialog("Nome: "));
          dono.setCpf(Integer.parseInt(JOptionPane.showInputDialog("CPF: ")));
          endereco.setRua(JOptionPane.showInputDialog("Rua: "));
          endereco.setBairro(JOptionPane.showInputDialog("Bairro: "));
          endereco.setCidade(JOptionPane.showInputDialog("Cidade: "));
          //servico.CalcularBanho(dog);
          dog.setDono(dono);
          dono.setEndereco(endereco);
          dog.setServico(servico);
          System.out.println("Valor Banho: "+dog.getServico().CalcularBanho(dog));
          System.out.println("Pedigree: ");
          
          
    }
    
}
