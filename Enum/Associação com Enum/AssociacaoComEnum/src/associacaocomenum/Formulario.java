/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package associacaocomenum;

/**
 *
 * @author gusta
 */
public class Formulario {
    enum Genero{
        FEMININO('F'), MASCULINO('M');// pode ser sem o construtor tbm
        private char valor;
        Genero(char valor){
            this.valor = valor;
        }
    }
    private String nome;
    private Genero genero;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
    
}
