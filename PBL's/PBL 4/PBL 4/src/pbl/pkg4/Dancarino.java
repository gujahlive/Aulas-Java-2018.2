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
public class Dancarino extends Artista implements InterfacePontuacao{

    @Override
    public int calcPontuacao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    //pontuação total não será chamada com o this, será chamada pelo artista
    
    public double calcularPontuacao(int qtShow){
        if(qtShow >= 5){
            Artista.setPontuacao(100);
            return 100;
        }else return 0;
    }
}
