/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petshoppolimorfismo;

/**
 *
 * @author gusta
 */
public class Servico {

    private int horario;
    private int data;
    private double preco;
    private String descricao;

    public int getHorario() {
        return this.horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }

    public int getData() {
        return this.data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // método para calcular o banho 
    public double CalcularServico(Pet animal) {
        if ("banho".equals(this.descricao)) {
            if (animal instanceof Coelho) {
                this.preco += 10;
            }

            if (animal instanceof Cachorro) {
                this.preco += 30;
            }
            if (animal instanceof Gato) {
                this.preco += 20;
            }
        }
         if ("tosa".equals(this.descricao)) {

            if (animal instanceof Cachorro) {
                this.preco += 30;
            }
            if (animal instanceof Gato) {
                this.preco += 20;
            }
        }
        if ("consulta".equals(this.descricao)) {
            if (animal instanceof Coelho) {
                this.preco += 10;
            }

            if (animal instanceof Cachorro) {
                this.preco += 30;
            }
            if (animal instanceof Gato) {
                this.preco += 20;
            }
        } 

        return this.preco;

    }

}
