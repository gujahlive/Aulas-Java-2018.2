/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade2slideportacasaedificio;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Porta porta = new Porta();
       
       System.out.println("Porta: "+porta.estaAberta());
       
       int statusPorta = Integer.parseInt(JOptionPane.showInputDialog("1 - abrir\n2 - fechar"));
       if(statusPorta == 1){
           porta.abre();
       }else porta.fecha();
       System.out.println("Porta: "+porta.estaAberta()); 
       int statusCor = 0;
       
       do{
       
       porta.pinta(JOptionPane.showInputDialog("Qual a cor da porta?"));
       System.out.println("Cor atual da porta: "+  porta.getCor());
       statusCor = Integer.parseInt(JOptionPane.showInputDialog("deseja pintar a porta?\n1 - sim\n0 - não"));
       }while(statusCor == 1);
       
        // TODO code application logic here
    }
    
}
