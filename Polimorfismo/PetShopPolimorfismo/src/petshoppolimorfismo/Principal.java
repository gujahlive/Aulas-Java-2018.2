/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petshoppolimorfismo;

import java.awt.Component;
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
        Cliente cliente = new Cliente();
        Endereco endereco = new Endereco();
        Servico servico = new Servico();

        int sair = 1;
        int statusInserirCadastro = JOptionPane.YES_NO_OPTION;
        do {

            int e = Integer.parseInt(JOptionPane.showInputDialog("1 - Cadastrar Cliente\n2 - Cadastrar Pet\n3 - Listar Clientes\n4 - Listar Pets\n5 - Sair"));
            switch (e) {
                case 1:
                    cliente.setNome(JOptionPane.showInputDialog("Nome: ", "Fulano Da Silva Souza"));
                    cliente.setCpf(JOptionPane.showInputDialog("CPF: ", "123.456.789-10"));
                    endereco.setRua(JOptionPane.showInputDialog("Rua: "));
                    endereco.setBairro(JOptionPane.showInputDialog("Bairro: "));
                    endereco.setCidade(JOptionPane.showInputDialog("Cidade: "));
                    cliente.setEndereco(endereco);
                    break;

                case 2:
                    dog.setNome(JOptionPane.showInputDialog("Nome: ","Totó"));
                    dog.setNascimento(Integer.parseInt(JOptionPane.showInputDialog("Ano Nascimento: ","2010")));
                    int pedigree= JOptionPane.YES_NO_OPTION;
                    pedigree = JOptionPane.showConfirmDialog(null,"Pedigree?","Dog",pedigree);
                    if(pedigree == 0){
                        dog.setPedigree(true);
                    }else dog.setPedigree(false);
                    dog.setCliente(cliente);
                    break;

                case 3:
                    System.out.println("---------------------- Clientes ----------------- ");
                    System.out.println("Nome: " + cliente.getNome());
                    System.out.println("CPF: " + cliente.getCpf());
                    System.out.println("Rua: " + cliente.getEndereco().getRua());
                    System.out.println("Bairro: " + cliente.getEndereco().getBairro());
                    System.out.println("Cidade: " + cliente.getEndereco().getCidade());

                    break;

                case 4:
                     System.out.println("---------------------- Pets ----------------- ");
                     System.out.println("Nome: " + dog.getNome());
                     System.out.println("Idade: "+dog.CalcularIdade());
                     System.out.println("Pedigree: "+dog.isPedigree());
                     System.out.println("Dono: "+dog.getCliente().getNome());
                     
                     
                    break;
                case 5:
                    sair = 0;
                // default: e = JOptionPane.showMessageDialog("Opção errada",e); JOptionPane.showMessageDialog(frame, "A basic JOptionPane message dialog");

            }
            //statusInserirCadastro = JOptionPane.showConfirmDialog(null,"deseja inserir mais uma porta?","Casa",statusInserirCadastro);
        } while (sair != 0);

        /*
          int statusInserirCadastro = JOptionPane.YES_NO_OPTION;
          do {
          
          statusInserirCadastro = JOptionPane.showConfirmDialog(null,"deseja inserir mais uma porta?","Casa",statusInserirCadastro);
          
       
          cliente.setEndereco(endereco);
          dog.setServico(servico);
          System.out.println("Valor Banho: "+dog.getServico().CalcularBanho(dog));
         
          }while(statusInserirCadastro == 0); */
    }

}
