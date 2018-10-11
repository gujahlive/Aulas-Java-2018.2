/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.PessoaDAO;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Pessoa;
import view.*;

/**
 *
 * @author fran
 */
public class Controller implements ActionListener, KeyListener{
    JFCrud viewCRUD = new JFCrud();
    PessoaDAO pDAO = new PessoaDAO();
    
    public Controller(JFCrud viewCRUD, PessoaDAO pDAO){
        this.pDAO = pDAO;
        this.viewCRUD = viewCRUD;
        this.viewCRUD.btnAdd.addActionListener(this);
        this.viewCRUD.btnListar.addActionListener(this);
        this.viewCRUD.btnExcluir.addActionListener(this);
        this.viewCRUD.btnEditar.addActionListener(this);
        this.viewCRUD.btnedit.addActionListener(this);
        preencheTabela(viewCRUD.jtDados);
     //   this.viewCRUD.txtApelido.addKeyListener(this);
      //  this.viewCRUD.txtNome.addKeyListener(this);
        
    }
    
    public void preencheTabela(JTable tabela){
        DefaultTableModel tabelinha = new DefaultTableModel();
        tabela.setModel(tabelinha);
        tabelinha.addColumn("Id");
        tabelinha.addColumn("Nome");
        tabelinha.addColumn("Nick");
        Object [] coluna  = new Object[3];
        int numRegistros = pDAO.listaPessoa().size();
        for(int i = 0; i<numRegistros; i++){
            coluna [0] = pDAO.listaPessoa().get(i).getId();
            coluna[1] = pDAO.listaPessoa().get(i).getNome();
            coluna[2] = pDAO.listaPessoa().get(i).getNick();
            tabelinha.addRow(coluna);
        }
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == viewCRUD.btnAdd){
            
            String nome = viewCRUD.txtNome.getText();
            String nick = viewCRUD.txtApelido.getText();
            Pessoa p1 = new Pessoa();
            p1.setNome(nome);
            p1.setNick(nick);
            pDAO.inserePessoa(p1);
        }
        
        if(e.getSource() == viewCRUD.btnListar){
            preencheTabela(viewCRUD.jtDados);
        }
        if(e.getSource()==viewCRUD.btnEditar){
            int filaEditar = viewCRUD.jtDados.getSelectedRow();
            int numFS = viewCRUD.jtDados.getSelectedRowCount();
            if(filaEditar >=0 && numFS ==1){
                viewCRUD.txtID.setText(String.valueOf((viewCRUD.jtDados.getValueAt(filaEditar, 0))));
                viewCRUD.txtNome.setText(String.valueOf(viewCRUD.jtDados.getValueAt(filaEditar, 1)));
                viewCRUD.txtApelido.setText(String.valueOf(viewCRUD.jtDados.getValueAt(filaEditar, 2)));
                viewCRUD.btnAdd.setEnabled(false);
                viewCRUD.btnEditar.setEnabled(false);
                viewCRUD.btnExcluir.setEnabled(false);
                //Pessoa p = new Pessoa();
                //int[] colunas = viewCRUD.jtDados.getSelectedRows();
                
            }else{
                JOptionPane.showMessageDialog(null, "Selecione uma linha!");
            }

        }
        if(e.getSource() == viewCRUD.btnedit){
            int id = Integer.parseInt(viewCRUD.txtID.getText());
            String nome = viewCRUD.txtNome.getText();
            String apelido = viewCRUD.txtApelido.getText();
            Pessoa p1 = new Pessoa();
            p1.setNome(nome);
            p1.setNick(apelido);
            pDAO.editarPessoa(id, p1);
            
            limparElementos();
            viewCRUD.btnAdd.setEnabled(true);
            viewCRUD.btnEditar.setEnabled(true);
            viewCRUD.btnExcluir.setEnabled(true);
            viewCRUD.btnedit.setEnabled(false);
        }
        
        if(e.getSource() == viewCRUD.btnExcluir){
            int filainicio = viewCRUD.jtDados.getSelectedRow();
            
           
        
            Integer id = 0;
             id = Integer.parseInt(viewCRUD.jtDados.getValueAt(filainicio, 0).toString());
              pDAO.eliminarPessoa(id);
              preencheTabela(viewCRUD.jtDados);
         
                    
        }
    }
    
    public void limparElementos(){
        viewCRUD.txtApelido.setText("");
        viewCRUD.txtID.setText("");
        viewCRUD.txtNome.setText("");
    }

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
