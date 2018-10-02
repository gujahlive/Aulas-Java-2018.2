/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class Conexao {
     private Connection conexao;
    private ResultSet resultset;
    private Statement statement;

    public void conectar() {
        String servidor = "jdbc:mysql://localhost:3306/empresa";
        String usuario = "root";
        String senha = "cimatec";
        String driver = "com.mysql.jdbc.Driver";
        try {
            Class.forName(driver);
            this.conexao = DriverManager.getConnection(servidor, usuario, senha);
            this.statement = this.conexao.createStatement();
        }catch(Exception e){
            System.out.println("Ocorreu um erro: "+e.getMessage());
}
    }
    public boolean isConnected(){
        if(this.conexao != null){// ou if(this.conexao)
            return true;
        }else
            return false;
    }
    public void cadastrarCliente(Cliente cliente){
        String telefone = cliente.getTelefone();
        String nome = cliente.getNome();
        int idade = cliente.getIdade();
         String script = "Insert into cliente (nome,telefone,idade) values"
               +" ('"+nome+"','"+telefone+"',"+idade+");";
        //System.out.println(script);
        try{
            this.statement.executeUpdate(script);
            System.out.println(script);
        }catch(Exception e){
            System.out.println("Erro: "+e.getMessage());
        }
        
    }   

    public ArrayList<Cliente> listarCliente(){
        
        String script = "select * from cliente";
        ArrayList<Cliente> clientes = new ArrayList<>();
        try{
           this.resultset = this.statement.executeQuery(script);// executa a query e traz um retorno atribuindo a resultset
           while(this.resultset.next()){//enquanto o next do resultset for verdadeiro ele instancia
               Cliente cliente = new Cliente();
               String telefone = resultset.getString("telefone");// resultset trazendo o telefone do banco passando por parametro o nome do atributo
               String nome = resultset.getString("nome");
               int idade = resultset.getInt("idade");
               cliente.setNome(nome);
               cliente.setTelefone(telefone);
               cliente.setIdade(idade);
               
               clientes.add(cliente);// adcionando o cliente no arraylist
           }   
           
            System.out.println(script);
        }catch(Exception e){
            System.out.println("Erro: "+e.getMessage());
        }
        return clientes;
    }
    
     public ArrayList<Cliente> buscarClientePorNome(String nome){
        
        String script = "select * from cliente where nome='"+nome+"'";
        ArrayList<Cliente> clientes = new ArrayList<>();
        try{
           this.resultset = this.statement.executeQuery(script);// executa a query e traz um retorno atribuindo a resultset
           while(this.resultset.next()){//enquanto o next do resultset for verdadeiro ele instancia
               Cliente cliente = new Cliente();
               String telefone = resultset.getString("telefone");// resultset trazendo o telefone do banco passando por parametro o nome do atributo
                cliente.setNome(resultset.getString("nome"));
                int idade = resultset.getInt("idade");
               
               cliente.setTelefone(telefone);
               cliente.setIdade(idade);
               
               clientes.add(cliente);// adcionando o cliente no arraylist
           }   
           
            System.out.println(script);
        }catch(Exception e){
            System.out.println("Erro: "+e.getMessage());
        }
        return clientes;
    }
    
    public void editarCliente(int id, Cliente cliente){
        
        String nome = cliente.getNome();
        String telefone = cliente.getTelefone();
        int idade = cliente.getIdade();
        String script = "update cliente set nome = '"+nome+"',telefone = '"+telefone+"', idade = "+idade+" where idcliente ="+id+" ";
        try{
             this.statement.executeUpdate(script);
        }catch(Exception e){
            System.out.println("Erro: "+e.getMessage());
        }
        
            
    }
        
    
}
