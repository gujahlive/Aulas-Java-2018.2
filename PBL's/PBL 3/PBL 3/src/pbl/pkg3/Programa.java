/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbl.pkg3;

import javax.swing.JOptionPane;

/**
 *
 * @author gusta
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        Liquidificador liqui = new Liquidificador("Arno", 100 ,"110");
        FerroDePassar ferro = new FerroDePassar("Black & Decker",100, "110");
        Batedeira batedeira = new Batedeira("Mondial", 100 ,"110");
        

       /* int e = Integer.parseInt(JOptionPane.showInputDialog("1 - Fabrica\n 2 - Loja"));
        switch (e) {
            case 1: break;
            case 2:break; 

                
        }*/
        
        System.out.println("Antes do desconto: "+ferro.getPreco());   
        ferro.calcDesconto(5);
        ferro.validaVoltagem("110");
        System.out.println("Depois do desconto: "+ferro.getPreco());
        System.out.println("Validando Voltagem: "+ferro.getVoltagem());
        
        
        System.out.println("Antes do desconto: "+liqui.getPreco());   
        liqui.calcDesconto(8);
        System.out.println("Depois do desconto: "+liqui.getPreco());
        
        System.out.println("Antes do desconto: "+batedeira.getPreco());   
        batedeira.calcDesconto(12);
        System.out.println("Depois do desconto: "+batedeira.getPreco());
    }

}
