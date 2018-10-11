/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudmvc;

import controller.Controller;
import dao.PessoaDAO;
import view.JFCrud;

/**
 *
 * @author fran
 */
public class Principal {
    public static void main(String[] args){
        JFCrud jf = new JFCrud();
        PessoaDAO pDAO = new PessoaDAO();
        Controller controller = new Controller(jf, pDAO);
        jf.setVisible(true);
        jf.setLocationRelativeTo(null);
    }
}
