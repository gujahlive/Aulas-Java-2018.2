

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeiraaplicacao;

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
        int x = Integer.parseInt(JOptionPane.showInputDialog("Digite um Valor"));
       // int x = 10;
        int y = 20;
        int r = x + y;
        System.out.println("x: "+x+" y: "+y+" Resultado: " +r+" ou "+(x+y));
        System.out.println("Ctrl + espaço = importa");
        
       
        // TODO code application logic here
    }
    
}
