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
public class Cliente {
    private ArrayList<Endereco> enderecos; // pode ser um arraylist de enderecos
    private String nome;
    private String cpf;
    private ArrayList<Pet> pets; // 1 dono pode ter vários pets
    
    
    public Cliente(){
        this.pets = new ArrayList<>();
        this.enderecos = new ArrayList<>();
    }
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public ArrayList<Endereco> getEndereco() {
        return this.enderecos;
    }

    public void setEndereco(Endereco endereco) {
        this.enderecos.add(endereco);
    }
    public void setPets(Pet pet){
        this.pets.add(pet);
    }
    public ArrayList<Pet> getPets(){
        return this.pets;
    }
    
}
