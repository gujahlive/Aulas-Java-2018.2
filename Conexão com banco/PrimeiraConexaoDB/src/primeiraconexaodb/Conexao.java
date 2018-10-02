/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeiraconexaodb;

//import java.beans.Statement; não é o beans é o sql
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author gusta
 */
public class Conexao {
    private ResultSet resultset;// resultado da query
    private Statement statement;//declaração do script do banco de dados
    private Connection conexao;//contra espaço para importar// a conexão
    
    public void conectar(){
        String servidor = "jdbc:mysql://localhost:3306/empresa_dc";//endereço jdbc com o nome do banco respectivo
        String usuario = "root";//user do banco
        String senha = "";//senha do banco
        String driver = "com.mysql.jdbc.Driver";// endereço do driver
        try{
            Class.forName(driver);// passando o driver por parametro para dar inicio a conexão
            this.conexao = DriverManager.getConnection(servidor, usuario, senha);// passa o sevidor o usuário e senha para gerar a conexão do driveManager// this.conexao = (Connection) DriverManager.getConnection(servidor, usuario, senha);
            this.statement = this.conexao.createStatement();//pega a conexao e traz o resultado//CAST -- statement = (Statement)this.conexao.createStatement();
        }catch(Exception e){
            System.out.println("Erro: "+e.getMessage());
        }
        
    }
    
    
    public boolean estaConectado(){
        if(this.conexao != null){
            return true;
        }else return false;
    }
    
    public void cadastrarCliente(Cliente cliente){
        
        String telefone = cliente.getTelefone();
        String nome = cliente.getNome();
        int idade = cliente.getIdade();
        String script = "insert into cliente (nome, telefone, idade)"+
                "values ('"+nome+"','"+telefone+"',"+idade+");";
        
        
        
        try{
        
        
        }catch(Exception e){
        
        
        }
    }
    
    
    
}
