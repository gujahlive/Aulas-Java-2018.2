/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadecadeira;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class AtividadeCadeira {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cadeira cadeira1 = new Cadeira();
        String cor = JOptionPane.showInputDialog("Qual a cor da cadeira?");
        //cadeira1.cor = JOptionPane.showInputDialog("Qual a cor da cadeira?");
       // cadeira1.material = JOptionPane.showInputDialog("Qual o material da cadeira?");
        String material = JOptionPane.showInputDialog("Qual o material da cadeira?");
        //cadeira1.altura = Float.parseFloat(JOptionPane.showInputDialog("Qual a Altura da cadeira?"));
        float altura = Float.parseFloat(JOptionPane.showInputDialog("Qual a Altura da cadeira?"));
        boolean braco;
        int verifica = JOptionPane.showConfirmDialog(null, "a dadeira tem braço?");
        if(verifica == 1){
            braco = false;
        }else braco = true;
        
        cadeira1.personalizar(cor, material, braco, altura);
        cadeira1.precificar();
            
        
        System.out.println("Valor: "+cadeira1.valor+" Braço: "+cadeira1.braco);
        System.out.println("Cor: "+cadeira1.cor+ " Material: "+cadeira1.material +" Cadeira: " +cadeira1.braco+ " Altura: "+cadeira1.altura);
        // TODO code application logic here
    }
    
}
