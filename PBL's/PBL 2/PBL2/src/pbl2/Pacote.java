package pbl2;

import java.util.ArrayList;

public class Pacote {
    protected Hospedagem hospedagem;
    protected Passagem passagem;
    protected Translado translado;
    protected ArrayList<PasseioTuristico> passeioturistico;
    protected double qtdPessoas;

    public double getQtdPessoas() {
        return qtdPessoas;
    }

    public void setQtdPessoas(double qtdPessoas) {
        this.qtdPessoas = qtdPessoas;
    }

    public Hospedagem getHospedagem() {
        return hospedagem;
    }

    public void setHospedagem(Hospedagem hospedagem) {
        this.hospedagem = hospedagem;
    }

    public Passagem getPassagem() {
        return passagem;
    }

    public void setPassagem(Passagem passagem) {
        this.passagem = passagem;
    }

    public Translado getTranslado() {
        return translado;
    }

    public void setTranslado(Translado translado) {
        this.translado = translado;
    }

    public ArrayList<PasseioTuristico> getPasseioturistico() {
        return passeioturistico;
    }

    public void setPasseioturistico(PasseioTuristico passeioturistico) {
        this.passeioturistico.add(passeioturistico);
    }
    
    public double valorHospedagem(){
        return hospedagem.valorDiaria * hospedagem.diasViagem;
    }
    
    public double calcularValor(){
        double valorTotal = passagem.getValorPassagem() + translado.getValorPadrao() + hospedagem.estadia() + passeioturistico.get(0).getValor();
        double valorDesconto = valorTotal * 0.5;
        if(valorTotal > 3000){
            valorTotal = valorTotal - valorDesconto;
        }
        return valorTotal;
    }
    
    public double calcularValorP(){
        double valorTotal = passagem.getValorPassagem() + translado.getValorPadrao() + hospedagem.estadia() + passeioturistico.get(0).getValor();
        double valorDesconto = valorTotal * 0.5;
        if(valorTotal > 3000){
            valorTotal = valorTotal - valorDesconto;
       }
        valorTotal = this.qtdPessoas * valorTotal;
        return valorTotal;
    }
    
    
}
