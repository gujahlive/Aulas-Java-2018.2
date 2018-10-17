/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeiromvc;

import controller.CandidatoController;
import controller.DependenteController;
import model.Conexao;
import java.sql.Connection;
import model.Candidato;
import model.DAO.CandidatoDAO;
import views.CandidatoView;
import views.DependenteView;

/**
 *
 * @author francisleide
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* CandidatoView cand = new CandidatoView();
        cand.setVisible(true);
        CandidatoController cc = new CandidatoController(cand);*/
          
        DependenteView dv = new DependenteView();
        dv.setVisible(true);
        DependenteController dc = new DependenteController(dv);
       
    }
    
}
