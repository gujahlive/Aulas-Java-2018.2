/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package framework;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public abstract class Conteudo {

    protected double tamanho;
    protected String cor;
    
    public Conteudo(){
    }
    public Conteudo (double tamanho, String cor){
        this.tamanho = tamanho;
        this.cor = cor;
    }
    
    public double getTamanho() {
        return this.tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
 
    

    
}
