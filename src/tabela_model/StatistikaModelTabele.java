/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tabela_model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Andrej
 */
public class StatistikaModelTabele extends AbstractTableModel{
    
    private String[] kolone = {"Lokalitet","Odsek i odeljenje","Doznaka","Otprema"};
    private  List<Object[]> otpreme;
    
    public StatistikaModelTabele(List<Object[]> otpreme){
        this.otpreme = new ArrayList<>(otpreme);
    }
    
    @Override
    public int getRowCount() {
        return otpreme.size();
    }

    @Override
    public int getColumnCount() {
            return kolone.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object[] entry = otpreme.get(rowIndex); // Dobija podatke za red
        return entry[columnIndex];
    }

    @Override
    public String getColumnName(int column) {
        return kolone[column];
    }
    
    
    
}
