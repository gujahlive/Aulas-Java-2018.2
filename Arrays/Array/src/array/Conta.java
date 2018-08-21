/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author aluno
 */
public class Conta {
    private String dono;
    private double limite;
    private double saldo;
    private String agencia;
    

    public Conta(){
        this.saldo = 0;
    }
    
    
    public void setDono(String dono){
        this.dono = dono;
    }
    public String getDono(){
        return this.dono;
    }
    public void setLimite(double limite){
        this.limite = limite;
    }
    public double getLimite(){
        return this.limite;
    }
    public double getSaldo(){
        return this.saldo;
    }
   public void setAgencia(String agencia){
        this.agencia = agencia;
    }
    public String getAgencia(){
        return this.agencia;
    }    
    
    
    
}
