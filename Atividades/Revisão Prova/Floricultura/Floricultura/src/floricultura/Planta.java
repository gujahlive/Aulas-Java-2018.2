/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package floricultura;

/**
 *
 * @author gusta
 */
public abstract class Planta {

    protected String especificacao, codigo,descricaoPlanta;
    protected int dia = 1, diaRegado;
    protected Planta tipo;
    protected Vaso vaso;
    protected double valor;

    public Planta() {
    }

    public Vaso getVaso() {
        return this.vaso;
    }

    public void setVaso(Vaso vaso) {
        this.vaso = vaso;
    }

    public String getEspecificacao() {
        return this.especificacao;
    }

    public void setEspecificacao(String especificacao) {
        this.especificacao = especificacao;
    }

    public int getDia() {
        return this.dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getDiaRegado() {
        return this.diaRegado;
    }

    public void setDiaRegado(int diaRegado) {
        this.diaRegado = diaRegado;
    }

    public Planta getTipo() {
        return this.tipo;
    }

    public void setTipo(Planta tipo) {
        if (tipo instanceof Azaleia) { 
            this.tipo = tipo;
            this.descricaoPlanta = "Aza";
            this.valor = 10 + vaso.getValor();
        
        }

        if (tipo instanceof Orquidia) {
            this.valor = 18 + vaso.getValor();
            this.tipo = tipo;
            this.descricaoPlanta = "Orq";
        }

        if (tipo instanceof Violeta) {
            this.valor = 7.5 + vaso.getValor();
            this.tipo = tipo;
            this.descricaoPlanta = "Vio";
        }
    }
    public double getValor(){
        return this.valor;
    }
    public String getDesc(){
        return this.descricaoPlanta;
    }
    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

}
