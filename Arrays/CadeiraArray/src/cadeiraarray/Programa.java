/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadeiraarray;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i;
        Cadeira[] cadeiras = new Cadeira[2];
        Cadeira cadeira;
        for(i=0 ; i<2 ; i++){
            cadeira = new Cadeira();
            cadeira.setAltura(Float.parseFloat(JOptionPane.showInputDialog("Altura")));
            cadeiras[i] = cadeira;
            
        }
        for(i=0 ; i<2 ; i++){
            System.out.println("Altura: "+cadeiras[i].getAltura());
            
        }
        // TODO code application logic here
    }
    
}
