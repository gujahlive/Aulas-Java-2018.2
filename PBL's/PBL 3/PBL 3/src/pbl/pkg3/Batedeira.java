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
public class Batedeira extends Eletrodomestico {

    private int qtHelices;

    public Batedeira(String marca, double preco, int voltagem) {
        this.marca = marca;
        this.preco = preco;
        this.voltagem = voltagem;
    }

    public Batedeira(String marca, int voltagem) {
        this.marca = marca;
        this.voltagem = voltagem;
    }

    public Batedeira() {
    }

    @Override
    public double calcDesconto(int mes) {
        double resultDesc = 0, totalDesc = 0;
        if (mes == 12) {
            resultDesc = this.preco * 0.20;
            this.preco = this.preco - resultDesc;
        }
        return resultDesc;
    }
    

    public int getQtHelices() {
        return this.qtHelices;
    }

    public void setQtHelices(int qtHelices) {
        this.qtHelices = qtHelices;
    }
    public double mediaDeLtBatido(double qtL, double capacidade,double seg){ // ferro não pode bater, tem que tirar daqui
     double podeSerBatido;
      capacidade = qtL / seg;
      podeSerBatido = qtL / capacidade;
     return podeSerBatido;
    
    /*O liquidificador e a batedeira terão quantidade média de litros que podem ser batidos por
segundo. Será calculado pela formula: quantidade(L)/Capacidade(L/S). Caso se tenha mais de
uma hélice na batedeira a será multiplicado a quantidade de hélices pela capacidade.*///não entendi direito o que isso faz
    }
 
    public double mediaDeLtBatidoB(double qtL, double capacidade, double seg) {
        double result = 0;
        if (this.qtHelices > 1) {
            result = mediaDeLtBatido(qtL, capacidade, seg) * this.qtHelices;
        }
        return result;
    }

}
