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
        Cliente cliente = new Cliente();
        Endereco endereco = new Endereco();
        Servico servico = new Servico();

        int e = Integer.parseInt(JOptionPane.showInputDialog("1 - Cadastrar Cliente\n2 - Cadastrar endereço\n3 - Listar Clientes\n4 - Listar Pets"));
        switch (e) {
            case 1:
                cliente.setNome(JOptionPane.showInputDialog("Nome: "));
                cliente.setCpf(Integer.parseInt(JOptionPane.showInputDialog("CPF: ")));

                break;

            case 2:

                endereco.setRua(JOptionPane.showInputDialog("Rua: "));
                endereco.setBairro(JOptionPane.showInputDialog("Bairro: "));
                endereco.setCidade(JOptionPane.showInputDialog("Cidade: "));

                break;

            case 3:
                break;

            case 4:
                break;

        }

        /*
          int statusInserirCadastro = JOptionPane.YES_NO_OPTION;
          do {
          
          statusInserirCadastro = JOptionPane.showConfirmDialog(null,"deseja inserir mais uma porta?","Casa",statusInserirCadastro);
          
          //  dog.setNome(JOptionPane.showInputDialog("Nome: "));
          // dog.setNascimento(Integer.parseInt(JOptionPane.showInputDialog("Ano Nascimento: ")));

          dog.setPedigree(true);
          dog.setDono(cliente);
          cliente.setEndereco(endereco);
          dog.setServico(servico);
          System.out.println("Valor Banho: "+dog.getServico().CalcularBanho(dog));
          System.out.println("Pedigree: "+dog.isPedigree());
          }while(statusInserirCadastro == 0); */
    }

}
