/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade2slideportacasaedificio;

//import java.util.ArrayList;
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
        ////////////////////////////////////////////////////////////////////////////////////////////
        ///////////////////////////////PARTE TESTE CLASSE PORTA ///////////////////////////////////////
        ///////////////////////////////////////////////////////////////////////////////////////////////
       /*    Porta porta = new Porta();
        Casa casa = new Casa();
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
        porta.setDimensaoX(Float.parseFloat(JOptionPane.showInputDialog("Dimensão X: ")));
        porta.setDimensaoY(Float.parseFloat(JOptionPane.showInputDialog("Dimensão Y: ")));
        porta.setDimensaoZ(Float.parseFloat(JOptionPane.showInputDialog("Dimensão Z: ")));
        System.out.println("Dimensão X: "+porta.getDimensaoX()+" Dimensão Y: "+ porta.getDimensaoY()+" Dimensão Z: "+porta.getDimensaoZ() );

         */
       
       
        /////////////////////////////////////////////////////////////////////////////////////////////
        ///////////////////////////////PARTE TESTE CLASSE CASA ////////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////////////////////////////////////
        
        Casa casa = new Casa();
        casa.pinta(JOptionPane.showInputDialog("Qual a cor da casa? "));
        
        int statusInserirPorta;
        do {
            Porta porta = new Porta();
            int statusPorta = Integer.parseInt(JOptionPane.showInputDialog("1 - abrir\n2 - fechar"));
            if (statusPorta == 1) {
                porta.abre();
            } else {
                porta.fecha();
          }
            int statusCor;
            do {

                porta.pinta(JOptionPane.showInputDialog("Qual a cor da porta?"));
                System.out.println("Cor atual da porta: " + porta.getCor());
                statusCor = Integer.parseInt(JOptionPane.showInputDialog("deseja pintar a porta?\n1 - sim\n0 - não"));
            } while (statusCor == 1);
            porta.setDimensaoX(Float.parseFloat(JOptionPane.showInputDialog("Dimensão X: ")));
            porta.setDimensaoY(Float.parseFloat(JOptionPane.showInputDialog("Dimensão Y: ")));
            porta.setDimensaoZ(Float.parseFloat(JOptionPane.showInputDialog("Dimensão Z: ")));
            System.out.println("Dimensão X: " + porta.getDimensaoX() + " Dimensão Y: " + porta.getDimensaoY() + " Dimensão Z: " + porta.getDimensaoZ());
            statusInserirPorta = Integer.parseInt(JOptionPane.showInputDialog("deseja inserir mais uma porta?\n1 - sim\n0 - não"));
            casa.cadastrarPortas(porta);//o parametro é do tipo porta
            //casa.setPorta(porta); metodo cadastrar porta seta a porra da porta
            
        } while (statusInserirPorta == 1);
        
        for(int i = 0; i < casa.getTotalDePortas() ; i++){
            //System.out.println("PORTA "+(i+1)+": "+"");
        }
         System.out.println("\nTotal de Portas: "+casa.getTotalDePortas());
         System.out.println("Total de Portas Abertas: "+casa.qtPortasAbertas());

    
         /////////////////////////////////////////////////////////////////////////////////////////////
        ///////////////////////////////PARTE TESTE CLASSE EDFICIO ////////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////////////////////////////////////
  
    
    
    }

}
