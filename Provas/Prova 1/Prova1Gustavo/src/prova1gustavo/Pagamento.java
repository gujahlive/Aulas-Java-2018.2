/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova1gustavo;

/**
 *
 * @author aluno
 */
public class Pagamento {

    private Movel movel;

    private int duracaoEmDias;

    public int getDuracaoEmDias() {
        return this.duracaoEmDias;
    }

    public void setDuracaoEmDias(int duracaoEmDias) {
        this.duracaoEmDias = duracaoEmDias;
    }

    public double precificarMovel(int duracaoDaContrucao) {

        if (duracaoDaContrucao <= 10) {
            Movel.setPreco(300);
        }
        if (duracaoDaContrucao > 10 && duracaoDaContrucao <= 20) {
            Movel.setPreco(500);
        }
        if (duracaoDaContrucao > 20) {
            Movel.setPreco(1000);
        }

        return Movel.getPreco();

    }

}
