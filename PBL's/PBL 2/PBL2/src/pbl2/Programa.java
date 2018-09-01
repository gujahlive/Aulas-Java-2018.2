/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbl2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author gusta
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        Passagem passagem = new Passagem();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String dataIda = JOptionPane.showInputDialog("Digite a data Ida");
        String dataVolta = JOptionPane.showInputDialog("Digite a data Volta");
        Date dataIdaDATE = formato.parse(dataIda);
        Date dataVoltaDATE = formato.parse(dataVolta);
        //Date data = formato.parse("23/11/2015");
 
        passagem.setDtIda(dataIdaDATE);
        passagem.setDtVolta(dataVoltaDATE);
        System.out.println("Data Ida: "+passagem.getDtIda());
        System.out.println("Data Volta: "+passagem.getDtVolta());
        
    }
    
}
