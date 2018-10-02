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
        if(this.conexao != null){
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
        System.out.println(script);
    }       
    
}
