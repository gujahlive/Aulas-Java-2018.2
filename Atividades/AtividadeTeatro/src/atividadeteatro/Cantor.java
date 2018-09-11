/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadeteatro;

/**
 *
 * @author aluno
 */
public class Cantor extends Artista implements InterfacePontuacao{
    private Banda banda;
    private int idade;
    private static int EspetaculosRealizados;
    private static int pontuacaoAtual;

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Banda getBanda() {
        return this.banda;
    }

    public void setBanda(Banda banda) {
        this.banda = banda;
    }

    @Override
    public int calcPontuacao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
