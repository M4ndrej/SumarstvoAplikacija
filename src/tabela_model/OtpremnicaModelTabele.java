/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tabela_model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Otpremnica;
import model.Proizvod;


/**
 *
 * @author Andrej
 */
public class OtpremnicaModelTabele extends AbstractTableModel{
    
    private String[] kolone = {"Broj otpremnice","Menadzer", "Otpremač", "Kupac", "Datum otpremnice"};
    private List<Otpremnica> listaOtprmenica = new ArrayList<>();

    public OtpremnicaModelTabele(List<Otpremnica> lista) {
        listaOtprmenica = lista;
    }

    @Override
    public int getRowCount() {
        return listaOtprmenica.size();
    }

    @Override
    public int getColumnCount() {
        return kolone.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Otpremnica otpremnica = listaOtprmenica.get(rowIndex);
        switch(columnIndex){
        case 0:
            return otpremnica.getBrojOtpremnice();
        case 1:
            return otpremnica.getMenadzer().getImePrezime();
        case 2:
            return otpremnica.getOtpremac().getImePrezime();
        case 3:
            return otpremnica.getKupac().getNaziv();
        case 4:
            return otpremnica.getDatumOtpremnice();
        default:
            return "";
        }
    }

    @Override
    public String getColumnName(int column) {
        return kolone[column];
    }

    public List<Otpremnica> getLista() {
        return listaOtprmenica;
    }

 
    
}
