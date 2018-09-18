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
public class Tablet extends Dispositivo {
      public Tablet(){
        this.conteudos = new ArrayList<>();
    }

    @Override
    public ArrayList<Double> redimensionar() {
        ArrayList<Double> novosTam = new ArrayList<Double>();
        double novoTam;
        for (int i = 0; i < this.conteudos.size(); i++) {
            novoTam = this.conteudos.get(i).getTamanho();
            novosTam.add(novoTam);
        }

        return novosTam;

    }
}
