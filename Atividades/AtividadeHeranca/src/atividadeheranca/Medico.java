/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadeheranca;

/**
 *
 * @author aluno
 */
public class Medico {
    protected String crm;
    protected String nome;
    protected int idade;
    protected double salario;

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public boolean medicoAposentado(){
        if (this.idade > 55){
            return true;       
        }
        return false;
    }
    public double valorAposentadoria (){
        return this.salario * 0.80;
    }
    
    
}
