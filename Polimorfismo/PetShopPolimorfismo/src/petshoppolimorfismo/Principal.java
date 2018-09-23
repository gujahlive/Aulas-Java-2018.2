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
        ArrayList<Cachorro> dogs = new ArrayList<>();

        Pet caoPet = new Cachorro();// posso instanciar uma clase que não é filha do tipo?!
        Pet gato = new Gato();

        Cliente cliente = new Cliente();
        Endereco endereco = new Endereco();
        Servico servico = new Servico();
        ArrayList<Cliente> listaCliente = new ArrayList<>(); // array list para obter vários clientes
        ArrayList<Pet> listaPet = new ArrayList<>();// e a mesma coisa pro pet
        int sair = 1, i = 0;
        int statusInserirCadastro = JOptionPane.YES_NO_OPTION;
        do {

            int e = Integer.parseInt(JOptionPane.showInputDialog("1 - Cadastrar Cliente\n2 - Cadastrar Pet\n3 - Listar Clientes\n4 - Listar Pets\n5-Cadastrar Serviço\n6 - Listar Servicos\n7 - setados\n8 - Sair"));
            switch (e) {
                case 1:
                    int statusInsereEndereco = JOptionPane.YES_NO_OPTION;

                    cliente.setNome(JOptionPane.showInputDialog("Nome: ", "Fulano Da Silva Souza"));
                    cliente.setCpf(JOptionPane.showInputDialog("CPF: ", "123.456.789-10"));

                    do {

                        endereco.setRua(JOptionPane.showInputDialog("Rua: "));
                        endereco.setBairro(JOptionPane.showInputDialog("Bairro: "));
                        endereco.setCidade(JOptionPane.showInputDialog("Cidade: "));
                        //  cliente.setEnderecos(endereco);
                        cliente.setEndereco(endereco);
                        statusInsereEndereco = JOptionPane.showConfirmDialog(null, "Deseja Inserir Mais 1 endereço?", "Endereco", statusInsereEndereco);
                    } while (statusInsereEndereco == 0);

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
                            dogs.add(dog);
                            listaPet.add(dog);

                            break;
                        case 2:
                            gato.setNome(JOptionPane.showInputDialog("Nome: ", "Totó"));
                            gato.setNascimento(Integer.parseInt(JOptionPane.showInputDialog("Ano Nascimento: ", "2010")));
                            gato.setCliente(cliente);
                            gato.setServico(servico);
                            listaPet.add(gato);
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
                    System.out.println("Rua: " + cliente.getEndereco().get(i).getRua());
                    System.out.println("Bairro: " + cliente.getEndereco().get(i).getBairro());
                    System.out.println("Cidade: " + cliente.getEndereco().get(i).getCidade());

                    break;

                case 4:
                    for (i = 0; i < listaPet.size(); i++) {
                        System.out.println("---------------------- Pets ----------------- ");
                        System.out.println("Nome: " + listaPet.get(i).getNome());
                        System.out.println("Idade: " + listaPet.get(i).CalcularIdade());
                        if (listaPet.get(i) instanceof Cachorro) {
                            System.out.println("Pedigree: " + dogs.get(i).isPedigree());
                        }

                        // System.out.println("Dono: " + dog.getCliente().getNome());
                        // System.out.println("Descrição do serviço: " + dog.getServicos().get(i).getDescricoes());
                        // System.out.println("Valor Banho: " + dog.getServicos().get(i).CalcularServico(dog));
                    }
                    break;

                case 5:
                    int statusInsereDescricao = JOptionPane.YES_NO_OPTION;
                    do {
                        int eServ = Integer.parseInt(JOptionPane.showInputDialog("1 - Inseirir Banho\n2 - Inserir Tosa\n3 - Inserir Consulta"));
                        switch (eServ) {

                            case 1:
                                String descricao = "banho";
                                servico.setDescricao(descricao);
                                break;
                            case 2:
                                descricao = "tosa";
                                servico.setDescricao(descricao);
                                break;
                            case 3:
                                descricao = "consulta";
                                servico.setDescricao(descricao);
                                break;
                        }

                        dog.setServico(servico);
                        statusInsereDescricao = JOptionPane.showConfirmDialog(null, "Deseja inserir mais um serviço?", "Servico", statusInsereDescricao);
                    } while (statusInsereDescricao == 0);
                    break;
                case 6:

                    ArrayList<Servico> servicos = new ArrayList<>();
                    servicos = dog.getServicos();

                    //for(int i = 0 ; i < servicos.size() ; i++){// só vai servir para uma classe, nesse caso estou imprimindo o arraylist de atributos
                    System.out.println("Servicos: " + dog.getServicos().get(i).getDescricoes());
                    //}
                    break;

                case 7:
                    cliente.setNome("Gu");
                    cliente.setCpf("1234");
                    endereco.setRua("Nova Bahia");
                    endereco.setBairro("Capelinha");
                    dog.setNome("Bionda");
                    dog.setNascimento(2015);
                    servico.setDescricao("banho");
                    servico.setDescricao("consulta");

                    cliente.setEndereco(endereco);
                    cliente.setPets(dog);
                    dog.setServico(servico);
                    System.out.println("Servico: " + dog.getServicos().get(i).getDescricoes());

                    break;

                case 8:
                    sair = 0;
                // default: e = JOptionPane.showMessageDialog("Opção errada",e); JOptionPane.showMessageDialog(frame, "A basic JOptionPane message dialog");
            }

        } while (sair != 0);

    }

}
