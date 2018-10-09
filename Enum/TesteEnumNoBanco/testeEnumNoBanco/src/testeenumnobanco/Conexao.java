/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeenumnobanco;

import java.sql.*;        
public class Conexao
{
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String url = "jdbc:mysql://localhost:3306/exemplo";
    private static final String usuario = "root";
    private static final  String senha = "";
    private static java.sql.Connection con = null;
    
    public static  Connection getInstance() throws ClassNotFoundException, SQLException
    {
        if (con == null)
        {
            Class.forName(driver);
            con = DriverManager.getConnection(url,usuario,senha);                
        }
        return con;
    }    
}