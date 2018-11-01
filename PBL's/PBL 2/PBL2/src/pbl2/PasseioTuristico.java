package pbl2;

import java.util.GregorianCalendar;

public class PasseioTuristico {
    private GregorianCalendar dia;
    private int horario;
    private int tempoTotal;
    private double valor;

    public GregorianCalendar getDia() {
        return dia;
    }

    public void setDia(GregorianCalendar dia) {
        this.dia = dia;
    }

    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void setTempoTotal(int tempoTotal) {
        this.tempoTotal = tempoTotal;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
}
