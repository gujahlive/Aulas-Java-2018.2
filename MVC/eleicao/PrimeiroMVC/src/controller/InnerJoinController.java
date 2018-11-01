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
import model.DAO.InnerJoinDAO;
import model.InnerJoin;
import views.JoinView;

/**
 *
 * @author gusta
 */
public class InnerJoinController implements ActionListener{
    JoinView jv = new JoinView();
    InnerJoin ij = new InnerJoin();
    InnerJoinDAO ijDAO = new InnerJoinDAO();
    
    
    public InnerJoinController(JoinView jv,InnerJoinDAO jdao){
        this.ijDAO = jdao;
        this.jv = jv;
        //cvHome.btnCadastro.addActionListener(this);
        jv.btnAtualizaTable.addActionListener(this);
       // cvHome.btnExcluir.addActionListener(this);
       // cvHome.btnEditaCliente.addActionListener(this);
        //cvHome.btnCloseWin.addActionListener(this);

        preencheTabela(jv.tabelaJoin);
        
    }
    
    public void preencheTabela(JTable tabela) {
        DefaultTableModel tabelaC = new DefaultTableModel();
        tabelaC.addColumn("N_Dependente");
        tabelaC.addColumn("Num Part");
        tabelaC.addColumn("grauParentec");
        tabelaC.addColumn("nomeCandidato");
        Object[] coluna = new Object[4];
        
        ArrayList<InnerJoin> innerjoins = ijDAO.join();
        for (int i = 0; i < innerjoins.size(); i++) {
            coluna[0] = innerjoins.get(i).getNomeDependente();
            coluna[1] = innerjoins.get(i).getNumeroPartido();
            coluna[2] = innerjoins.get(i).getGrauParentesco();
            coluna[3] = innerjoins.get(i).getNomeCandidato();
            tabelaC.addRow(coluna);//pra cada linha adciona os parametros das colunas
        }
        tabela.setModel(tabelaC);//atribui a tabela que foi preenchida a tabela do parametro
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
