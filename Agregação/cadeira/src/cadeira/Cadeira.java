/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadeira;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class Cadeira {
        private String cor;
        private ArrayList<Material> materiais;
        private Material material;
        private boolean braco;
        private float altura;
        private  double valor;
    
        public Cadeira(){
                    this.materiais = new ArrayList<>();
        } 
      
    
    public void setCor(String cor){
        this.cor = cor;
    }
    public String getCor(){
        return this.cor;
    }
    public void setMateriais(ArrayList<Material> materiais){
        this.materiais= materiais;
    }
   public void setMaterial(Material material){
        this.materiais.add(material);
    }
   public ArrayList<Material> getMaterial(){
       return this.materiais;
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
   
  /* public void personalizar(String cor, Material material, boolean braco, float altura){
        this.cor = cor;
        this.altura = altura;
        this.braco = braco;
     //   this.materia = material;
    
    }*/
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
