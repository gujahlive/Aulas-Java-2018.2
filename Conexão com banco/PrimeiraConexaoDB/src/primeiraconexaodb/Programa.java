/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeiraconexaodb;

/**
 *
 * @author gusta
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conexao c = new Conexao();
        c.conectar();
        if(c.estaConectado() == true){
            System.out.println("Está conectado");
        }else System.out.println("Não Conectou");
        
        
        String nome = "fran";
        String telefone = "guguinha";
        int idade = 21;
        
        String script = "insert into cliente (nome, telefone, idade)"+
                "values ('"+nome+"','"+telefone+"',"+idade+");";
        
        
        System.out.println(script);
    }
    
}
