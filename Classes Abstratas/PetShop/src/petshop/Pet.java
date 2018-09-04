/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petshop;

/**
 *
 * @author aluno
 */
public abstract class Pet {

    protected String nome;
    protected float peso;
    protected String sexo;
    protected int idade;
    protected Dono dono;

    public void enviarMensagem(String mensagem) {
        String telefone = this.dono.getTelefone();
        System.out.println("A mensagem:" + mensagem + " foi enviada para " + telefone);
    }

    public double calcDistancia() {//simulando calculo de distancia
        return 10;
    }

    public double devolverPet() {
        this.enviarMensagem("Olá,  seu pet já está pronto!");
        double distancia = this.calcDistancia();
        if (distancia <= 1) {
            return 20;
        } else {
            if (distancia <= 5) {
                return 30;
            } else {
                if (distancia <= 15) {
                    return 45;
                } else {
                    return distancia * 2 + 20;
                }
            }
        }
    }

    public abstract double calcularBanho();

    public Dono getDono() {
        return this.dono;
    }

    public void setDono(Dono dono) {
        this.dono = dono;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPeso() {
        return this.peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}
