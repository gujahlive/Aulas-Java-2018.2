/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herancafuncionario;

/**
 *
 * @author aluno
 */
public class Gerente extends Funcionario {
    private String senha;
    private int nGerenciado;

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getnGerenciado() {
        return nGerenciado;
    }

    public void setnGerenciado(int nGerenciado) {
        this.nGerenciado = nGerenciado;
    }
    
    
}
