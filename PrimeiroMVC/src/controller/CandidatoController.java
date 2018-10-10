/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Candidato;
import model.DAO.CandidatoDAO;
import views.CandidatoView;

/**
 *
 * @author aluno
 */
public class CandidatoController implements ActionListener {
    CandidatoView cv = new CandidatoView();
    CandidatoDAO cDAO = new CandidatoDAO();
    
    public CandidatoController(CandidatoView candidato){//passa por parametro a view e atribui a instancia view que é tratada no controle
        this.cv = candidato;
        cv.btnSalvar.addActionListener(this);//a instancia da view passando o botão, e o metódo add passando por parametro a tela que é o this
        cv.btnBuscar.addActionListener(this);
    }
    public void preencheTabela(JTable tabela){
        DefaultTableModel tabelaC = new DefaultTableModel();
        tabelaC.addColumn("ID");
        tabelaC.addColumn("Nome");
        tabelaC.addColumn("Lavajato");
        tabelaC.addColumn("CPF");
        tabelaC.addColumn("Partido");
        tabelaC.addColumn("Numero");
        Object [] coluna = new Object[6];
        ArrayList<Candidato> candidatos = cDAO.buscarCandidato();
        for(int i = 0 ; i< candidatos.size() ; i++){
            coluna[0] = candidatos.get(i).getIdcandidato();
            coluna[1] = candidatos.get(i).getNome();
            coluna[2] = candidatos.get(i).isLavaJato();
            coluna[3] = candidatos.get(i).getCpf();
            coluna[4] = candidatos.get(i).getPartido();
            coluna[5] = candidatos.get(i).getNumero();
            tabelaC.addRow(coluna);//pra cada linha adciona os parametros das colunas
        }
        tabela.setModel(tabelaC);//atribui a tabela que foi preenchida a tabela do parametro
    }

    @Override
    public void actionPerformed(ActionEvent ae) {//metódo abstrato da interface  ActionListener, pois esse metódo que vai fazer as ações dos botões
       if(ae.getSource() == cv.btnSalvar){
                Candidato candidato = new Candidato();
                candidato.setCpf(cv.txtcpf.getText());//seta o atributi do objeto, passando por parametro o retorno do txt da interface
                candidato.setNome(cv.txtnome.getText());
                candidato.setNumero(Integer.parseInt(cv.txtnumero.getText()));
                candidato.setPartido(cv.txtpartido.getText());
                //candidato.setLavaJato(Boolean.valueOf(cv.lavaJato.isEnabled()));
                if(cv.lavaJato.isSelected()){
                    candidato.setLavaJato(true);
                }else{
                   candidato.setLavaJato(false);
                }
                cDAO.insereCandidato(candidato);//dentro do if pra passar o objeto
                Component frame = null;
                JOptionPane.showMessageDialog(frame, "Candidato Cadastrado!");
                preencheTabela(cv.tableCandidatos);
       }
       
       if(ae.getSource() == cv.btnBuscar){
           preencheTabela(cv.tableCandidatos);
           
       }
    
    }
        
}
