/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package floricultura;

import java.util.ArrayList;
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
        Planta azaleia = new Azaleia();
        Planta violeta = new Violeta();
        Planta orquidia = new Orquidia();
        Vaso vaso = new Vaso();

       // int ep = Integer.parseInt(JOptionPane.showInputDialog("1 - vaso\n2 - planta"));
        int statusMenu = JOptionPane.YES_NO_OPTION;

        //do{   
        // switch(ep){
        //  case 1:
        int verificaMaterialVaso = Integer.parseInt(JOptionPane.showInputDialog("1 - Plástico\n2 - Barro"));
        if (verificaMaterialVaso == 1) {
            vaso.setMaterial("plastico");
        }
        if (verificaMaterialVaso == 2) {
            vaso.setMaterial("barro");
        }
        int verificaTamanhoVaso = Integer.parseInt(JOptionPane.showInputDialog("1 - Pequeno\n2 - Medio\n3 - Grande"));
        if (verificaTamanhoVaso == 1) {
            vaso.setTamanho("P");
        }
        if (verificaTamanhoVaso == 2) {
            vaso.setTamanho("M");
        }
        if (verificaTamanhoVaso == 3) {
            vaso.setTamanho("G");
        }
        vaso.setValor();
        //  break;
        //case 2:
      //  int e = Integer.parseInt(JOptionPane.showInputDialog("1 - Azaleia\n2 - Violeta\n3 - Orquidia"));
        //  switch (e) {
        // case 1:
        azaleia.setCodigo(JOptionPane.showInputDialog("Codigo: ", "@z@le1A"));
        azaleia.setEspecificacao(JOptionPane.showInputDialog("Especificação: ", "Para casa"));

        azaleia.setDia(Integer.parseInt(JOptionPane.showInputDialog("Dia: ", "1")));
        azaleia.setDiaRegado(Integer.parseInt(JOptionPane.showInputDialog("Dia regado: ", "5")));
        azaleia.setVaso(vaso);
        azaleia.setTipo(azaleia);
        
        System.out.println("Valor total da planta: " + azaleia.getValor());//azaleia material plastico tam g return 16
        System.out.println("Valor do vaso: "+vaso.getValor());
        System.out.println("Material: "+vaso.getMaterial());
        System.out.println("Tamanho: "+vaso.getTamanho());
        // break;

        //  case 2:
        /* violeta.setCodigo(JOptionPane.showInputDialog("Codigo: ", "@z@le1A"));
        violeta.setEspecificacao(JOptionPane.showInputDialog("Especificação: ", "Para casa"));
        
        violeta.setDia(Integer.parseInt(JOptionPane.showInputDialog("Dia: ", "1")));
        violeta.setDiaRegado(Integer.parseInt(JOptionPane.showInputDialog("Dia regado: ", "5")));
        violeta.setTipo(violeta);
        //   break;
        //   case 3:
        orquidia.setCodigo(JOptionPane.showInputDialog("Codigo: ", "@z@le1A"));
        orquidia.setEspecificacao(JOptionPane.showInputDialog("Especificação: ", "Para casa"));
        
        orquidia.setDia(Integer.parseInt(JOptionPane.showInputDialog("Dia: ", "1")));
        orquidia.setDiaRegado(Integer.parseInt(JOptionPane.showInputDialog("Dia regado: ", "5")));
        orquidia.setTipo(orquidia);*/
        //   break;
       // System.out.println("Desc: " + azaleia.getDesc());
    }

    //  break;
    //}
    //  statusMenu = JOptionPane.showConfirmDialog(null, "menu?", "Menu", statusMenu);
    // }while(statusMenu == 0);
    /*
       vaso.setMaterial("barro");
       vaso.setTamanho("p");
       azaleia.setVaso(vaso);
       System.out.println("Azaleia: "+azaleia.getVaso().getMaterial());
     */
    // TODO code application logic here
    //}
}
