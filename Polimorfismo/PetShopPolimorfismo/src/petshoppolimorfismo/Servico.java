/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petshoppolimorfismo;

import java.util.ArrayList;

/**
 *
 * @author gusta
 */
public class Servico {

    private int horario;
    private int data;
    private double preco;
    private ArrayList<String> descricoes;
    
    public Servico(){
        this.descricoes = new ArrayList<>();
    }
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

    public ArrayList<String> getDescricoes() {
        return this.descricoes;
    }

    public void setDescricao(String descricao) {
        this.descricoes.add(descricao);
    }

    // método para calcular o banho 
    public double CalcularServico(Pet animal) {
        int i = 0;
        if ("banho".equals(this.descricoes.get(i))) {
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
        if ("tosa".equals(this.descricoes.get(i))) {

            if (animal instanceof Cachorro) {
                this.preco += 30;
            }
            if (animal instanceof Gato) {
                this.preco += 20;
            }
        }
        if ("consulta".equals(this.descricoes.get(i))) {
            if (animal instanceof Coelho) {
                this.preco += 10;
            }

            if (animal instanceof Cachorro) {
                this.preco += 40;
            }
            if (animal instanceof Gato) {
                this.preco += 20;
            }
        } 

        return this.preco;

    }

}
