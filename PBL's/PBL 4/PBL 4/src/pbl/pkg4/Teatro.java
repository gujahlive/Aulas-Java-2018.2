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
public class Teatro implements InterfacePontuacao{
    private Artista artista;
    private int contPontuacao;
    

    @Override
    public int calcPontuacao() {
        if(contPontuacao >= 1000){
            return 1;
        }return 1;
    }
     @Override
    public boolean liberaShowGratis(){
           if(contPontuacao >= 1000){
            return true;
        }else return false; 
    }

    public int getContPontuacao() {
        return this.contPontuacao;
    }

    public void setContPontuacao(int contPontuacao) {
        this.contPontuacao = contPontuacao;
    }
    
    
    
}
