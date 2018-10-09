/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
    
    public CandidatoController(CandidatoView candidato){
        this.cv = candidato;
        cv.btnSalvar.addActionListener(this);//a instancia da view passando o botão, e o metódo add passando por parametro a tela que é o this
        
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
       }
       
    }
    
}
