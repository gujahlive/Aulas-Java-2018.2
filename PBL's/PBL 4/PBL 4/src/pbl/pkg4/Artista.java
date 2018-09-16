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
    protected  int saldoApresentacoes = 0;//conta saldo de apresentação de cada objeto
    protected int qtApresentacao;
    
    protected  int contApresentacoes;// conta quantas aprestações os artistas fazem, quando chega na quantidade que é exigida, tem que zerar o contador e iniciar novamente
    private static int pontuacaoTotal;
    private static int qtPontos;
    
    private static boolean apresentacaoLiberada; //libera a apresentação quando chega em 1000 pontos e zera quando chega nos mil pontos e vai verificando sempre se chegou em 1000 pontos e zera novamente
    private static int contLiberacao;
   
    
    public boolean getLiberada(){
        return Artista.apresentacaoLiberada;
    }
    
    
    
    public int getSaldoApresentacoes() {
        return this.saldoApresentacoes;
    }

    public void setSaldoApresentacoes(int saldoApresentacoes) {
        this.saldoApresentacoes = saldoApresentacoes;
    }
 
    
     public  void contApresentacoes(int qtApresentacoes){// conta as quantidades de apresentações de cada artista,
      this.contApresentacoes += qtApresentacoes;        // tem que fazer um calculo das quantidades de apresentações tranformando em pontos para
                                                        // que quando chegue no 1000, pontos libere a atuação gratis                           
    } 
     
    

    
    
    public static void setPontuacao(int ponto){// seta a apontuação de cada artista que vem de outras classes
      Artista.pontuacaoTotal += ponto;
             while(Artista.pontuacaoTotal > 1000){
               Artista.apresentacaoLiberada = true;
               Artista.pontuacaoTotal -= Artista.pontuacaoTotal; // pontuacao total tem que zerar e iniciar novamente, mas se ele passar mais de 200 pontos ele tem que iniciar dos 200 por exe 
               //if(Artista.apresentacaoLiberada = true){
               // Artista.apresentacaoLiberada = false; //tenho que dar false depois 
               //}
              
               
             }
             
      
        
    } 
     /*   public static void setPontuacao(int ponto){// seta a apontuação de cada artista que vem de outras classes
      Artista.pontuacaoTotal += ponto;
            if(Artista.pontuacaoTotal > 1000 && Artista.pontuacaoTotal < 1000){
               Artista.apresentacaoLiberada = true; 
            }else Artista.apresentacaoLiberada = false;
            
           
      }*/
    
    private static double pontuacaoTotal(){// retorno da pontuação total;
       return Artista.pontuacaoTotal;
    }

    
    public int getPontuacaoTotal(){
        return Artista.pontuacaoTotal;
    }
    public int getPontos() {
       qtPontos = Artista.pontuacaoTotal;
        return qtPontos;
    }

    public void setPontos(int pontos) {
        this.qtPontos = pontos;
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
