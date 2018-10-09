/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeiromvc;

import controller.CandidatoController;
import model.Conexao;
import java.sql.Connection;
import model.Candidato;
import model.DAO.CandidatoDAO;
import views.CandidatoView;

/**
 *
 * @author francisleide
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection c;
        Conexao conexao = new Conexao();
        c = conexao.conectar();
        if(c!=null){
            System.out.println("Massa! Conectou!");
        }else{
            System.out.println("Deu ruim!");
        }
        
        /*        CandidatoDAO cDAO = new CandidatoDAO();
        Candidato candidato = new Candidato();
        candidato.setCpf("12345");
        candidato.setLavaJato(false);
        candidato.setNome("Hadadd");
        candidato.setPartido("PT");
        candidato.setNumero(13);
        cDAO.insereCandidato(candidato);*/
        CandidatoView cand = new CandidatoView();
        cand.setVisible(true);//é exibido na tela
        CandidatoController cc = new CandidatoController(cand);
        
        
                
    }
    
}
