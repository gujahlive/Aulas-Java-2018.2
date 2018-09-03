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
public class MedicoCirurgiao extends Medico{
    
    @Override
        public boolean medicoAposentado(){
        if (this.idade >= 50){
            return true;       
        }
        return false;
    }
        
    @Override
      public double valorAposentadoria (){
       return super.valorAposentadoria()+800;
    }
        
}
