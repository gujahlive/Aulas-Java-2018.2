/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbl.pkg4;

/**
 *
 * @author aluno
 */
public abstract class  Artista {
    protected String nome;
    protected String cpf;
    protected int ano_nasc;
    protected double tempo_servico;
    private static int pontos;
    protected int qtApresentacao;
    protected int contApresentacoes;// conta quantas aprestações os artistas fazem, quando chega na quantidade que é exigida, tem que zerar o contador e iniciar novamente
    private static int pontuacaoTotal;

 
    
    
    public static void setPontuacao(int ponto){// seta a apontuação de cada artista que vem de outras classes
      Artista.pontuacaoTotal += ponto;
        
    } 
    private static double pontuacaoTotal(){// retorno da pontuação total;
       return Artista.pontuacaoTotal;
    }
    
    public int getPontuacaoTotal(){
        return Artista.pontuacaoTotal;
    }
    public int getPontos() {
        pontos = Artista.pontuacaoTotal;
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public int getQtApresentacao() {
        return this.qtApresentacao;
    }

    public void setQtApresentacao(int qtApresentacao) {
        
        this.qtApresentacao = qtApresentacao;
        
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

    public int getAno_nasc() {
        return this.ano_nasc;
    }

    public void setAno_nasc(int ano_nasc) {
        this.ano_nasc = ano_nasc;
    }

    public double getTempo_servico() {
        return this.tempo_servico;
    }

    public void setTempo_servico(double tempo_servico) {
        this.tempo_servico = tempo_servico;
    }
    

}
