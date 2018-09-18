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
public class Celular extends Dispositivo {

        public Celular(){
        this.conteudos = new ArrayList<>();
    }
    
        @Override
    public ArrayList<Double> redimensionar() { 
        
    ArrayList<Double> novosTam = new ArrayList<Double>();
        double novoTam;
        for(int i=0 ; i<this.conteudos.size();i++){
        if (this.conteudos.get(i) instanceof Lista || this.conteudos.get(i) instanceof Paragrafo) {
            novoTam = this.conteudos.get(i).getTamanho();
            novoTam += novoTam * 1.5;
           novosTam.add(novoTam);

        }else{
        novoTam = this.conteudos.get(i).getTamanho(); 
        novoTam += novoTam * 1.2;
        
        } 
        }
            return novosTam;        
   
    
    }
    
}
