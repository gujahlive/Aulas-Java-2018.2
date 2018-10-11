/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Conexao;
import model.Pessoa;

/**
 *
 * @author fran
 */
public class PessoaDAO {
    Conexao conexao;
    
    public PessoaDAO(){
        conexao = new Conexao();  
    }
    
    public void inserePessoa(Pessoa pessoa){
        //String registro = null;
        try{
            String sql= "INSERT INTO PESSOA (NOME, NICK) VALUES (?,?);";
            Connection con = conexao.getConnection();
            PreparedStatement stmt = (PreparedStatement) con.prepareStatement(sql);
            stmt.setString(1, pessoa.getNome());
            stmt.setString(2, pessoa.getNick());
            stmt.execute();
            stmt.close();
            con.close();
        }catch(Exception e){
            System.out.println("Erro: "+e.getMessage());
        }
    }
    public ArrayList<Pessoa> listaPessoa(){
        ArrayList<Pessoa> listaPessoas = new ArrayList<Pessoa>();
        Pessoa pessoa;
        try{
            Connection con = conexao.getConnection();
            PreparedStatement stmt = (PreparedStatement) con.prepareStatement("Select * from pessoa");
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                pessoa = new Pessoa();
                pessoa.setId(rs.getInt("id"));
                pessoa.setNome(rs.getString("nome"));
                pessoa.setNick(rs.getString("nick"));
                listaPessoas.add(pessoa);
            }
            
        }catch(Exception e){
            System.out.println("Erro: "+ e.getMessage());
        } return listaPessoas;
    }
    
    public void editarPessoa(int id, Pessoa pessoa){
        try{
            String sql = "update pessoa set nome=?, nick=? where id=?";
            Connection conexaobd = conexao.getConnection();
            PreparedStatement ps = (PreparedStatement) conexaobd.prepareStatement(sql);
            ps.setString(1, pessoa.getNome());
            ps.setString(2, pessoa.getNick());
            ps.setInt(3, id);
            ps.executeUpdate();
        } catch (Exception e){
            System.out.println("Erro:"+e.getMessage());
            
        }
    }
    
    public void eliminarPessoa(int id){
        try{
            String sql = "delete from pessoa where id=?";
            Connection conexaobd = conexao.getConnection();
            PreparedStatement ps = (PreparedStatement) conexaobd.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        }catch(Exception e){
            System.out.println("Erro:"+e.getMessage());
        }
    }

}
