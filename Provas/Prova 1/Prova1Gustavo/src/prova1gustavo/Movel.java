/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova1gustavo;

/**
 *
 * @author aluno
 */
public class Movel {

    private String nomeDoMovel;
    private String cor;
    private double medidaX, medidaY, medidaZ;
    private String nomeDoMaterial;
    private String linkImgHREF;
    private String status;

    private static double preco;
    private Pagamento pagamento;

    private double retornaPreco;

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public Movel(String status) {
        this.status = status;

    }

    public String getNomeDoMovel() {
        return this.nomeDoMovel;
    }

    public void setNomeDoMovel(String nomeDoMovel) {
        this.nomeDoMovel = nomeDoMovel;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getMedidaX() {
        return this.medidaX;
    }

    public void setMedidaX(double medidaX) {
        this.medidaX = medidaX;
    }

    public double getMedidaY() {
        return this.medidaY;
    }

    public void setMedidaY(double medidaY) {
        this.medidaY = medidaY;
    }

    public double getMedidaZ() {
        return this.medidaZ;
    }

    public void setMedidaZ(double medidaZ) {
        this.medidaZ = medidaZ;
    }

    public String getNomeDoMaterial() {
        return this.nomeDoMaterial;
    }

    public void setNomeDoMaterial(String nomeDoMaterial) {
        this.nomeDoMaterial = nomeDoMaterial;
    }

    public String getLinkImgHREF() {
        return this.linkImgHREF;
    }

    public void setLinkImgHREF(String linkImgHREF) {
        this.linkImgHREF = linkImgHREF;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public static double getPreco() {
        return Movel.preco;
    }

    public static void setPreco(double preco) {
        Movel.preco = preco;

    }

}
