package pbl1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACQUA
 */

/*Calculadora de Frequência Cardíaca-alvo
P1 - Ao realizar exercícios físicos, você pode utilizar um monitor de frequência cardíaca para ver se sua
frequência permanece dentro de um intervalo seguro, sugerido pelos seus treinadores e médicos. Segundo a
AMerican Heart Assossiation (AHA) (www.americanheart.org/presenter.jhtml?identifier=4736), a fórmula para
calcular a frequência cardíaca máxima por minuto é 220 menos sua idade. Sua frequência cardíaca alvo é um
intervalo entre 50 - 85% da frequência cardíaca máxima. [Nota: essas formulas são estimativas fornecidas pelo
AHA. As frequências cardíacas máximas e alvo podem variar com base na sua saúde, capacidade física, idade e
sexo da pessoa. Sempre consulte um médico ou profissional da saúde qualificado antes de começar ou
modificar um programa de exercícios físicos.

Crie uma classe chamada HeartRates. Os atributos da classe devem incluir o nome, sobrenome e data de
nascimento da pessoa (Consistindo em atributos separados para mês, dia e ano de nascimento).
Sua classe deve ter um construtor que recebe esses dados como parâmetros. Para cada atributo forneça métodos
set e get. A Classe deve incluir um método que calcula e retorna a idade da pessoa (em anos), um método que
calcula e retorna frequência cardíaca máxima da pessoa e um método que calcula e retorna a frequência
cardíaca alvo da pessoa.
Escreva um aplicativo Java que solicite a informação da pessoa - calcule e imprima a idade da pessoa (em
anos), intervalo de frequência cardíaca máxima e frequência cardíaca-alvo. 
*/
public class HeartRates {
    
    private String nome , sobrenome;
    private int dia, mes , anoNasc,resultIdade;
    //private int ;
    private double FCMPM,result50,result85;
    
    public HeartRates(String nome , String sobrenome,  int dia, int mes , int anoNasc){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dia = dia;
        this.mes = mes;
        this.anoNasc = anoNasc;
        
    }
    void setNome(String nome){
        this.nome = nome;
    } 
    String getNome(){
        return this.nome;
    }
    void setSobreNome(String sobrenome){
        this.sobrenome = sobrenome;
    } 
    String getSobreNome(){
        return this.sobrenome;
    }
    void setDiaNasc(int dia){
        this.dia = dia;
    } 
    int getDiaNasc(){
        return this.dia;
    }
     void setMesNasc(int mes){
        this.mes = mes;
    } 
    int getMesNasc(){
        return this.mes;
    }
    
    void setAnoNasc(int anoNasc){
        this.anoNasc = anoNasc;
    } 
    int getAnoNasc(){
        return this.anoNasc;
    }
    void CalcIdadeEmAnos(int diaAtual,int mesAtual,int anoAtual){
         if(anoAtual >= getAnoNasc()){
            this.resultIdade = anoAtual - getAnoNasc();
            if(mesAtual <= getMesNasc() ){
                this.resultIdade -= 1;
                if(diaAtual <= getDiaNasc() ){
                    this.resultIdade = resultIdade ;
                }else this.resultIdade += 1 ;
            }//else resultIdade += 1;
        }
        
    }
    int getCalcIdade(){
        return resultIdade;
    }
    
    double CalcFreqCardMax(){
        FCMPM = 220 - resultIdade; 
        /* a fórmula para calcular a frequência cardíaca máxima por minuto é 220 menos sua idade.
        Sua frequência cardíaca alvo é um intervalo entre 50 - 85% da frequência cardíaca máxima.*/
        return FCMPM;
    }
    
    double CalcFreqCardAlvo(){
        int i,n=0;
        this.result50 = FCMPM * 0.50 ;
        this.result85 = FCMPM * 0.85;
        /*for (i=(int) this.result50 ; i<this.result85 ; i++){
            n = (int) (Math.random()*100);
        }*/
        
        
        return n; 
        
    }
    
}  
