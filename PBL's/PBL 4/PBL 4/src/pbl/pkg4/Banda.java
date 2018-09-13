/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadeteatro;

/**
 *
 * @author aluno
 */
public class Banda {
    private Guitarrista guitar;
    private Baterista bate;
    private Baixista baixi;

    public Guitarrista getGuitar() {
        return this.guitar;
    }

    public void setGuitar(Guitarrista guitar) {
        this.guitar = guitar;
    }

    public Baterista getBate() {
        return this.bate;
    }

    public void setBate(Baterista bate) {
        this.bate = bate;
    }

    public Baixista getBaixi() {
        return this.baixi;
    }

    public void setBaixi(Baixista baixi) {
        this.baixi = baixi;
    }
    
    
}
