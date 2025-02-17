/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.OpstiDomenskiObjekat;
import java.sql.ResultSet;

/**
 *
 * @author Andrej
 */
public class DBBroker {
    
    private Konekcija konekcija = Konekcija.getInstance();
    private Statement statement;

    public List<OpstiDomenskiObjekat> read(OpstiDomenskiObjekat odo) {
        try {
            List<OpstiDomenskiObjekat> lista = new ArrayList<>();
            statement = konekcija.getConnection().createStatement();
            String upit = "SELECT * FROM "+odo.vratiImeKlase();
            ResultSet rs = statement.executeQuery(upit);
            while(rs.next()){
                OpstiDomenskiObjekat noviObjekat;
                try {
                    noviObjekat = odo.getClass().getDeclaredConstructor().newInstance();
                    if(noviObjekat.napuni(rs)){
                        lista.add(noviObjekat);
                    }
                } catch (Exception ex) {
                    Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
                
                }
            }
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
}
