package pbl2;

import java.util.GregorianCalendar;

public class Passagem {

    private GregorianCalendar dataIda;
    private GregorianCalendar dataVolta;
    private String cidadeOrigem;
    private String cidadeDestino;
    private double valorPassagem;

    public GregorianCalendar getDataIda() {
        return dataIda;
    }

    public void setDataIda(GregorianCalendar dataIda) {
        this.dataIda = dataIda;
    }

    public GregorianCalendar getDataVolta() {
        return dataVolta;
    }

    public void setDataVolta(GregorianCalendar dataVolta) {
        this.dataVolta = dataVolta;
    }

    public String getCidadeOrigem() {
        return cidadeOrigem;
    }

    public void setCidadeOrigem(String cidadeOrigem) {
        this.cidadeOrigem = cidadeOrigem;
    }

    public String getCidadeDestino() {
        return cidadeDestino;
    }

    public void setCidadeDestino(String cidadeDestino) {
        this.cidadeDestino = cidadeDestino;
    }

    public double getValorPassagem() {
        return valorPassagem;
    }

    public void setValorPassagem(double valorPassagem) {
        this.valorPassagem = valorPassagem;
    }

    public int calcularDiasDeViagem() {

        long dt1 = this.dataIda.getTimeInMillis();
        long dt2 = this.dataVolta.getTimeInMillis();
        int diasViajados = (int) ((dt2 - dt1) / (24 * 60 * 60 * 1000));

        return diasViajados;
    }

}
