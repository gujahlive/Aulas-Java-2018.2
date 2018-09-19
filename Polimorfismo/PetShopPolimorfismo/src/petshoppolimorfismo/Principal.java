/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petshoppolimorfismo;

/**
 *
 * @author gusta
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              // POLIMORFISMO 
        //Pet cao = new Cachorro (); //quando ele é instanciado do tipo Pet ele só tem acesso a classe Pet 
        Cachorro dog = new Cachorro ();// tem todos os acessos a classe cachorro
        Dono dono = new Dono(); // tem todos os acessos a classe dono
        Servico serv = new Servico(); // tem todos os acessos a classe servico 
       // cao.setNome("Ted");
        //cao.setCor("preto");
        //cao.setPeso(20);
        dog.setNascimento(2010);
        dog.CalcularIdade();
        //System.out.println("Nome: "+cao.getNome());
        //System.out.println("Cor: "+cao.getCor());
       // System.out.println("Peso: "+cao.getPeso());
        System.out.println("Nascimento: "+dog.getNascimento());
        System.out.println("Idade: "+dog.CalcularIdade());
        
        dono.setNome("Guguinha");
        dono.setCpf(123);
        
        dog.setDono(dono); // associando dono ao cachorro 
        System.out.println("Nome dono: : "+dog.getDono().getNome());
        System.out.println("CPF dono: : "+dog.getDono().getCpf());
        
        //----------------------------------------------------------------------------------------------------
        Endereco endereco = new Endereco (); // tem todos os acessos a classe Endereco  
        endereco.setBairro("kcQCM");
        endereco.setRua("kavpaevap");
        endereco.setCep(1231);
        dono.setEndereco(endereco);
        System.out.println("rua: "+dono.getEndereco().getRua()); // associação 
        
        System.out.println("Preço Banho:"+serv.CalcularBanho(dog));
        
        //------------------------------------------------------------------------------------------------------
        
        Coelho coelho = new Coelho ();
        Dono dono1 = new Dono ();
        dono1.setNome("Nathalia");
        coelho.setNome("Coelhinho");
        coelho.setDono(dono1);
        System.out.println("Dono:  "+coelho.getDono().getNome());
        serv.CalcularBanho(coelho);
        System.out.println("Banho: "+serv.CalcularBanho(coelho));
 
    }
    
}
