/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadecarro;

/**
 *
 * @author aluno
 */
public class Carro {
        String cor;
        String modelo;
        double velocidadeAtual;
        double velocidadeMaxima;
        boolean ligado;
        
        void ligar(){
            this.ligado = true;
        
        }
      
        void acelera(double acelerou){//passando por parametro a quantidade que será somada à velocidadeAtual
            if(this.velocidadeAtual + acelerou > velocidadeMaxima){
                this.velocidadeAtual = velocidadeMaxima;
            }else this.velocidadeAtual += acelerou;
            
        }
        
        int pegaMarcha(){
            if(this.velocidadeAtual > 0 && this.velocidadeAtual <= 20){
                return 1;
            }else if(this.velocidadeAtual > 20 && this.velocidadeAtual <= 40){
                return 2;
            }else if(this.velocidadeAtual > 40 && this.velocidadeAtual <= 60){
                return 3;
            }else if(this.velocidadeAtual > 60 && this.velocidadeAtual <= 100){
                return 4;
             } else if(this.velocidadeAtual > 100){
              return 5;
             } else return 0; 
           
        }
        
        
    
    
}
