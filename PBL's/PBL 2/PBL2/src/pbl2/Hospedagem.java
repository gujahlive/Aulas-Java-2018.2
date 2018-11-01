package pbl2;

public class Hospedagem {
    private Passagem p;
    private int diasViagem;//baseados no dia de ida e volta
    private double valorDiaria;
    private double valorTotal;

    public int getDiasViagem() {
        return diasViagem;
    }

    public void setDiasViagem() {
        this.diasViagem = p.calcularDiasDeViagem() ;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }
    
    public double estadia(){
        this.valorTotal = this.diasViagem * this.valorDiaria;
        
        return this.valorTotal;
    } 
    
}