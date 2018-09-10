/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbl.pkg3;

import java.util.ArrayList;

/**
 *
 * @author gusta
 */
public class Liquidificador extends Eletrodomestico {

    private Tampa tampa;
    private int qtTampas = 0;

    public Liquidificador(String marca, double preco, int voltagem) {
        super(marca, preco, voltagem);
    }

    public void contTampas() {
        this.qtTampas++;
    }

    public int getContTampas() {
        return this.qtTampas;
    }

    public void setTampa(Tampa tampa) {
        this.tampa = tampa;
    }

    public Tampa getTampa() {
        return this.tampa;
    }

    @Override
    public double calcDesconto(int mes) {
        double resultDesc = 0, totalDesc = 0;
        if (mes == 8) {
            resultDesc = this.preco * 0.10;
            this.preco = this.preco - resultDesc;
        }
        return resultDesc;
    }

    public boolean validaVoltagem(int volt) {
        if (volt == 110 || volt == 220) {
            return true;
        } else {
            return false;
        }

    }

    public double mediaDeLtBatido(double qtL, double capacidade, double seg) { // ferro não pode bater, tem que tirar daqui
        double podeSerBatido;
        capacidade = qtL / seg;
        podeSerBatido = qtL / capacidade;
        return podeSerBatido;

        /*O liquidificador e a batedeira terão quantidade média de litros que podem ser batidos por
segundo. Será calculado pela formula: quantidade(L)/Capacidade(L/S). Caso se tenha mais de
uma hélice na batedeira a será multiplicado a quantidade de hélices pela capacidade.*///não entendi direito o que isso faz
    }

}
