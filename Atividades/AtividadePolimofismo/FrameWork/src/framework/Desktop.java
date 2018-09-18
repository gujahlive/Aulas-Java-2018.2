/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package framework;

/**
 *
 * @author gusta
 */
public class Desktop extends Dispositivo {

    @Override
    public double redimensionar() {
        double novoTam=0;
        if (this.conteudo instanceof Lista || this.conteudo instanceof Paragrafo) {
            novoTam = this.conteudo.getTamanho();
            novoTam += novoTam * 1.5;
           

        }else{
        novoTam = this.conteudo.getTamanho(); 
        novoTam += novoTam * 1.2;
        
        }
            return novoTam;        
    }

}
