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

        Liquidificador liqui = new Liquidificador("Arno", 100, "110");
        FerroDePassar ferro = new FerroDePassar("Black & Decker", 100, "110");
        Batedeira batedeira = new Batedeira("Mondial", 100, "110");
        Tampa tampa = new Tampa();
        int e = Integer.parseInt(JOptionPane.showInputDialog("1 - Fabrica\n 2 - Loja"));
        switch (e) {
            case 1:
                int eF = Integer.parseInt(JOptionPane.showInputDialog("FABRICA: \n1 - Cadastrar Ferro\n 2 - Cadastrar Liquidificador\n3 - Cadastrar Batedeira"));
                switch (eF) {
                    
                    case 1:
                        ferro.setMarca(JOptionPane.showInputDialog("Marca:"));
                        ferro.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Preço")));
                        ferro.validaVoltagem(JOptionPane.showInputDialog("Voltagem:"));
                        ferro.calcDesconto(Integer.parseInt(JOptionPane.showInputDialog("Qual o mês da compra?")));

                        System.out.println("Marca: " + ferro.getMarca());
                        System.out.println("Voltagem: " + ferro.getVoltagem());

                        System.out.println("Valor da compra: " + ferro.getPreco());
                        break;

                    case 2:
                        tampa.setCor(JOptionPane.showInputDialog("Cor da tampa: "));
                        tampa.setDescricao(JOptionPane.showInputDialog("Descrição da Tampa: "));
                        liqui.setTampa(tampa);
                        
                        liqui.setMarca(JOptionPane.showInputDialog("Marca:"));
                        liqui.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Preço")));
                        liqui.validaVoltagem(JOptionPane.showInputDialog("Voltagem:"));
                        liqui.calcDesconto(Integer.parseInt(JOptionPane.showInputDialog("Qual o mês da compra?")));

                        System.out.println("Marca: " + liqui.getMarca());
                        System.out.println("Voltagem: " + liqui.getVoltagem());

                        System.out.println("Valor da compra: " + liqui.getPreco());
                        break;

                    case 3:
                        batedeira.setMarca(JOptionPane.showInputDialog("Marca:"));
                        batedeira.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Preço")));
                        batedeira.validaVoltagem(JOptionPane.showInputDialog("Voltagem:"));
                        batedeira.calcDesconto(Integer.parseInt(JOptionPane.showInputDialog("Qual o mês da compra?")));
                        batedeira.setQtHelices(Integer.parseInt(JOptionPane.showInputDialog("Quantas helices?")));
                        double qtL,
                         capacidade,
                         media;
                        qtL = Double.parseDouble(JOptionPane.showInputDialog("Quantos litros: "));
                        capacidade = Double.parseDouble(JOptionPane.showInputDialog("capacidade: "));
                        media = batedeira.mediaDeLtBatido(qtL, capacidade, 60);
                        System.out.println("Marca: " + batedeira.getMarca());
                        System.out.println("Voltagem: " + batedeira.getVoltagem());
                        System.out.println("media de capacidade do calculo que nem sei o que faz: " + media);
                        System.out.println("Valor da compra: " + batedeira.getPreco());
                        break;
                } break;
            case 2:
                int eL = Integer.parseInt(JOptionPane.showInputDialog("LOJA: \n1 - Cadastrar Ferro\n 2 - Cadastrar Liquidificador\n3 - Cadastrar Batedeira"));
                switch (eL) {
                    case 1:
                        ferro.setMarca(JOptionPane.showInputDialog("Marca:"));
                        ferro.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Preço")));
                        ferro.validaVoltagem(JOptionPane.showInputDialog("Voltagem:"));
                        ferro.calcDesconto(Integer.parseInt(JOptionPane.showInputDialog("Qual o mês da compra?")));

                        System.out.println("Marca: " + ferro.getMarca());
                        System.out.println("Voltagem: " + ferro.getVoltagem());

                        System.out.println("Valor da compra: " + ferro.getPreco());
                        break;

                    case 2:
                        
                        tampa.setCor(JOptionPane.showInputDialog("Cor da tampa: "));
                        tampa.setDescricao(JOptionPane.showInputDialog("Descrição da Tampa: "));
                        liqui.setTampa(tampa);
                        liqui.setMarca(JOptionPane.showInputDialog("Marca:"));
                        liqui.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Preço")));
                        liqui.validaVoltagem(JOptionPane.showInputDialog("Voltagem:"));
                        liqui.calcDesconto(Integer.parseInt(JOptionPane.showInputDialog("Qual o mês da compra?")));

                        System.out.println("Marca: " + liqui.getMarca());
                        System.out.println("Voltagem: " + liqui.getVoltagem());
                        System.out.println("Cor da tampa: "+liqui.getTampa().getCor());
                        System.out.println("Descricao da tampa: "+liqui.getTampa().getDescricao());
                        System.out.println("Valor da compra: " + liqui.getPreco());
                        break;

                    case 3:
                        batedeira.setMarca(JOptionPane.showInputDialog("Marca:"));
                        batedeira.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Preço")));
                        batedeira.validaVoltagem(JOptionPane.showInputDialog("Voltagem:"));
                        batedeira.calcDesconto(Integer.parseInt(JOptionPane.showInputDialog("Qual o mês da compra?")));
                        batedeira.setQtHelices(Integer.parseInt(JOptionPane.showInputDialog("Quantas helices?")));
                        double qtL,
                         capacidade,
                         media;
                        qtL = Double.parseDouble(JOptionPane.showInputDialog("Quantos litros: "));
                        capacidade = Double.parseDouble(JOptionPane.showInputDialog("capacidade: "));
                        media = batedeira.mediaDeLtBatido(qtL, capacidade, 60);
                        System.out.println("Marca: " + batedeira.getMarca());
                        System.out.println("Voltagem: " + batedeira.getVoltagem());
                        System.out.println("media de capacidade do calculo que nem sei o que faz: " + media);
                        System.out.println("Valor da compra: " + batedeira.getPreco());
                        break;
                }
                break;
        }

    }

    /* System.out.println("Antes do desconto: "+ferro.getPreco());   
        ferro.calcDesconto(5);
        ferro.validaVoltagem("11");
        System.out.println("Depois do desconto: "+ferro.getPreco());
        System.out.println("Validando Voltagem: "+ferro.getVoltagem());
        
        
        System.out.println("Antes do desconto: "+liqui.getPreco());   
        liqui.calcDesconto(8);
        System.out.println("Depois do desconto: "+liqui.getPreco());
        
        System.out.println("Antes do desconto: "+batedeira.getPreco());   
        batedeira.calcDesconto(12);
        System.out.println("Depois do desconto: "+batedeira.getPreco());*/
}
