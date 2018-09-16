/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbl.pkg4;

/**
 *
 * @author aluno
 */
public class Dancarino extends Artista implements InterfacePontuacao{

 
    //pontuação total não será chamada com o this, será chamada pelo artista
    
    
   

    @Override
    public void calcPontuacao(int qtShow) {
         this.saldoApresentacoes += qtShow; 
            while(this.saldoApresentacoes >= 5){
            Artista.setPontuacao(100);
            this.saldoApresentacoes -= 5;
           }
    }

   
}
