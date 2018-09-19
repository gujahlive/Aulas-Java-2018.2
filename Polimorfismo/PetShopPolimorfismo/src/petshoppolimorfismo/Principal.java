/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petshoppolimorfismo;

import java.awt.Component;
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

        Pet coelho = new Coelho();
        Cachorro dog = new Cachorro();
        Cliente cliente = new Cliente();
        Endereco endereco = new Endereco();
        Servico servico = new Servico();

        int sair = 1,i = 0;
        int statusInserirCadastro = JOptionPane.YES_NO_OPTION;
        do {

            int e = Integer.parseInt(JOptionPane.showInputDialog("1 - Cadastrar Cliente\n2 - Cadastrar Pet\n3 - Listar Clientes\n4 - Listar Pets\n5-Cadastrar Serviço\n6 - Listar Servicos\n7 - Sair"));
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
                    int eP = Integer.parseInt(JOptionPane.showInputDialog("1 - Cadastrar Cachorro\n2 - Cadastrar Gato\n3 - Cadastrar Coelho\n4 - Listar Cachorro\n5 - Listar Gato\n6 - Listar Coelho\n7 - voltar"));
                    switch (eP) {
                        case 1:
                            dog.setNome(JOptionPane.showInputDialog("Nome: ", "Totó"));
                            dog.setNascimento(Integer.parseInt(JOptionPane.showInputDialog("Ano Nascimento: ", "2010")));
                            int pedigree = JOptionPane.YES_NO_OPTION;
                            pedigree = JOptionPane.showConfirmDialog(null, "Pedigree?", "Dog", pedigree);
                            if (pedigree == 0) {
                                dog.setPedigree(true);
                            } else {
                                dog.setPedigree(false);
                            }
                            dog.setCliente(cliente);
                            dog.setServico(servico);

                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        case 5:
                            break;
                        case 6:
                            break;
                        case 7:
                            break;

                    }

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
                    System.out.println("Idade: " + dog.CalcularIdade());
                    System.out.println("Pedigree: " + dog.isPedigree());
                    System.out.println("Dono: " + dog.getCliente().getNome());
                    System.out.println("Descrição do serviço: "+dog.getServicos().get(i).getDescricoes());
                    System.out.println("Valor Banho: "+dog.getServicos().get(i).CalcularServico(dog));
                    
                    break;

                case 5:
                    int statusInsereDescricao = JOptionPane.YES_NO_OPTION;
                    do {

                        String descricao = JOptionPane.showInputDialog("Descrição: ", "banho");
                        servico.setDescricao(descricao);
                        dog.setServico(servico);
                        statusInsereDescricao = JOptionPane.showConfirmDialog(null, "Escreva: banho - tosa?", "Servico", statusInsereDescricao);
                    } while (statusInsereDescricao == 0);
                    break;
                case 6:
                   ArrayList<Servico> servicos = new ArrayList<>();
                    servicos = dog.getServicos();
                    
                    //for(int i = 0 ; i < servicos.size() ; i++){// só vai servir para uma classe, nesse caso estou imprimindo o arraylist de atributos
                          System.out.println("Servicos: "+dog.getServicos().get(i).getDescricoes());
                    //}
                    break;
                case 7:
                    sair = 0;
                // default: e = JOptionPane.showMessageDialog("Opção errada",e); JOptionPane.showMessageDialog(frame, "A basic JOptionPane message dialog");

            }

        } while (sair != 0);

   
    }

}
