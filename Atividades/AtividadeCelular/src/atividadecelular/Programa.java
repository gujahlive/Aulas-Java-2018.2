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
      int sair = 0;
      do{
      int e = Integer.parseInt(JOptionPane.showInputDialog("1 -FABRICA\n2- LOJA\n3- SAIR"));
      switch(e){
          case 1:
               Celular celular = new Celular(JOptionPane.showInputDialog("modelo:"),JOptionPane.showInputDialog("Marca: "),Integer.parseInt(JOptionPane.showInputDialog("Quantidade de Armazenamento em GigaByte: ")));
               System.out.println("\nMarca: "+celular.getMarca()+"\nModelo: "+celular.getModelo()+"\nQuantidade de Armazenameto: "+celular.getGBarm()+" GB");
               break;
          case 2:
              Celular celularPreco = new Celular(Float.parseFloat(JOptionPane.showInputDialog("Preço: ")),JOptionPane.showInputDialog("modelo:"),JOptionPane.showInputDialog("Marca: "),Integer.parseInt(JOptionPane.showInputDialog("Quantidade de Armazenamento em GigaByte: ")));
              System.out.println("Preço: "+celularPreco.getPreco()+"\nMarca: "+celularPreco.getMarca()+"\nModelo: "+celularPreco.getModelo()+"\nQuantidade de Armazenameto: "+celularPreco.getGBarm()+" GB");
              break;
          case 3: sair = 1;break;
      }
        
      }while(sair == 0);
// TODO code application logic here
    }
    
}
