/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

/**
 *
 * @author aluno
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Conexao c = new Conexao();
        c.conectar();
        if(c.isConnected()){
            System.out.println("Conectado");
        }else{
            System.out.println("deu ruim!!! ");
        }
        String nome = "Guga";
        String telefone = "321";
        int idade = 11;
          String script = "Insert into cliente (nome,telefone,idade) values"
               +" ('"+nome+"','"+telefone+"',"+idade+");";
        System.out.println(script);
    }
    
}
