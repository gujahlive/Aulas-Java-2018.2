/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Candidato;
import model.Conexao;

/**
 *
 * @author francisleide
 */
public class CandidatoDAO {
    Conexao conexao;
    
    public CandidatoDAO(){
        conexao = new Conexao();
    }
    
    public void insereCandidato(Candidato candidato){
        try{
            Connection c = conexao.conectar();
            String script = "INSERT INTO CANDIDATO "
                    + "(NOME,LAVAJATO,CPF,PARTIDO,NUMERO) "
                    + "VALUES (?,?,?,?,?);";
            PreparedStatement ps = c.prepareStatement(script);
            ps.setString(1, candidato.getNome());
            ps.setBoolean(2, candidato.isLavaJato());
            ps.setString(3, candidato.getCpf());
            ps.setString(4, candidato.getPartido());
            ps.setInt(5, candidato.getNumero());
            ps.executeUpdate();
            System.out.println("Candidato Cadastrado.");
            
        }catch(Exception e){
            System.out.println("Erro: "+e.getMessage());
        }
    }
    
    public ArrayList<Candidato> buscarCandidato(){
        String script = "select * from candidato";
        ArrayList<Candidato> candidatos = new ArrayList<>();
        Candidato candidato;
        try{
           Connection c = this.conexao.conectar();
           PreparedStatement ps = c.prepareStatement(script);
           ResultSet rs = ps.executeQuery();
           while(rs.next()){
               candidato = new Candidato();
               candidato.setNome(rs.getString("nome"));
               candidato.setPartido(rs.getString("partido"));
               candidato.setNumero(rs.getInt("numero"));
               candidato.setCpf(rs.getString("cpf"));
               candidato.setLavaJato(rs.getBoolean("lavajato"));
               candidato.setIdcandidato(rs.getInt("idcandidato"));
               candidatos.add(candidato);
           }
        }catch(Exception e){
            System.out.println("Erro: "+e.getMessage());
        }
        return candidatos;
    }
}
