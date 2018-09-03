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
        int e = Integer.parseInt(JOptionPane.showInputDialog("1 - Fabrica\n 2 - Loja"));
        switch (e){
            case 1:
                Eletrodomestico eletro = new Eletrodomestico();
                eletro.marca = "Marca";
                eletro.voltagem = 110;
                Liquidificador liqui = new Liquidificador();
                liqui.marca = eletro.marca;
                liqui.voltagem = eletro.voltagem;
                FerroDePassar ferro = new FerroDePassar();
                ferro.marca = eletro.marca;
                ferro.voltagem = eletro.voltagem;
                Batedeira batedeira = new Batedeira();
                batedeira.marca = eletro.marca;
                batedeira.voltagem = eletro.voltagem;
                System.out.println("default: "+liqui.marca);
                
                
                break;
            case 2:break;
            
        }
    }
    
}
