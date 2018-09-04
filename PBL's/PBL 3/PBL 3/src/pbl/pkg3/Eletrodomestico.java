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
    protected float preco;
    protected int voltagem;

    

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }
    public abstract double calcDesconto(); // prototipo do metódo abstrato, e repito o metodo 
                                            //nas outras clases para calcular descontos diferentes

}
