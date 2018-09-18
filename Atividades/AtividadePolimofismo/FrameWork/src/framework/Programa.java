/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package framework;

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
        link.setCor("Azivis");
        link.setTamanho(14);
        
        desktop.setConteudo(link);
        double tamanhoNovo = desktop.redimensionar();
        System.out.println("Tamanho original do link: "+desktop.getConteudo().getTamanho());
        System.out.println("Tamanho modificado do link: "+tamanhoNovo);
 
    }
    
}
