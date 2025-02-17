/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import database.DBBroker;
import java.util.List;
import model.Kupac;
import model.OpstiDomenskiObjekat;

/**
 *
 * @author Andrej
 */
public class Controller {
    
    private static Controller instance;
    private DBBroker dbb = new DBBroker();
   

    public static Controller getInstance() {
        if(instance == null){
            instance = new Controller();
        }
        return instance;
    }

    public boolean vratiListuKupac(List<Kupac> lista) {
        
        List<OpstiDomenskiObjekat> listaOdo = dbb.read(new Kupac());
        if(listaOdo == null){
            return false;
        }
        for(OpstiDomenskiObjekat o: listaOdo){
            lista.add((Kupac) o);
        }
        return true;
    }
    
    
}
