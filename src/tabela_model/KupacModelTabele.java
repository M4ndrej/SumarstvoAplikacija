/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tabela_model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Kupac;

/**
 *
 * @author Andrej
 */
public class KupacModelTabele extends AbstractTableModel{
    
    private String[] kolone = {"Naziv","Ime vlasnika"};
    private List<Kupac> listaKupaca = new ArrayList<>();

    public KupacModelTabele(List<Kupac> lista) {
        listaKupaca = lista;
    }

    @Override
    public int getRowCount() {
        return listaKupaca.size();
    }

    @Override
    public int getColumnCount() {
        return kolone.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Kupac kupac = listaKupaca.get(rowIndex);
        switch(columnIndex){
        case 0:
            return kupac.getNaziv();
        case 1:
            return kupac.getImeVlasnika();
        default:
            return "";
        }
    }

    @Override
    public String getColumnName(int column) {
        return kolone[column];
    }
    
}
