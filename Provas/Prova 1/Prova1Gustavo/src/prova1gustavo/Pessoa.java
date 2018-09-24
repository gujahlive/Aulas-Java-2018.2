/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova1gustavo;

/**
 *
 * @author aluno
 */
public abstract class Pessoa {

    protected String nome;
    protected int cpf;
    protected int telefone;
    protected String endereco;
    protected Movel movel;

    public Movel getMovel() {
        return this.movel;
    }

    public void setMovel(Movel movel) {
        this.movel = movel;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getCpf() {
        return this.cpf;
    }

    public void setTelefone(int tel) {
        this.telefone = tel;
    }

    public int getTelefone() {
        return this.telefone;
    }

}
