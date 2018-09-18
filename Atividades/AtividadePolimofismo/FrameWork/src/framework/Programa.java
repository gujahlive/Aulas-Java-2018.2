/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package framework;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Desktop desktop = new Desktop();
        Conteudo link = new Link();
        Conteudo paragrafo = new Paragrafo();
        Conteudo lista = new Lista();        
        
        link.setCor("Azivis");
        link.setTamanho(14);

        
        
        paragrafo.setCor("Verde");
        paragrafo.setTamanho(14);
       
        lista.setCor("Verde");
        lista.setTamanho(14);
        desktop.setConteudo(lista);
        desktop.setConteudo(link);
        desktop.setConteudo(paragrafo);
        ArrayList<Double> novosValores = new ArrayList<>();
        novosValores = desktop.redimensionar();
        for(int i =0 ; i<novosValores.size();i++){
            System.out.println("Conteudo: "+i+": "+novosValores.get(i));
        
        }
        
 
    }
    
}
