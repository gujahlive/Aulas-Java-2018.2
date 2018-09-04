/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package showinputsexemples;

import javax.swing.JOptionPane;

/**
 *
 * @author gusta
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // int dialogButton = JOptionPane.YES_NO_OPTION;
         //JOptionPane.showConfirmDialog (null, "Would You Like to Save your Previous Note First?","Warning",dialogButton);
        // TODO code application logic here
    
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(null, "Your Message", "Title on Box", dialogButton);
        if(dialogResult == 0) {
          System.out.println("Yes option");
        } else {
          System.out.println("No Option");
        }
        int statusButton = JOptionPane.YES_NO_OPTION;
        int statusResult = 0;
        do{
             statusResult = JOptionPane.showConfirmDialog(null, "Your Message", "Title on Box", statusButton);
        }while(statusResult == 0);
    
    
    
    }
    
}
