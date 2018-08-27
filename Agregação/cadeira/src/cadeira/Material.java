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
public class Material {
    private double peso;
    private double preco;
    private String cor;
    
   public void setCor(String cor){
        this.cor = cor;
    }
    
    public String getCor (){
        return this.cor;
    }
    
   public void setPreco(double preco){
        this.preco = preco ;
    }
    
    public double getPreco (){
        return this.preco;
    } 
    
    
    public void setPeso(double peso){
        this.peso = peso ;
    }
    
    public double getPeso (){
        return this.peso;
    }
    
}
