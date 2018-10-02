/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import java.util.ArrayList;
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
        // TODO code application logic here
         Conexao c = new Conexao();
        c.conectar();
        if(c.isConnected()){
            System.out.println("Conectado");
        }else{
            System.out.println("deu ruim!!! ");
        }
             Cliente cliente = new Cliente();  /* 
        cliente.setNome(JOptionPane.showInputDialog("Digite seu nome: "));
        cliente.setTelefone(JOptionPane.showInputDialog("Digite seu telefone: "));
        cliente.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: ")));
        c.cadastrarCliente(cliente);
        
        //int id = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
        c.listarCliente();
        ArrayList<Cliente> clientes = c.listarCliente();
        for(int i = 0 ; i<clientes.size() ; i++){
        System.out.println("Cliente: "+(i+1));
        System.out.println("Nome: "+clientes.get(i).getNome());
        System.out.println("Telefone: "+clientes.get(i).getTelefone());
        System.out.println("Idade: "+clientes.get(i).getIdade());
        System.out.println("_______________________________________________");
        }
        */
        String nome = JOptionPane.showInputDialog("Informe o nome da busca");
        //c.buscarClientePorNome(nome);
        ArrayList<Cliente> clientes = c.buscarClientePorNome(nome);
     
        for(int i = 0 ; i<clientes.size() ; i++){
        System.out.println("Cliente: "+(i+1));
        System.out.println("Nome: "+clientes.get(i).getNome());
        System.out.println("Telefone: "+clientes.get(i).getTelefone());
        System.out.println("Idade: "+clientes.get(i).getIdade());
        }
        if(clientes.isEmpty()){
            System.out.println("Usuário n encontrado");
        }
        int id = Integer.parseInt(JOptionPane.showInputDialog("Informe o id para modificar"));
        cliente.setNome(JOptionPane.showInputDialog("Digite seu nome: "));
        cliente.setTelefone(JOptionPane.showInputDialog("Digite seu telefone: "));
        cliente.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: ")));
        c.editarCliente(id, cliente);
        clientes=c.listarCliente();
        
        for(int i = 0 ; i<clientes.size() ; i++){
        System.out.println("Cliente: "+(i+1));
        System.out.println("Nome: "+clientes.get(i).getNome());
        System.out.println("Telefone: "+clientes.get(i).getTelefone());
        System.out.println("Idade: "+clientes.get(i).getIdade());
        System.out.println("_______________________________________________");
        }
    
    }
    
}
