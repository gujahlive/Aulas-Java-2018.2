/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lojainstrumentosmusicais;

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
        Instrumento guitarra = new Guitarra();
        Instrumento violao = new Violao();
        Instrumento cavaco = new Cavaquinho();
        Funcionario gerente = new Gerente(1500);
        Vendedor vendedor = new Vendedor(1200);
        Funcionario luthier = new Luthier(1000);
        
        ArrayList<Guitarra> guitarras = new ArrayList<>();
        guitarra.setCor("Azivis");
        guitarra.setQtCordas(6);
        guitarra.setTamanho("M");
        guitarras.add((Guitarra) guitarra);
        System.out.println(": "+guitarras.get(0).getTamanho());
        
        
        
       /* int statusMenu = JOptionPane.YES_NO_OPTION;
        do {
            int e = Integer.parseInt(JOptionPane.showInputDialog("1 - Instrumentos\n2- Funcionários\n3 - sair"));
            switch (e) {
                case 1:
                    int ee = Integer.parseInt(JOptionPane.showInputDialog("1 - Guitarra\n2- Violão\n3 - Cavaquinho"));
                    switch (ee) {
                        case 1:
                            guitarra.setCor(JOptionPane.showInputDialog("Cor: ","Vermelha"));
                            guitarra.setQtCordas(Integer.parseInt(JOptionPane.showInputDialog("Quantidade de cordas: ","6")));
                            guitarra.setTamanho(JOptionPane.showInputDialog("Tamanho: ","Grande"));
                           
                            break;
                        case 2:
                            violao.setCor(JOptionPane.showInputDialog("Cor: ","Vermelha"));
                            violao.setQtCordas(Integer.parseInt(JOptionPane.showInputDialog("Quantidade de cordas: ","6")));
                            violao.setTamanho(JOptionPane.showInputDialog("Tamanho: ","Grande"));
                            break;
                        case 3:
                            cavaco.setCor(JOptionPane.showInputDialog("Cor: ","Vermelha"));
                            cavaco.setQtCordas(Integer.parseInt(JOptionPane.showInputDialog("Quantidade de cordas: ","6")));
                            cavaco.setTamanho(JOptionPane.showInputDialog("Tamanho: ","Grande"));
                            break;
                    }

                    break;

                case 2:
                    int eee = Integer.parseInt(JOptionPane.showInputDialog("1 - Gerente\n2- Vendedor\n3 - Luthier"));
                    switch (eee) {
                        case 1:
                            gerente.setNome(JOptionPane.showInputDialog("Nome: "));
                            gerente.setSobrenome(JOptionPane.showInputDialog("Nome: "));
                            
                            break;
                        case 2:
                            vendedor.setNome(JOptionPane.showInputDialog("Nome: "));
                            vendedor.setSobrenome(JOptionPane.showInputDialog("Nome: "));
                            vendedor.setNome(JOptionPane.showInputDialog("Nome: "));
                            break;
                        case 3:
                            luthier.setNome(JOptionPane.showInputDialog("Nome: "));
                            luthier.setSobrenome(JOptionPane.showInputDialog("Nome: "));
                            luthier.setNome(JOptionPane.showInputDialog("Nome: "));
                            break;
                    }

                    break;
                case 3: statusMenu = 1; break;

            }
            System.out.println("1");
            statusMenu = JOptionPane.showConfirmDialog(null, "Deseja Inserir Mais 1 ?", "Endereco", statusMenu);
        } while (statusMenu == 0);*/
        
        
        System.out.println("Vendedor: "+vendedor.getSalario());
        vendedor.bonificacao(guitarra, 6);
        
        
        // TODO code application logic here
    }

}
