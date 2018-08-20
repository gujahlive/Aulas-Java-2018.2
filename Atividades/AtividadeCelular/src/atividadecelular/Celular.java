/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadecelular;

/**
 *
 * @author aluno
 */
public class Celular {
    private float preco;
    private String modelo, marca;
    private int GBarm;
    public Celular(String modelo, String marca, int GBarm){
        this.modelo = modelo;
        this.marca = marca;
        this.GBarm = GBarm;
    }
    public Celular (float preco,String modelo, String marca, int GBarm){
        this.preco = preco;
        this.modelo = modelo;
        this.marca = marca;
        this.GBarm = GBarm;
     
    }
    
    public void setPreco(float preco){
        this.preco = preco;
    }
    public float getPreco(){
        return this.preco;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getMarca(){
        return this.marca;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public String getModelo(){
        return this.modelo;
    }
    public void setGBarm(int GBarm){
        this.GBarm = GBarm;
    }
    public int getGBarm(){
        return this.GBarm;
    }

    
}
