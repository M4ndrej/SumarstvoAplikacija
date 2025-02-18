/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tabela_model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Proizvod;
import model.StavkaOtpremnice;


/**
 *
 * @author Andrej
 */
public class StavkaOtpremniceModelTabele extends AbstractTableModel{
    
    private String[] kolone = {"Redni broj", "Proizvod", "Količina", "Ukupna cena"};
    private List<StavkaOtpremnice> listaStavkiOtpremnica = new ArrayList<>();

    public StavkaOtpremniceModelTabele(List<StavkaOtpremnice> lista) {
        listaStavkiOtpremnica = lista;
    }

    @Override
    public int getRowCount() {
        return listaStavkiOtpremnica.size();
    }

    @Override
    public int getColumnCount() {
        return kolone.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        StavkaOtpremnice stavkaOtpremnice = listaStavkiOtpremnica.get(rowIndex);
        switch(columnIndex){
        case 0:
            return stavkaOtpremnice.getRedniBroj();
        case 1:
            return stavkaOtpremnice.getProizvod();
        case 2:
            return stavkaOtpremnice.getKolicina();
        case 3:
            return stavkaOtpremnice.getUkupnaCena();
        default:
            return "";
        }
    }

    @Override
    public String getColumnName(int column) {
        return kolone[column];
    }

    public void dodajElement(StavkaOtpremnice so) {
        listaStavkiOtpremnica.add(so);
        fireTableDataChanged();
    }

    public List<StavkaOtpremnice> getLista() {
        return listaStavkiOtpremnica;
    }

    public void ukloniStavku(int red) {
        listaStavkiOtpremnica.remove(red);
        fireTableDataChanged();
    }
    
}
