/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tabela_model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Lokalitet;

/**
 *
 * @author Andrej
 */
public class LokalitetModelTabele extends AbstractTableModel{
    
    private String[] kolone = {"Jedinica gazdinstva","Odsek i odeljenje","Doznaka", "Datum doznake"};
    private List<Lokalitet> listaLokaliteta = new ArrayList<>();

    public LokalitetModelTabele(List<Lokalitet> lista) {
        listaLokaliteta = lista;
    }

    @Override
    public int getRowCount() {
        return listaLokaliteta.size();
    }

    @Override
    public int getColumnCount() {
        return kolone.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Lokalitet lokalitet = listaLokaliteta.get(rowIndex);
        switch(columnIndex){
        case 0:
            return lokalitet.getJedinicaGazdinstva();
        case 1:
            return lokalitet.getOdsekOdeljenje();
        case 2:
            return lokalitet.getDoznaka();
        case 3: 
            return lokalitet.getDatumDoznake();
        default:
            return "";
        }
    }

    @Override
    public String getColumnName(int column) {
        return kolone[column];
    }
    
}
