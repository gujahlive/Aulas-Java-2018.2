/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petshoppolimorfismo;

import java.util.ArrayList;

/**
 *
 * @author gusta
 */
public class Endereco {
     private int cep;
    private ArrayList<String> bairros;
    private ArrayList<String> ruas;
    private ArrayList<String> cidades;
    private String estado;
    private String pais;

    public Endereco(){
        this.ruas = new ArrayList<>();
        this.bairros = new ArrayList<>();
        this.cidades = new ArrayList<>();
    } 
    //ENCAPSULAMENTO  -------------------------------------------------------
    public int getCep() {
        return this.cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    
    public ArrayList<String> getBairro() {
        return this.bairros;
    }

    public void setBairro(String bairro) {
        this.bairros.add(bairro);
    }

    
    public ArrayList<String> getRua() {
        return this.ruas;
    }

    public void setRua(String rua) {
        this.ruas.add(rua);
    }

    
    public ArrayList<String> getCidade() {
        return this.cidades;
    }

    public void setCidade(String cidade) {
        this.cidades.add(cidade);
    }

    
    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    
    public String getPais() {
        return this.pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
    
    
}
