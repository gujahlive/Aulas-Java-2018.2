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
public class MedicoAuxiliar extends Medico{
    
        @Override
        public boolean medicoAposentado(){
        if (this.idade >= 60){
            return true;       
        }
        return false;
    }
    
}
