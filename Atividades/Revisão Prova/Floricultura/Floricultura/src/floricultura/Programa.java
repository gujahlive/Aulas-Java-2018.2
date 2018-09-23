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

        int statusMenu = JOptionPane.YES_NO_OPTION;

        do {
            int ep = Integer.parseInt(JOptionPane.showInputDialog("1 - vaso\n2 - planta"));
            switch (ep) {
                case 1:
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
                    break;
                case 2:
                    int e = Integer.parseInt(JOptionPane.showInputDialog("1 - Azaleia\n2 - Violeta\n3 - Orquidia"));
                    switch (e) {
                        case 1:
                            azaleia.setCodigo(JOptionPane.showInputDialog("Codigo: ", "@z@le1A"));
                            azaleia.setEspecificacao(JOptionPane.showInputDialog("Especificação: ", "Para casa"));

                            azaleia.setDia(Integer.parseInt(JOptionPane.showInputDialog("Dia: ", "1")));
                             azaleia.setDiaRegado(Integer.parseInt(JOptionPane.showInputDialog("Dia regado: ", "5")));
                            boolean regado =  azaleia.regar(Integer.parseInt(JOptionPane.showInputDialog("quantos dias para regar: ", "2")));
                           boolean adubar =  azaleia.regar(Integer.parseInt(JOptionPane.showInputDialog("quantos dias para Adubar: ", "91")));
                            azaleia.setVaso(vaso);
                            azaleia.setTipo(azaleia);

                            System.out.println("Valor total da planta: " + azaleia.getValor());//azaleia material plastico tam g return 16
                            System.out.println("Valor do vaso: " + vaso.getValor());
                            System.out.println("Material: " + vaso.getMaterial());
                            System.out.println("Tamanho: " + vaso.getTamanho());
                            System.out.println("Regado: "+regado);
                            System.out.println("Adubar: "+adubar);
                            break;

                        case 2:
                            violeta.setCodigo(JOptionPane.showInputDialog("Codigo: ", "@z@le1A"));
                            violeta.setEspecificacao(JOptionPane.showInputDialog("Especificação: ", "Para casa"));

                            violeta.setDia(Integer.parseInt(JOptionPane.showInputDialog("Dia: ", "1")));
                            violeta.setDiaRegado(Integer.parseInt(JOptionPane.showInputDialog("Dia regado: ", "5")));
                            violeta.setVaso(vaso);
                            violeta.setTipo(violeta);
                            
                            System.out.println("Valor total da planta: " + violeta.getValor());//azaleia material plastico tam g return 16
                            System.out.println("Valor do vaso: " + vaso.getValor());
                            System.out.println("Material: " + vaso.getMaterial());
                            System.out.println("Tamanho: " + vaso.getTamanho());
                            break;
                        case 3:
                            orquidia.setCodigo(JOptionPane.showInputDialog("Codigo: ", "123Orqui"));
                            orquidia.setEspecificacao(JOptionPane.showInputDialog("Especificação: ", "Para casa"));
                            orquidia.setDia(Integer.parseInt(JOptionPane.showInputDialog("Dia: ", "1")));
                            orquidia.setDiaRegado(Integer.parseInt(JOptionPane.showInputDialog("Dia regado: ", "5")));
                            orquidia.setVaso(vaso);
                            orquidia.setTipo(orquidia);
                            
                            System.out.println("Valor total da planta: " + orquidia.getValor());//azaleia material plastico tam g return 16
                            System.out.println("Valor do vaso: " + vaso.getValor());
                            System.out.println("Material: " + vaso.getMaterial());
                            System.out.println("Tamanho: " + vaso.getTamanho());
                            break;
                        // System.out.println("Desc: " + azaleia.getDesc());
                    }

                // break;
            }
            statusMenu = JOptionPane.showConfirmDialog(null, "menu?", "Menu", statusMenu);
            //break;
        } while (statusMenu == 0);
        /*
       vaso.setMaterial("barro");
       vaso.setTamanho("p");
       azaleia.setVaso(vaso);
       System.out.println("Azaleia: "+azaleia.getVaso().getMaterial());
         */
        // TODO code application logic here
    }
}
