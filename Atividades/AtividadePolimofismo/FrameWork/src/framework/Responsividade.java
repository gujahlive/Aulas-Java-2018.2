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
public class Responsividade extends Conteudo{

    public Responsividade(double tamanho, String cor) {
        super(tamanho, cor);
    }

    public double calcResponsividade(Dispositivo dispositivo) {
        if (dispositivo instanceof Desktop) {
             this.tamanho = 1;    
        }
        if (dispositivo instanceof Notebook) {
             this.tamanho *= 2;   // aumenta 100% 
        }
        if (dispositivo instanceof Tablet) {
             this.tamanho *= 3;    // mantem
        }
        if (dispositivo instanceof Celular) {
             this.tamanho *= 4;   // diminui 30% 
        }
        return this.tamanho;
    }
}
