/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lojainstrumentosmusicais;

import java.util.ArrayList;

/**
 *
 * @author gusta
 */
public abstract class Instrumento {
    protected String cor,tamanho;
    protected int qtCordas;
    protected ArrayList<Guitarra> guitarras;
    public Instrumento(){
        this.guitarras = new ArrayList<>();
    }
    public void setGuitarra(Guitarra guitarra){
         guitarras.add(guitarra);
    }
    public ArrayList<Guitarra> getGuitarras(){
        return this.guitarras;
    }
    
    public void setCor(String cor){
        this.cor = cor;
    }
    public String getCor(){
        return this.cor;
    }
    public void setTamanho(String tamanho){
        this.tamanho = tamanho;
    }
    public String getTamanho(){
        return this.tamanho;
    }
    public void setQtCordas(int qtCordas){
        this.qtCordas = qtCordas;
    }
    public int getQtCordas(){
        return this.qtCordas;
    }
    
    
    
}
