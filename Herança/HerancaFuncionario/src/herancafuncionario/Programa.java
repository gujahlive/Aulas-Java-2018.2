/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herancafuncionario;

/**
 *
 * @author aluno
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setnGerenciado(3);
        System.out.println("Numero de gerenciados: "+gerente.getnGerenciado());
        gerente.setSalario(8000);
        double x = gerente.getBonificacao();
        System.out.println("Bonificação Gerente: "+x);
        Funcionario funcionario = new Funcionario();
        funcionario.setSalario(3000);
        double y = funcionario.getBonificacao();
        System.out.println("Bonificação Func: "+y);       
        // TODO code application logic here
    }
    
}
