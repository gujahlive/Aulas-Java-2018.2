/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova1gustavo;

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
        Pessoa user = new Usuario();
        Movel movel = new Movel("solicitado");
        Funcionario func = new Funcionario();
        Pagamento pagar = new Pagamento();

        int statusMenu = JOptionPane.YES_NO_OPTION;
        do {
            int e = Integer.parseInt(JOptionPane.showInputDialog("1 - Cadastrar Cliente\n2 - Cadastrar Móvel"
                    + "\n3 - Cadastrar Funcionário\n4 - Pagamento\n5 - Sair"));
            switch (e) {
                case 1:
                    user.setNome("Gustavo");
                    user.setCpf(123);
                    user.setTelefone(99293333);
                    user.setEndereco("Rua nova bahia");
                    System.out.println("\n\n\n\n");
                    System.out.println("Nome Usuário: " + user.getNome());
                    System.out.println("CPF Usuário: " + user.getCpf());
                    System.out.println("Endereco Usuário: " + user.getEndereco());
                    System.out.println("Telefone Usuário: " + user.getTelefone());
                    break;

                case 2:
                    movel.setNomeDoMovel("Cadeira");
                    movel.setCor("Preto");
                    movel.setMedidaX(3.5);
                    movel.setMedidaY(6.8);
                    movel.setMedidaZ(4.5);
                    movel.setNomeDoMaterial("Maderite");
                    movel.setLinkImgHREF("https://loja.moveisdoguguinha.com.br/produtos/cadeiras");

                    user.setMovel(movel);
                    System.out.println("Status movel: " + movel.getStatus());
                    System.out.println("\n\n\n\n");
                    System.out.println("Móvel: " + movel.getNomeDoMovel());
                    System.out.println("Cor: " + movel.getCor());
                    System.out.println("Material: " + movel.getNomeDoMaterial());
                    System.out.println("Link: : " + movel.getLinkImgHREF());
                    break;
                case 3:

                    func.setNome("José");
                    func.setCpf(321);
                    func.setTelefone(33339929);
                    func.setEndereco("Rua bahia nova");
                    func.setDisponivel(true);

                    System.out.println("Status Funcionário: " + func.isDisponivel());
                    System.out.println("\n\n\n\n");
                    System.out.println("Nome Funcionário: " + func.getNome());
                    System.out.println("CPF Funcionário: " + func.getCpf());
                    System.out.println("Endereco Funcionário: " + func.getEndereco());
                    System.out.println("Telefone Funcionário: " + func.getTelefone());

                    int eM = Integer.parseInt(JOptionPane.showInputDialog("1 - escolher móvel cadastrado\n2 - recusar móvel"));
                    if (eM == 1) {
                        if ("entregue".equals(movel.getStatus())) {
                            System.out.println("\n");
                            System.out.println("Móvel já entregue");
                            System.out.println("\n");
                        } else {

                            pagar.precificarMovel(Integer.parseInt(JOptionPane.showInputDialog("quantos dias para o móvel ser construído?")));
                            movel.setStatus("em andamento");
                            func.setMovel(movel);
                            func.setDisponivel(false);
                            System.out.println("\n\n");
                            System.out.println("Funcionário Disponivel?: " + func.isDisponivel());
                            System.out.println("Status Móvel: " + movel.getStatus());
                        }
                    } else {
                        System.out.println("\n\n");
                         if("entregue".equals(movel.getStatus())){ System.out.println("Móvel entregue");
                         }else{
                             System.out.println("Escolha o móvel, meu querido!");
                             System.out.println("Funcionário Disponivel?: " + func.isDisponivel());
                             System.out.println("Status Móvel: " + movel.getStatus());
                         
                         }
                         
                    

                    }

                    break;
                case 4:
                    
                    if ("solicitado".equals(movel.getStatus())) {
                        System.out.println("Móvel ainda não cadastrado.");
                    
                    } else {
                        
                        movel.setPagamento(pagar);
                        movel.setStatus("entregue");

                        func.setDisponivel(true);
                        System.out.println("\n\n\n\n");
                        if("entregue".equals(movel.getStatus())) System.out.println("Móvel entregue");
                        System.out.println("Preço do movel: " + movel.getPreco());
                        System.out.println("Funcionário Dinponivel? " + func.isDisponivel());
                        System.out.println("Status Móvel: " + movel.getStatus());
                        System.out.println("Móvel: "+user.getMovel().getNomeDoMovel()+" do cliente: "+user.getNome()+" feito por:"+func.getNome());
                    }
                    break;

                case 5:
                    statusMenu = 1;
                    break;
            }

            statusMenu = JOptionPane.showConfirmDialog(null, "Deseja Voltar?", "passando", statusMenu);

        } while (statusMenu == 0);

    }

}
