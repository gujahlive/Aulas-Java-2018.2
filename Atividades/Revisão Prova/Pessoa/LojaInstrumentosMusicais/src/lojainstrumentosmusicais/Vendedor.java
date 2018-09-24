/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lojainstrumentosmusicais;

/**
 *
 * @author gusta
 */
public class Vendedor extends Funcionario{
    private Instrumento instrumento;

    public Instrumento getInstrumento() {
        return this.instrumento;
    }

    public void bonificacao(Instrumento instrumento, int qtVendida) {
        if(instrumento instanceof Guitarra && qtVendida >= 5){
            double result = this.salario * 0.4; 
            this.salario = this.salario + result;
        }
        if(instrumento instanceof Violao){
            
        }
        if(instrumento instanceof Cavaquinho){
            
        }
        
        this.instrumento = instrumento;
    }
    
    public Vendedor(double salario){
        this.salario = salario;
    }
    
}
