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
public class Kupac implements OpstiDomenskiObjekat{
    
    private int id;
    private String naziv;
    private String imeVlasnika;

    public Kupac() {
    }

    public Kupac(int id, String naziv, String imeVlasnika) {
        this.id = id;
        this.naziv = naziv;
        this.imeVlasnika = imeVlasnika;
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

    public String getImeVlasnika() {
        return imeVlasnika;
    }

    public void setImeVlasnika(String imeVlasnika) {
        this.imeVlasnika = imeVlasnika;
    }

    @Override
    public String toString() {
        return naziv;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + this.id;
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
        final Kupac other = (Kupac) obj;
        return this.id == other.id;
    }

    @Override
    public String vratiImeKlase() {
        return "kupac";
    }

    @Override
    public boolean napuni(ResultSet rs) {
        try {
            this.id = rs.getInt("id");
            this.naziv = rs.getString("naziv");
            this.imeVlasnika = rs.getString("imeVlasnika");
        } catch (SQLException ex) {
            Logger.getLogger(Kupac.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    @Override
    public String vratiNaziveKolona() {
        return "(naziv,imeVlasnika)";
    }

    @Override
    public String vratiVrednostiKolona() {
        return "('"+this.naziv+"','"+this.imeVlasnika+"')";
    }

    @Override
    public String vratiUslovNadjiSlog() {
        return "id="+this.getId();
    }

    @Override
    public String vratiUslovNadjiSlogove() {
        return "naziv LIKE LOWER ('"+this.getNaziv().toLowerCase()+"%')";
    }
}
