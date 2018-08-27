/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadeira;

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
        Cadeira cadeiras = new Cadeira();
        Cadeira cadeira;
        
        boolean braco;
            cadeira = new Cadeira();
          //  cadeira.setCor(JOptionPane.showInputDialog("Cor: "));
         //   cadeira.setMaterial(JOptionPane.showInputDialog("Material: "));
            cadeira.setAltura(Float.parseFloat(JOptionPane.showInputDialog("Altura: ")));
            int verifica = JOptionPane.showConfirmDialog(null, "a dadeira tem braço?");
            if(verifica == 1){
                  braco = false;
             }else braco = true;
            cadeira.setBraco(braco);
            cadeira.precificar();
            cadeiras = cadeira;
            
             Material material = new Material();
             material.setCor("Azivis");
             material.setPeso(0.8);
             material.setPreco(40);
             cadeira.setMaterial(material);
    
        
    
    
            System.out.println("Material: "+cadeiras.getMaterial()+" Cor: "+cadeira.getMaterial().getCor()+ " Altura: "+cadeiras.getAltura()+" Braço: "+cadeiras.getBraco()+" Valor: "+cadeiras.getValor());
            System.out.println(" Cor: "+cadeira.getMaterial().getCor()+"Peso: "+cadeira.getMaterial().getPeso()+"Preço Material: "+cadeira.getMaterial().getPreco());
       
            
        
        
        // TODO code application logic here
    }
    
}
