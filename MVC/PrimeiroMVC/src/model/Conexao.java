/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author francisleide
 */
public class Conexao {
    Connection conexao;
    
    public Connection conectar(){
        String usuario = "root";
        String senha = "";
        String driver = "com.mysql.jdbc.Driver";
        String servidor = "jdbc:mysql://localhost:3306/eleicao";
        try{
            Class.forName(driver);
            return DriverManager.getConnection(servidor, usuario, senha);
        }catch(Exception e){
            System.out.println("Erro "+e.getMessage());
        }
        return null;       
    }
}
