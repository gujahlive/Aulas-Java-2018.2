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
public class FerroDePassar extends Eletrodomestico {

    public FerroDePassar(String marca, double preco, int voltagem) {
        super(marca, preco, voltagem);
    }

 

    @Override
    public double calcDesconto(int mes) {
        double resultDesc = 0, totalDesc = 0;
        if (mes == 5) {
            resultDesc = this.preco * 0.15;
            this.preco = this.preco - resultDesc;
        }
        return resultDesc;
    }

    @Override
    public boolean validaVoltagem(int volt) {
        double result = 0;
        if (super.validaVoltagem(volt) || volt == 5) {
            this.voltagem = volt;
            return true;
        }
        return false;
    }

}
