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
        Cadeira[] cadeiras = new Cadeira[2];
        Cadeira cadeira;
        
        boolean braco;

        
        for(i=0 ; i<2 ; i++){
            cadeira = new Cadeira();
            cadeira.setCor(JOptionPane.showInputDialog("Cor: "));
         //   cadeira.setMaterial(JOptionPane.showInputDialog("Material: "));
            cadeira.setAltura(Float.parseFloat(JOptionPane.showInputDialog("Altura: ")));
            int verifica = JOptionPane.showConfirmDialog(null, "a dadeira tem braço?");
            if(verifica == 1){
                  braco = false;
             }else braco = true;
            cadeira.setBraco(braco);
            cadeira.precificar();
            cadeiras[i] = cadeira;
            
        }
        for(i=0 ; i<2 ; i++){
            System.out.println("Material: "+cadeiras[i].getMaterial()+" Cor: "+cadeiras[i].getCor()+
                    " Altura: "+cadeiras[i].getAltura()+" Braço: "+cadeiras[i].getBraco()+" Valor: "+cadeiras[i].getValor());
            
        }
            
        
        
        // TODO code application logic here
    }
    
}
