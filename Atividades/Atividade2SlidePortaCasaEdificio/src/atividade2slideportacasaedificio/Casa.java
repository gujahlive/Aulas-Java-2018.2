/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade2slideportacasaedificio;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class Casa {
    private String cor;
    private int qtPortas,qTPortasAbertas;
    private ArrayList<Porta> portas;
    
      public Casa(){
            this.portas = new ArrayList<>();
        } 
   


    public void pinta(String cor){
        this.cor = cor;
    }
     public String getCor() {
        return this.cor = cor;
    }


     
     public void cadastrarPortas(Porta porta){
         this.qtPortas += 1;
         this.portas.add(porta);
         
     }
     public int retornaPosicaoDaPorta(){
         return this.qtPortas;
     }
     
    public void setPortas(ArrayList<Porta> portas){
        this.portas = portas;
    }

   public ArrayList<Porta> getPortas(){
       return this.portas;
   }
   
   public void totalDePortas(){
        this.qtPortas = this.portas.size(); //tamanho de portas quantas portas tem. MÉTODO N FUNCIONANDO PERGUNTAR A FRAN
         
     }
   public int getTotalDePortas(){
        return this.qtPortas;
    }
   public int qtPortasAbertas(){
       int q =0;
        for(int i=0 ; i < this.qtPortas ;i++){
            if(this.portas.get(i).estaAberta()){   //tá perguntando se é true que está aberta não precisa colocar == true 
                q++;
            }
        }
        return q;
    }

}
