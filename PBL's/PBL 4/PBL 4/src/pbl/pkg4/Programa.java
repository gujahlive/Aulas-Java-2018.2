/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbl.pkg4;

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
        // TODO code application logic here
        int qtApresentacoesDanc, qtApresentacoesCantor, qtApresentacoesAtor;
        Dancarino dancarino = new Dancarino();
        Cantor cantor = new Cantor();
        Ator ator = new Ator();
        
        int e;
        do {
            e = Integer.parseInt(JOptionPane.showInputDialog("1 - Dancarino\n2 - Cantor\n3 - Ator\n0 - sair"));
            switch (e) {
                case 1:
                    int verificad = 0;
                    do {

                        qtApresentacoesDanc = Integer.parseInt(JOptionPane.showInputDialog("Quantas apresentações o dançarino fez?"));
                        dancarino.calcPontuacao(qtApresentacoesDanc);
                        System.out.println("Pontuação total do teatro: " + dancarino.getPontos());
                        System.out.println("Saldo Dancarino: " + dancarino.getSaldoApresentacoes());
                        System.out.println("Gratuito Liberada?: "+dancarino.getLiberada());
                        verificad = JOptionPane.showConfirmDialog(null, "Inserir mais Apresentações?", "Dancarino", verificad);
                    } while (verificad == 0);

                    break;
                case 2:
                    int verificaA = 0;
                    do {
                        cantor.setAno_nasc(Integer.parseInt(JOptionPane.showInputDialog("Qual ano o Cantor nasceu?")));
                        qtApresentacoesDanc = Integer.parseInt(JOptionPane.showInputDialog("Quantas apresentações o cantor fez?"));
                        cantor.calcPontuacao(qtApresentacoesDanc);
                        System.out.println("Idade: " + cantor.getIdade());
                        System.out.println("Pontuação total do teatro: " + cantor.getPontos());
                        System.out.println("Saldo Cantor: " + cantor.getSaldoApresentacoes());
                        System.out.println("Gratuito Liberada?: "+cantor.getLiberada());

                        verificaA = JOptionPane.showConfirmDialog(null, "Inserir mais Apresentações?", "Dancarino", verificaA);
                    } while (verificaA == 0);

                    break;
                case 3:

                    int verifica = JOptionPane.showConfirmDialog(null, "Ator Formado?");
                    if (verifica == 1) {
                        ator.setFormado(false);
                    } else {
                        ator.setFormado(true);
                    }

                    qtApresentacoesAtor = Integer.parseInt(JOptionPane.showInputDialog("Quantas apresentações o ator fez?"));

                    ator.calcPontuacao(qtApresentacoesAtor);
                    System.out.println("Pontuação total do teatro: " + ator.getPontos());
                    System.out.println("Ator Formado: " + ator.isFormado());
                    System.out.println("Saldo ator: " + ator.getSaldoApresentacoes());
                    System.out.println("Gratuito Liberada?: "+ator.getLiberada());

                    break;
            }

        } while (e != 0);

        /* int verificad = 0;
        do {

            qtApresentacoesDanc = Integer.parseInt(JOptionPane.showInputDialog("Quantas apresentações o dançarino fez?"));
            dancarino.calcPontuacao(qtApresentacoesDanc);
            System.out.println("Pontuação total do teatro: " + dancarino.getPontos());
            System.out.println("Saldo: " + dancarino.getSaldoApresentacoes());
            verificad = JOptionPane.showConfirmDialog(null, "Inserir mais Apresentações?", "Dancarino", verificad);
        } while (verificad == 0);*///funfanuuu tudo!!! teste de saldo de apresentações batenuuu
   
        
    }

}
