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
public class Ator extends Artista implements InterfacePontuacao{

  
    
    private boolean formado;
    

    public boolean isFormado() {
        return this.formado;
    }

    public void setFormado(boolean formado) {
        this.formado = formado;
    }

    @Override
    public void calcPontuacao(int qtShow) {
        this.saldoApresentacoes += qtShow;
        while(this.formado == true && this.saldoApresentacoes > 3) {
            Artista.setPontuacao(100);
            this.saldoApresentacoes -= 3;
        }
    }

  
    
    
}
