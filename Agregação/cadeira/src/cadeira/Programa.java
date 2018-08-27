/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadeira;

import java.util.ArrayList;
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
        
        int i;
        Cadeira cadeira = new Cadeira();
    
        
        boolean braco;
          
          //  cadeira.setCor(JOptionPane.showInputDialog("Cor: "));
         //   cadeira.setMaterial(JOptionPane.showInputDialog("Material: "));
            cadeira.setAltura(Float.parseFloat(JOptionPane.showInputDialog("Altura: ")));
            int verifica = JOptionPane.showConfirmDialog(null, "a dadeira tem braço?");
            if(verifica == 1){
                  braco = false;
             }else braco = true;
            cadeira.setBraco(braco);
            cadeira.precificar();
             
            ArrayList<Material> materiais = new ArrayList();
            for (i = 0 ; i< 3; i++){
                             Material material = new Material();
                              material.setCor("Azivis");
                                material.setPeso(0.8);
                                  material.setPreco(40);
                                  materiais.add(material);
         
            
            }
            cadeira.setMateriais(materiais);

   //         cadeira.setMaterial(material);
           System.out.println(" Cor: "+cadeira.getMaterial().get(0).getCor()+ " Altura: "+cadeira.getAltura()+" Braço: "+cadeira.getBraco()+" Valor: "+cadeira.getValor());
            System.out.println(" Cor: "+cadeira.getMaterial().get(0).getCor()+"Peso: "+cadeira.getMaterial().get(0).getPeso()+"Preço Material: "+cadeira.getMaterial().get(0).getPreco());// retornando o indice estático do material
          for(i = 0 ; i< 3; i++){
               System.out.println(" Cor: "+cadeira.getMaterial().get(i).getCor()+"Peso: "+cadeira.getMaterial().get(i).getPeso()+"Preço Material: "+cadeira.getMaterial().get(i).getPreco());// retornando o indice estático do material
          }
          
       
             
            
        
        
        // TODO code application logic here
    }
    
}
