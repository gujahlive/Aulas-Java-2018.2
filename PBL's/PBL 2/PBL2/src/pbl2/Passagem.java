/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbl2;

import java.util.Date;

/**
 *
 * @author gusta
 */
public class Passagem {
    private Date data_ida;
    private Date data_volta;
    private String cidade_Origem;
    private String cidade_Destino;
    private double valor;
    
    public void setDtIda(Date data_ida){
        this.data_ida = data_ida;
    }
    public Date getDtIda(){
       return this.data_ida;
    }    
    
     public void setDtVolta(Date data_volta){
        this.data_volta = data_volta;
    }
    public Date getDtVolta(){
       return this.data_volta;
    } 
    
    
    
    
}
