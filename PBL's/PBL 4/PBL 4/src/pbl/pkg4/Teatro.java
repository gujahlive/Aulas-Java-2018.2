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
public class Teatro implements InterfacePontuacao{
    private Artista artista;
    private int contPontuacao;
    
  
    

    public int getContPontuacao() {
        return this.contPontuacao;
    }

    public void setContPontuacao(int contPontuacao) {
        this.contPontuacao = contPontuacao;
    }

    @Override
    public void calcPontuacao(int qtShow) {
            if(contPontuacao >= 1000){
          
        }
    }
    
    
    
}
