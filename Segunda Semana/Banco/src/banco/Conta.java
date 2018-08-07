
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
    
    void saca(double valorSaque){
        this.saldo -= valorSaque;
        
    }
    
   
    
    
    
    
}
