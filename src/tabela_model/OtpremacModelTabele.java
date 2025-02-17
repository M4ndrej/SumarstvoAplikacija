/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tabela_model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Otpremac;


/**
 *
 * @author Andrej
 */
public class OtpremacModelTabele extends AbstractTableModel{
    
    private String[] kolone = {"Ime i prezime", "Lokalitet"};
    private List<Otpremac> listaOtpremaca = new ArrayList<>();

    public OtpremacModelTabele(List<Otpremac> lista) {
        listaOtpremaca = lista;
    }

    @Override
    public int getRowCount() {
        return listaOtpremaca.size();
    }

    @Override
    public int getColumnCount() {
        return kolone.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Otpremac otpremac = listaOtpremaca.get(rowIndex);
        switch(columnIndex){
        case 0:
            return otpremac.getImePrezime();
        case 1:
            return otpremac.getLokalitet().getJedinicaGazdinstva();
        default:
            return "";
        }
    }

    @Override
    public String getColumnName(int column) {
        return kolone[column];
    }
    
}
