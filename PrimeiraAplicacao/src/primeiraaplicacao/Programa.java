

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeiraaplicacao;

import java.util.Scanner;
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
                
        int e = Integer.parseInt(JOptionPane.showInputDialog("1 - FATORIAL \n 2 - FIBBONACCI\n 3 - Maior menor \n 4 - o pvt joao fez"));
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

            case 3: 
                 int n11 = Integer.parseInt(JOptionPane.showInputDialog("Digite um Valor"));
                 int n22 = Integer.parseInt(JOptionPane.showInputDialog("Digite um Valor"));
                 if(n11>n22){
                       System.out.println(n11 + " Maior " +n22+" Menor");
                 }else if(n22>n11){
                     System.out.println(n22 + " maior " +n11+" Menor");
                  
                 }else if(n22==n11){
                     System.out.println("Numeros Iguais");
                 
                 }
                break;
             case 4: 
                  int n1,n2,cont = 0;
        Scanner teclado = new Scanner(System.in);
        do{
            System.out.println("Informe o primeiro  valor:");
            n1=teclado.nextInt();
            System.out.println("Informe o segundo valor:");
            n2=teclado.nextInt();
        }
        while((n2<0 || n1<0)|| (n2==n1));
        
        if(n1<n2){
            for(int i=n1;i<=n2;i++){
                if((i%2!=0) && (i%3==0)){
                  cont++;
                }
            }
        }
        
        else if(n2<n1){
            for(int i=n2;i<=n1;i++){
                if((i%2!=0) && (i%3==0)){
                  cont++;
                }
            }
        }
    System.out.printf("Existem %d números compatives\n",cont);
               break;

        
        
        /*int x = Integer.parseInt(JOptionPane.showInputDialog("Digite um Valor"));
       // int x = 10;
        int y = 20;
        int r = x + y;
        System.out.println("x: "+x+" y: "+y+" Resultado: " +r+" ou "+(x+y));
        System.out.println("Ctrl + espaço = importa");*/
        
       
        // TODO code application logic here
    }
    
}
