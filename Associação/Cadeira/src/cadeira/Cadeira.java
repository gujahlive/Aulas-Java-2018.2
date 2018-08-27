/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadeira;

/**
 *
 * @author aluno
 */
public class Cadeira {
        private String cor;
        private Material material;
        private boolean braco;
        private float altura;
        private  double valor;
    
    
    public void setCor(String cor){
        this.cor = cor;
    }
    public String getCor(){
        return this.cor;
    }
    public void setMaterial(Material material){
        this.material = material;
    }
    public Material getMaterial(){
        return this.material;
    }
    public void setBraco(boolean braco){
        this.braco = braco;
    }
    public boolean getBraco(){
        return this.braco;
    }
    
   public void setAltura(float altura){
       this.altura = altura;
   }
   public float getAltura(){
       return this.altura;
   }
   public double getValor(){
       return this.valor;
   }
   
   public void personalizar(String cor, String material, boolean braco, float altura){
        this.cor = cor;
        this.altura = altura;
        this.braco = braco;
        //this.material = material;
    
    }
    public  void precificar(){
        if(this.altura > 0 && this.altura <= 1 ){
            this.valor = 50; 
        }else if(this.altura > 1 && this.altura <= 1.5 ){
            this.valor = 100; 
        }else if(this.altura > 1.5 ){
            this.valor = 150; 
        } 
         if(this.braco){
             this.valor += this.valor*0.2; 
           
        }
        
    }
    
}
