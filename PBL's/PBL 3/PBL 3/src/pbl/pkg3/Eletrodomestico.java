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
    protected int voltagem;
    protected boolean validVolt;

    public Eletrodomestico(String marca, double preco, int voltagem) {
        this.marca = marca;
        this.preco = preco;
        this.voltagem = voltagem;
    }

    public Eletrodomestico(String marca, int voltagem) {
        this.marca = marca;
        this.voltagem = voltagem;
    }



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

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }

    public abstract double calcDesconto(int mes); // prototipo do metódo abstrato, e repito o metodo 
    //nas outras clases para calcular descontos diferentes

    //public abstract boolean validaVoltagem(int volt);
    public boolean validaVoltagem(int volt) {
        if (volt == 110) {
            this.voltagem = volt;
            return true;
        }
        if (volt == 220) {
            this.voltagem = volt;
            return true;
        }
        return false;
    }

}
