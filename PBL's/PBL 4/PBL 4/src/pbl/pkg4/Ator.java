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
        if(this.isFormado() == true && qtShow > 3){
            Artista.setPontuacao(100);
        }   
    }

    @Override
    public boolean liberaShowGratis() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
