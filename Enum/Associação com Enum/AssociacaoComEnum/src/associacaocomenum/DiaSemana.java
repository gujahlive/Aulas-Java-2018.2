/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package associacaocomenum;

/**
 *
 * @author gusta
 */
public enum DiaSemana {
     SEGUNDA(1), TERCA(2), QUARTA(3), QUINTA(4), SEXTA(5), SABADO(6), DOMINGO(7);//tem que passar o parametro de cada construtor do enum
     private int valor;
     DiaSemana(int valor){ // sem modificador de acesso
         this.valor = valor;
     }//o modificador de acesso é implantado automaticamente no enum
     public int getValor(){
         return this.valor;
     }
}

