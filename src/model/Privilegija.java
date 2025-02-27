/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Andrej
 */
public class Privilegija implements OpstiDomenskiObjekat{
    
    private int id;
    private String naziv;

    public Privilegija() {
    }

    public Privilegija(int id, String naziv) {
        this.id = id;
        this.naziv = naziv;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    @Override
    public String toString() {
        return naziv;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Privilegija other = (Privilegija) obj;
        return this.id == other.id;
    }

    @Override
    public String vratiImeKlase() {
        return "privilegija";
    }

    @Override
    public boolean napuni(ResultSet rs) {
        try {
            this.id = rs.getInt("id");
            this.naziv = rs.getString("naziv");
        } catch (SQLException ex) {
            Logger.getLogger(Privilegija.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    @Override
    public String vratiNaziveKolona() {
        return "(id,naziv)";
    }

    @Override
    public String vratiVrednostiKolona() {
        return "("+this.id+",'"+this.naziv+"')";
    }

    @Override
    public String vratiUslovNadjiSlog() {
        return "id="+this.getId();
    }

    @Override
    public String vratiUslovNadjiSlogove() {
        return null;
    }
    
    
    
    
}
