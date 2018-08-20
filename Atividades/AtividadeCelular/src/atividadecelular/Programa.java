/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadecelular;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // 
        
      int e = Integer.parseInt(JOptionPane.showInputDialog("1 -FABRICA\n2- LOJA"));
      switch(e){
          case 1:
               Celular celular = new Celular(JOptionPane.showInputDialog("modelo:"),JOptionPane.showInputDialog("Marca: "),Integer.parseInt(JOptionPane.showInputDialog("Quantidade de Armazenamento em GigaByte: ")));
               System.out.println("\nMarca: "+celular.getMarca()+"\nModelo: "+celular.getModelo()+"\nQuantidade de Armazenameto: "+celular.getGBarm()+" GB");
               break;
          case 2:
              Celular celularPreco = new Celular(Float.parseFloat(JOptionPane.showInputDialog("Preço: ")),JOptionPane.showInputDialog("modelo:"),JOptionPane.showInputDialog("Marca: "),Integer.parseInt(JOptionPane.showInputDialog("Quantidade de Armazenamento em GigaByte: ")));
              System.out.println("Preço: "+celularPreco.getPreco()+"\nMarca: "+celularPreco.getMarca()+"\nModelo: "+celularPreco.getModelo()+"\nQuantidade de Armazenameto: "+celularPreco.getGBarm()+" GB");
              break;
      }
        // TODO code application logic here
    }
    
}
