
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author aluno
 */
public class Conta {
    String numero;
    String agencia;
    double saldo;
    String cpf;
    double limite;
    boolean permitirSaque;
    
    boolean saca(double valorSaque,double limite){
        if(this.limite+this.saldo >= valorSaque){
            this.saldo -= valorSaque;
            permitirSaque = true;
            //return true;
        }else  permitirSaque = false; //somar o saldo com o limite
            
        return permitirSaque;//false;// ;
        
    }
     void deposita(double valorDeposito){
        this.saldo += valorDeposito;
        
    }
    
   
    
    
    
    
}
