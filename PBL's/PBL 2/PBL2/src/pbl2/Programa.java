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
        DiasDaSemana dias = new DiasDaSemana(); 
        Hospedagem hospedagem = new Hospedagem(); 
        
        int inserirDias = 0 ;
        do{
            
        int e = Integer.parseInt(JOptionPane.showInputDialog("Escolha o dia da semana: \n1- domingo\n2 -segunda\n3 -terca\n4 -quarta"
                                                                                       + "\n5 -quinta\n6 - sexta\n 7 - sábado "));
        switch(e){
            
            case 1: dias.setDomingo();break;
            case 2: dias.setSegunda();break;
            case 3: dias.setTerca();break;
            case 4: dias.setQuarta();break;
            case 5: dias.setQuinta();break;
            case 6: dias.setSexta();break;
            case 7: dias.setSabado();break;
            
       
        }   
            hospedagem.setDiaDaSemana(dias);
            inserirDias  = JOptionPane.showConfirmDialog(null,"deseja inserir mais um dia?","Hospedagem",inserirDias);
        }while(inserirDias == 0);
        
        System.out.println("Dias escolhidos: "+dias.getDiaEscolhido());
        
    }


    
}
