/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbl2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        Pacote pacote = new Pacote();
        Passagem passagem = new Passagem();
        Translado translado = new Translado();
        Hospedagem hospedagem = new Hospedagem();
        PasseioTuristico passeio = new PasseioTuristico();
        boolean ganhouPasseio;

        int e, contPassagem = 0, contPacote = 0, contTranslado = 0, contHospedagem = 0;
        do {
            e = Integer.parseInt(JOptionPane.showInputDialog("1 - Passagem\n"
                    + "2 - Translado\n3 - Hospedagem\n4 - Passeios Turísticos\n5 - sair"));
            if (contPassagem == 1 && contTranslado == 1 && contHospedagem == 1) {
                ganhouPasseio = true;
            }
            switch (e) {

                case 1:
                    GregorianCalendar dataida = new GregorianCalendar();
                    GregorianCalendar datavolta = new GregorianCalendar();
                    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                    try {
                        dataida.setTime(sdf.parse(JOptionPane.showInputDialog("Insira a data de ida")));
                        passagem.setDataIda(dataida);
                    } catch (ParseException ex) {
                        System.out.println("Erro: " + ex.getMessage());
                    }
                    try {
                        datavolta.setTime(sdf.parse(JOptionPane.showInputDialog("Insira a data de volta")));
                        passagem.setDataVolta(datavolta);
                    } catch (ParseException ex) {
                        System.out.println("Erro: " + ex.getMessage());

                    }
                    passagem.setCidadeOrigem(JOptionPane.showInputDialog("Qual cidade de origem"));
                    passagem.setCidadeDestino(JOptionPane.showInputDialog("Qual cidade de destino"));
                    passagem.setValorPassagem(Double.parseDouble(JOptionPane.showInputDialog("Qual o valor da passagem")));

                    System.out.println("-------PASSAGEM MARCADA PARA----\n");
                    System.out.println("Cidade Origem: " + passagem.getCidadeOrigem());
                    System.out.println("Cidade Destino: " + passagem.getCidadeDestino());
                    System.out.println("Data Ida: " + passagem.getDataIda());
                    System.out.println("Data Volta: " + passagem.getDataVolta());
                    System.out.println("Valor da passagem: " + passagem.getValorPassagem());
                    System.out.println("Total de dias de viagem: " + passagem.calcularDiasDeViagem());
                    contPassagem++;
                    break;
                case 2:
                    GregorianCalendar dataidaT = new GregorianCalendar();
                    GregorianCalendar datavoltaT = new GregorianCalendar();
                    SimpleDateFormat sdfT = new SimpleDateFormat("dd/MM/yyyy");
                    try {
                        dataidaT.setTime(sdfT.parse(JOptionPane.showInputDialog("Insira a data de ida")));
                        translado.setDataIda(dataidaT);
                    } catch (ParseException ex) {
                        System.out.println("Erro: " + ex.getMessage());
                    }
                    try {
                        datavoltaT.setTime(sdfT.parse(JOptionPane.showInputDialog("Insira a data de volta")));
                        translado.setDataVolta(datavoltaT);
                    } catch (ParseException ex) {
                        System.out.println("Erro: " + ex.getMessage());

                    }
                    
                    translado.setDistancia(Double.parseDouble(JOptionPane.showInputDialog("Digite a distância do passeio")));
                    
                    
                    break;
                case 3:
                    hospedagem.setValorDiaria(Double.parseDouble(JOptionPane.showInputDialog("Valor da diária da hospedagem: ")));
                    hospedagem.setDiasViagem();
                    System.out.println("Valor : "+hospedagem.getValorDiaria());
                    System.out.println("Dias da hospedagem : "+hospedagem.getDiasViagem());
                    
                    break;
                case 4:
                    
                    passeio.setValor(Double.parseDouble(JOptionPane.showInputDialog("Valor da diária do passeio: ")));
                    break;
                case 5:
                    break;

            }
        } while (e != 5);

    }
}
