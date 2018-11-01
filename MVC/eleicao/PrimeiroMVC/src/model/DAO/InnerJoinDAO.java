/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Conexao;
import model.InnerJoin;

/**
 *
 * @author gusta
 */
public class InnerJoinDAO {
    
         Conexao conexao;
    
    public InnerJoinDAO(){
        conexao = new Conexao();
    }
    
    	public ArrayList<InnerJoin> join(){
            Connection c = conexao.conectar();
		String sql = "select dependente.nomeDependente, candidato.numero, dependente.grauParentesco, candidato.nome from dependente inner join candidato on dependente.idCandidato = candidato.idcandidato;";
		ArrayList<InnerJoin> lista = new ArrayList<InnerJoin>();
		try {
			PreparedStatement preparador = c.prepareStatement(sql);
			ResultSet resultados = preparador.executeQuery();// executa os resultados
			while(resultados.next()) {
				InnerJoin injoi = new InnerJoin();
				injoi.setNumeroPartido(resultados.getInt("numero"));
				injoi.setNomeDependente(resultados.getString("nomeDependente"));
                                injoi.setNomeCandidato(resultados.getString("nome"));
                              	injoi.setGrauParentesco(resultados.getString("grauParentesco"));
                              
				lista.add(injoi);//adciona a instancia criada no final do arraylist
				
			}
		} catch (SQLException e) {
			System.out.println("Erro - "+e.getMessage());
		}
		return lista;
		
	}
        /*public InnerJoin buscarporID(Integer id) {
        InnerJoin injoiretorno = null;
        String sql = "select * from injoiente where id_injoiente = ?";
        try {
        PreparedStatement preparador = con.prepareStatement(sql);
        preparador.setInt(1, id);
        //retorno da consulta resultset
        ResultSet resultado = preparador.executeQuery();
        if(resultado.next()) {
        injoiretorno = new InnerJoin();
        injoiretorno.setId(resultado.getInt("id_injoiente"));
        injoiretorno.setNome_completo(resultado.getString("nome_injoiente"));
        injoiretorno.setCpf(resultado.getString("cpf"));
        injoiretorno.setTelefone_residencial(resultado.getString("telefone_residencial"));
        injoiretorno.setTelefone_celular(resultado.getString("telefone_celular"));
        injoiretorno.setSexo(resultado.getString("sexo"));
        
        }
        System.out.println("Encontrado com sucesso! ");
        }catch(SQLException e) {
        System.out.println("Erro: de sql"+e.getMessage());
        }
        
        return injoiretorno;
        }*/
}
