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
        cadeira1.cor = JOptionPane.showInputDialog("Qual a cor da cadeira?");
        cadeira1.material = JOptionPane.showInputDialog("Qual o material da cadeira?");
        cadeira1.altura = Float.parseFloat(JOptionPane.showInputDialog("Qual a Altura da cadeira?"));
        int braco = Integer.parseInt(JOptionPane.showInputDialog("BRAÇO\n1 - Sim \n 0 - Não"));
        if( braco == 1){
            cadeira1.personalizar(cadeira1.cor, cadeira1.material, true, cadeira1.altura);
        }
        System.out.println("Valor: "+cadeira1.valor);
        System.out.println("Cor: "+cadeira1.cor+ " Material: "+cadeira1.material +" Cadeira: " +cadeira1.braco+ " Altura: "+cadeira1.altura);
        // TODO code application logic here
    }
    
}
