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
          Dispositivo cel = new Celular();
      //  Dispositivo tab = new Tablet();
      //  Dispositivo note = new Notebook();
        Dispositivo pc = new Desktop();
        Paragrafo paragrafoPC = new Paragrafo(220,"Azul");
        Responsividade rPC = new Responsividade(110,"Teste");
        
        Conteudo conteudo = new Conteudo(110,"Vermelho");
        
        pc.setConteudo(conteudo);
       
        
        
        System.out.println("Tamanho: "+pc.getConteudo().getTamanho());
        System.out.println("Cor: "+pc.getConteudo().getCor());
         pc.setResponsividade(rPC);
        System.out.println("Tamanho: "+pc.getConteudo().getTamanho());
        System.out.println("Cor: "+pc.getConteudo().getCor());
    }
    
}
