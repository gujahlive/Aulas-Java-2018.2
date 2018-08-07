/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comerciocadeira;

/**
 *
 * @author aluno
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cadeira cadeira1;
        cadeira1 = new Cadeira();
        //Cadeira cadeira2 = new Cadeira();
        // TODO code application logic here
        cadeira1.altura = 0.5f;
        cadeira1.braco = false;
        cadeira1.corEstofado = "Azul";
        cadeira1.material = "Ferro";
        cadeira1.valor = 200;
        System.out.println("Cadeira\nMaterial: "+cadeira1.material+" Cor estofado: "+cadeira1.corEstofado+" Valor: "+cadeira1.valor);
    }
    
}
