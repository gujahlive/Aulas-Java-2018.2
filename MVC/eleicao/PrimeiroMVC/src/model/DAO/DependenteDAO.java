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
import model.Dependente;

/**
 *
 * @author francisleide
 */
public class DependenteDAO {
     Conexao conexao;
    
    public DependenteDAO(){
        conexao = new Conexao();
    }
    
    public void insereDependente(Dependente dependente){
        try{
            Connection c = conexao.conectar();
            String script = "INSERT INTO DEPENDENTE "
                    + "(NOME,GRAUPARENTESCO,IDCANDIDATO) "
                    + "VALUES (?,?,?);";
            PreparedStatement ps = c.prepareStatement(script);
            ps.setString(1, dependente.getNome());
            ps.setString(2, dependente.getGrauParentesco());
            ps.setInt(3, dependente.getIdCandidato());
           
            ps.executeUpdate();
            
            //ps.
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
           PreparedStatement ps =c.prepareStatement(script);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                candidato = new Candidato();
                candidato.setNome(rs.getString("nome"));
                candidato.setNumero(rs.getInt("numero"));
                candidato.setCpf(rs.getString("cpf"));
                candidato.setLavaJato(rs.getBoolean("lavajato"));
                candidato.setPartido(rs.getString("partido"));
                candidato.setIdCandidato(rs.getInt("idCandidato"));
                candidatos.add(candidato);
            }
        }catch(Exception e){
            System.out.println("Erro: "+e.getMessage());
        }
        return candidatos;
    }
}
