/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constanteseenum;

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
    
        usandoConstantes();
        System.out.println("_________");
        usandoEnum();
        
    }
   
    private static void usandoConstantes(){
        int segunda = DiasDaSemanaConstante.SEGUNDA;
        int terca = DiasDaSemanaConstante.TERCA;
        int quarta = DiasDaSemanaConstante.QUARTA;
        int quinta = DiasDaSemanaConstante.QUINTA;
        int sexta = DiasDaSemanaConstante.SEXTA;
        int sabado = DiasDaSemanaConstante.SABADO;
        int domingo = DiasDaSemanaConstante.DOMINGO;
        
        System.out.println("Teste utilizando constantes no Java");
        
        imprimeDiaSemana(segunda);
        imprimeDiaSemana(terca);
        imprimeDiaSemana(quarta);
        imprimeDiaSemana(quinta);
        imprimeDiaSemana(sexta);
        imprimeDiaSemana(sabado);
        imprimeDiaSemana(domingo);
        
    
    }
    
    
    
    
    private static void imprimeDiaSemana(int dia){
        switch(dia){
            case 1: System.out.println("Segunda-Feira");break;
            case 2:System.out.println("Terça-Feira");break;
            case 3:System.out.println("Quarta-Feira");break;
            case 4:System.out.println("Quinta-Feira");break;
            case 5:System.out.println("Sexta-Feira");break;
            case 6:System.out.println("Sábado");break;
            case 7:System.out.println("Domingo");break;
            default :break;
        }
       
    }
    
      private static void usandoEnum(){
          DiaSemana segunda = DiaSemana.SEGUNDA;//passa o dia da semana . o dia pq o dia já é o valor que vai ser atribuido a variavel do tipo enum
          DiaSemana terca = DiaSemana.TERCA;
          DiaSemana quarta = DiaSemana.QUARTA;
          DiaSemana quinta = DiaSemana.QUINTA;
          DiaSemana sexta = DiaSemana.SEXTA;
          DiaSemana sabado = DiaSemana.SABADO;
          DiaSemana domingo = DiaSemana.DOMINGO;
          System.out.println("Teste utilizando enum no Java");
         imprimeDiaSemanaEnum(segunda);
         imprimeDiaSemanaEnum(terca);
         imprimeDiaSemanaEnum(quarta);
         imprimeDiaSemanaEnum(quinta);
         imprimeDiaSemanaEnum(sexta);
         imprimeDiaSemanaEnum(sabado);
         imprimeDiaSemanaEnum(domingo);
      }
        
        private static void imprimeDiaSemanaEnum(DiaSemana dia){
        switch(dia){
            case SEGUNDA: System.out.println("Segunda-Feira");break;
            case TERCA:System.out.println("Terça-Feira");break;
            case QUARTA:System.out.println("Quarta-Feira");break;
            case QUINTA:System.out.println("Quinta-Feira");break;
            case SEXTA:System.out.println("Sexta-Feira");break;
            case SABADO:System.out.println("Sábado");break;
            case DOMINGO:System.out.println("Domingo");break;
            default :break;
        }
       
    }
    
}
