/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbl.pkg4;

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
        // TODO code application logic here
        int qtApresentacoesDanc, qtApresentacoesCantor,qtApresentacoesAtor;
        Dancarino dancarino = new Dancarino();
        Cantor cantor = new Cantor();
        Ator ator = new Ator();
        
        qtApresentacoesDanc = Integer.parseInt(JOptionPane.showInputDialog("Quantas apresentações o dançarino fez?"));
        dancarino.calcPontuacao(qtApresentacoesDanc);
        dancarino.setQtApresentacao(qtApresentacoesDanc);
        System.out.println("Pontuação total do teatro: "+dancarino.getPontos());
        
        cantor.setAno_nasc(Integer.parseInt(JOptionPane.showInputDialog("Qual o ano de nasc do canto: ")));
        //cantor.setQtApresentacao(Integer.parseInt(JOptionPane.showInputDialog("Quantas apresentações o cantor fez?")));
       qtApresentacoesCantor = Integer.parseInt(JOptionPane.showInputDialog("Quantas apresentações o cantor fez?"));
        cantor.calcPontuacao(qtApresentacoesCantor);
        cantor.setQtApresentacao(qtApresentacoesCantor);
        System.out.println("dancarino.getPontos(): "+dancarino.getPontos());
        System.out.println("cantor.getPontos(): "+cantor.getPontos());
         System.out.println("dancarino.getPontuacaoTotal(): "+dancarino.getPontuacaoTotal());/*/
    /*  qtApresentacoesAtor =  Integer.parseInt(JOptionPane.showInputDialog("Quantas apresentações o ator fez?"));
      ator.setQtApresentacao(qtApresentacoesAtor);
    ator.setQtApresentacao(Integer.parseInt(JOptionPane.showInputDialog("Quantas apresentações o ator fez?")));
        boolean formado;
        int verifica = JOptionPane.showConfirmDialog(null, "O ator é formado?");
        if(verifica == 1){
            formado = false;
        }else formado = true;
       ator.setFormado(formado);
     
        System.out.println("Pontuação total do teatro: "+ator.getPontuacaoTotal());
         System.out.println("Pontuação total do teatro: "+ator.getPontos());*/
    }
    
}
