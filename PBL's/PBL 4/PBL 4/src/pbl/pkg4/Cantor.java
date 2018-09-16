/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbl.pkg4;

/**
 *
 * @author aluno
 */
public class Cantor extends Artista implements InterfacePontuacao {

    private Banda banda;
    private int idade;
    private static int EspetaculosRealizados;
    private static int pontuacaoAtual;

    public int getIdade() {
        return this.idade;
    }

    public Banda getBanda() {
        return this.banda;
    }

    public void setBanda(Banda banda) {
        this.banda = banda;
    }

    @Override
    public void calcPontuacao(int qtShow) {
        this.idade = 2018 - this.ano_nasc;
        this.saldoApresentacoes += qtShow;
        while (this.idade > 18 && this.saldoApresentacoes >= 3) {
            Artista.setPontuacao(100);
            this.saldoApresentacoes -= 3;
        }
    }

}
