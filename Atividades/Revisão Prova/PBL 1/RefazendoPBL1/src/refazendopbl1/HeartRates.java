/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refazendopbl1;

/**
 *
 * @author gusta
 */
public class HeartRates implements Calculos {

    private String nome, sobrenome;
    private int dia, mes, ano, resultIdade;

    public HeartRates(String nome, String sobrenome, int dia, int mes, int ano) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return this.sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getDia() {
        return this.dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return this.mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    // metódo que calcula a idade da pessoa em anos
    // metodo que calcula a frequencia cardiaca maxima
    // metodo que calcula a frequencia cardiaca alvo
    @Override
    public int calculaIdade(int diaAtual, int mesAtual, int anoAtual) {
        if (anoAtual >= this.getAno()) {
            this.resultIdade = anoAtual - this.getAno();
            if (mesAtual <= getMes()) {
                this.resultIdade -= 1;
                if (diaAtual <= this.getDia()) {
                    this.resultIdade = this.resultIdade;
                } else {
                    this.resultIdade += 1;
                }
            }//else resultIdade += 1;

        }

        return this.resultIdade;

    }

    @Override
    public double calcFreqCardMax() {
        double result = 220 - this.resultIdade;
        return result;
    }

    @Override
    public double calcFreqCardAlvo() {
        int i;
        
        double result = calc50porcento() + calc85porcento() ;
        double alvo=result /2;
       // for (i = 0 ; calc50porcento()  <= calc85porcento(); i++) {
           // alvo = (double) (Math.random() * calcFreqCardMax());
       // }
        return alvo;
    }

    public double calc50porcento() {
        double result = calcFreqCardMax() * 0.50;
        return result;
    }

    public double calc85porcento() {
        double result85 = calcFreqCardMax() * 0.85;
        return result85;
    }

}
