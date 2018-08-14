/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadecadeira;

/**
 *
 * @author aluno
 */
public class Cadeira {
    String cor;
    String material;
    boolean braco;
    float altura;
    double valor;
    
    
    
    
    void personalizar(String cor, String material, boolean braco, float altura){
        if(this.braco == true){
             this.valor *= 0.2; 
        }
        
        
    
    }
    void atribuirValor(){
        if(this.altura > 0.1 && this.altura <= 1 ){
            this.valor = 50; 
        }else if(this.altura > 1 && this.altura <= 1.5 ){
            this.valor = 100; 
        }else if(this.altura > 1.5 ){
            this.valor = 150; 
        }
        
    }
    
   

}
