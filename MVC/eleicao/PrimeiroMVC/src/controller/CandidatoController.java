/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Candidato;
import model.DAO.CandidatoDAO;
import views.CandidatoView;

/**
 *
 * @author francisleide
 */
public class CandidatoController implements ActionListener{
    CandidatoView cv = new CandidatoView();
    CandidatoDAO cDAO = new CandidatoDAO();
    
    public CandidatoController(CandidatoView candidatoView){
        this.cv = candidatoView;
        cv.btnSalvar.addActionListener(this);
        cv.btnBuscar.addActionListener(this);
        
    }
    
    public void preencheTabela(JTable tabela){
        DefaultTableModel tabelaC = new DefaultTableModel();
        tabelaC.addColumn("Id");
        tabelaC.addColumn("Nome");
        tabelaC.addColumn("Lavajato");
        tabelaC.addColumn("CPF");
        tabelaC.addColumn("Partido");
        tabelaC.addColumn("Numero");
        Object [] coluna = new Object[6];
        ArrayList<Candidato> candidatos = cDAO.buscarCandidato();
        for (int i = 0; i < candidatos.size(); i++) {
            coluna[0] = candidatos.get(i).getIdCandidato();
            coluna[1] = candidatos.get(i).getNome();
            coluna[2] = candidatos.get(i).isLavaJato();
            coluna[3] = candidatos.get(i).getCpf();
            coluna[4] = candidatos.get(i).getPartido();
            coluna[5] = candidatos.get(i).getNumero();
            tabelaC.addRow(coluna);
        }
        tabela.setModel(tabelaC);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == cv.btnSalvar){
            Candidato candidato = new Candidato();
            candidato.setCpf(cv.txtCpf.getText());
            candidato.setNome(cv.txtNome.getText());
            candidato.setNumero(Integer.parseInt(cv.txtNumero.getText()));
            candidato.setPartido(cv.txtPartido.getText());
            if(cv.lavaJato.isSelected()){
                candidato.setLavaJato(true);
            }else{
                candidato.setLavaJato(false);
            }
            cDAO.insereCandidato(candidato);
        }
        if(ae.getSource() == cv.btnBuscar){
            preencheTabela(cv.tableCandidatos);
        }
       
    }

   
}
