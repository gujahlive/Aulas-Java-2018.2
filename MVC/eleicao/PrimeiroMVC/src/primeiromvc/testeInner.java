/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeiromvc;

import controller.InnerJoinController;
import model.DAO.InnerJoinDAO;
import views.JoinView;

/**
 *
 * @author gusta
 */
public class testeInner {
    public static void main(String[] args) {
        JoinView jv = new JoinView();
        InnerJoinDAO ind = new InnerJoinDAO();
        jv.setVisible(true);
        InnerJoinController inc = new InnerJoinController(jv,ind);
        
    
    }
}
