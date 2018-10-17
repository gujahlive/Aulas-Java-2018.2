/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import model.Candidato;
import model.DAO.CandidatoDAO;
import model.DAO.DependenteDAO;
import model.Dependente;
import views.DependenteView;

/**
 *
 * @author francisleide
 */
public class DependenteController implements ActionListener {
    DependenteDAO dDAO = new DependenteDAO();
    ArrayList<Candidato> candidatos;
    DependenteView dv = new DependenteView();
    public DependenteController(DependenteView dependenteView){
        this.dv = dependenteView;
        this.preencheCombo();
        this.dv.btnSalvar.addActionListener(this);
        
    }
    
    public void preencheCombo(){
        CandidatoDAO cDAO = new CandidatoDAO();
        candidatos = cDAO.buscarCandidato();
        for (int i = 0; i < candidatos.size(); i++) {
            dv.comboCandidato.addItem(candidatos.get(i).toString());
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == dv.btnSalvar){
            Dependente dependente = new Dependente();
            dependente.setNome(dv.txtNomeDep.getText());
            dependente.setGrauParentesco(dv.txtGrau.getText());
            int indice = dv.comboCandidato.getSelectedIndex();
            int idCandidato = candidatos.get(indice).getIdCandidato();
            dependente.setIdCandidato(idCandidato);
            dDAO.insereDependente(dependente);
        }
    }
}
