/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package valueevalueof;

/**
 *
 * @author gusta
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DiaSemana[] dias = DiaSemana.values();// o método values retorna um array de todos os valores dentro do enumerador 
         for(int i=0 ; i<dias.length ; i++){
             System.out.println(dias[i]);
         }
    
         for(DiaSemana dia : DiaSemana.values()){//foreach
                System.out.println(dia);// passando um dia 
         }
    }  
    
}
