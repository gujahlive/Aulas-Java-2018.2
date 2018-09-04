/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbl.pkg3;

import javax.swing.JOptionPane;

/**
 *
 * @author gusta
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Eletrodomestico eletro = new Eletrodomestico();
        eletro.marca = "Marca";
        eletro.voltagem = 110;
        Liquidificador liqui = new Liquidificador();
        liqui.marca = eletro.marca;
        liqui.voltagem = eletro.voltagem;
        FerroDePassar ferro = new FerroDePassar();
        ferro.marca = eletro.marca;
        ferro.voltagem = eletro.voltagem;
        Batedeira batedeira = new Batedeira();
        batedeira.marca = eletro.marca;
        batedeira.voltagem = eletro.voltagem;
        Tampa tampa = new Tampa();

        Liquidificador liquiL = new Liquidificador();
        FerroDePassar ferroL = new FerroDePassar();
        Batedeira batedeiraL = new Batedeira();
        

        int e = Integer.parseInt(JOptionPane.showInputDialog("1 - Fabrica\n 2 - Loja"));
        switch (e) {
            case 1:

                System.out.println("default: " + liqui.marca);

                break;
            case 2:
                int statusButton = JOptionPane.YES_NO_OPTION;
                int statusTampa = 0;
                do{
                    Tampa tampaL = new Tampa();
                    tampaL.setCor(JOptionPane.showInputDialog("Qual a cor da tampa?"));
                    tampaL.setDescricao(JOptionPane.showInputDialog("Qual a descrição da tampa?"));
                    liquiL.setTampa(tampaL);
                   statusTampa = JOptionPane.showConfirmDialog(null, "Deseja Cadastrar Mais Tampas?", "Cadastro de Tampa", statusButton);
                   liquiL.contTampas();
                }while(statusTampa == 0);
                
                 for(int i = 0 ; i < liquiL.getContTampas() ; i++ ){
                    System.out.println("Cor da tampa do Liquidificador: " + liquiL.getTampa().get(i).getCor()+" Descrição da tampa do liquidificador: "+liquiL.getTampa().get(i).getDescricao());
                }
                
                break;

                
                 
                
        }
        
           
        
        
    }

}
