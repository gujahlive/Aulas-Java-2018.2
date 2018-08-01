

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeiraaplicacao;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                
        int e = Integer.parseInt(JOptionPane.showInputDialog("1 - FATORIAL \n 2 - FIBBONACCI"));
        switch(e){
            case 1: 
                 int numdigitado,fat;
                 int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um Valor"));
        
                numdigitado = n;	
                for( fat = 1; n > 1; n = n - 1){

                fat = fat * n;

                }

        System.out.println("numero digitado: "+ numdigitado +" fatorial: " + fat);
                
                
            break;
            
            
            case 2: 
                   
            int i,a=1,b=0,c=0,d=0,qtTermos;
            qtTermos =Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de termos pro fibonacci: "));
            

            for(i=0;i<qtTermos;i++){
                    c = a+b;
                    System.out.println(c);
                    a = b;
                    b = c;


            }

                
            break;            
        
        }
        int x = Integer.parseInt(JOptionPane.showInputDialog("Digite um Valor"));
       // int x = 10;
        int y = 20;
        int r = x + y;
        System.out.println("x: "+x+" y: "+y+" Resultado: " +r+" ou "+(x+y));
        System.out.println("Ctrl + espaço = importa");
        
       
        // TODO code application logic here
    }
    
}
