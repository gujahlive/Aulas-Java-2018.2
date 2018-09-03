/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadeheranca;

/**
 *
 * @author aluno
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Medico medico = new Medico();
        MedicoCirurgiao medCir = new MedicoCirurgiao();
        MedicoAuxiliar medAux = new MedicoAuxiliar();
        
        medAux.setIdade(55);
        System.out.println("Pode se aposentar: "+medAux.medicoAposentado());
        
        // TODO code application logic here
    }
    
}
