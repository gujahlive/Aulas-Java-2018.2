/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbl.pkg3;

/**
 *
 * @author gusta
 */
public abstract class Eletrodomestico {// classe abstrata não pode ser instanciada

    protected String marca;
    protected double preco;
    protected String voltagem;

    

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(String voltagem) {
        this.voltagem = voltagem;
    }
    public abstract double calcDesconto(int mes); // prototipo do metódo abstrato, e repito o metodo 
                                                   //nas outras clases para calcular descontos diferentes

    
    public abstract String validaVoltagem(String volt);
    
    public double mediaDeLtBatido(double qtL, double capacidade,double seg){
     double podeSerBatido;
      capacidade = qtL / seg;
      podeSerBatido = qtL / capacidade;
     return podeSerBatido;
    
    /*O liquidificador e a batedeira terão quantidade média de litros que podem ser batidos por
segundo. Será calculado pela formula: quantidade(L)/Capacidade(L/S). Caso se tenha mais de
uma hélice na batedeira a será multiplicado a quantidade de hélices pela capacidade.*///não entendi direito o que isso faz
    }
    
}
