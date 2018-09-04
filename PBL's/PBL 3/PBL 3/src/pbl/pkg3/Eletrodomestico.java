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
}
