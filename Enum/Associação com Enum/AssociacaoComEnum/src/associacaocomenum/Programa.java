/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package associacaocomenum;

import javax.swing.JOptionPane;

/**
 *
 * @author gusta
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DiaSemana dia = DiaSemana.DOMINGO;// não instacia com o new
        System.out.println(dia.toString()+" - "+dia.getValor());//to String chama o próprio nome do enum, no caso retorna o domingo
        // existe a classe java.lang.Enum, caso precise importar
        // TODO code application logic here
        Data data = new Data(2,10,2018,DiaSemana.TERCA);
        Formulario form = new Formulario();
        int e = Integer.parseInt(JOptionPane.showInputDialog("1 - MASCULINO\n 2 - FEMININO"));
        if(e == 1){
            form.setGenero(Formulario.Genero.MASCULINO);
        }else form.setGenero(Formulario.Genero.FEMININO); 
        System.out.println("O sexo é: "+form.getGenero().toString());
        
        
    }
    
}
