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
public class Funcionario extends Pessoa {

    private int diaRecebidoParaContrucao;

    private boolean disponivel;

    public boolean isDisponivel() {
        return this.disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

}
