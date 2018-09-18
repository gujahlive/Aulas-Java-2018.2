/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package framework;

//import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public abstract class Dispositivo   {
    protected Conteudo conteudo;

    public Conteudo getConteudo() {
        return this.conteudo;
    }

    public void setConteudo(Conteudo conteudo) {
        this.conteudo = conteudo;
    }
    

          
    public abstract double  redimensionar();

   
}
