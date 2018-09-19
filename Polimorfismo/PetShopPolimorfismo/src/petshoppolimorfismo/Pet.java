/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petshoppolimorfismo;

/**
 *
 * @author gusta
 */
public abstract class Pet {

    protected Cliente cliente;//talvez tire daqui, pq um pet raramente pode ter vários donos, então n seria um arraylist, mas na classe dono sim, um done possui vários pets
    protected String nome;
    protected int nascimento;
    protected String cor;
    protected int tamanho;
    protected float peso;
    protected Servico servico;// arraylist de servicos, pode ser banho, tosa ou mais e incrementar no preço
    protected String raca;

    //--------------ENCAPSULAMENTO ----------------------
    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente dono) {
        this.cliente = dono;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNascimento() {
        return this.nascimento;
    }

    public void setNascimento(int nascimento) {
        this.nascimento = nascimento;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getTamanho() {
        return this.tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public float getPeso() {
        return this.peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getRaca() {

        return this.raca;

    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int CalcularIdade() {
        int idade;

        idade = 2018 - this.nascimento;

        return idade;

    }

}
