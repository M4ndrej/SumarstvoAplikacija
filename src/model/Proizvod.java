/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.enumeracija.Klasa;
import model.enumeracija.MernaJedinica;
import model.enumeracija.Tip;
import model.enumeracija.Vrsta;

/**
 *
 * @author Andrej
 */
public class Proizvod implements OpstiDomenskiObjekat{
    
    private int id;
    private Tip tip;
    private Vrsta vrsta;
    private Klasa klasa;
    private String opis;
    private double cena;
    private MernaJedinica mernaJedinica;

    public Proizvod() {
    }

    public Proizvod(int id, Tip tip, Vrsta vrsta, Klasa klasa, String opis, double cena, MernaJedinica mernaJedinica) {
        this.id = id;
        this.tip = tip;
        this.vrsta = vrsta;
        this.klasa = klasa;
        this.opis = opis;
        this.cena = cena;
        this.mernaJedinica = mernaJedinica;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Tip getTip() {
        return tip;
    }

    public void setTip(Tip tip) {
        this.tip = tip;
    }

    public Vrsta getVrsta() {
        return vrsta;
    }

    public void setVrsta(Vrsta vrsta) {
        this.vrsta = vrsta;
    }

    public Klasa getKlasa() {
        return klasa;
    }

    public void setKlasa(Klasa klasa) {
        this.klasa = klasa;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public MernaJedinica getMernaJedinica() {
        return mernaJedinica;
    }

    public void setMernaJedinica(MernaJedinica mernaJedinica) {
        this.mernaJedinica = mernaJedinica;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + this.id;
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
        final Proizvod other = (Proizvod) obj;
        return this.id == other.id;
    }

    @Override
    public String toString() {
        return tip.toString()+" "+ vrsta.toString()+ " "+ klasa.toString();
    }

    @Override
    public String vratiImeKlase() {
        return "proizvod";
    }

    @Override
    public boolean napuni(ResultSet rs) {
        try {
            this.id = rs.getInt("id");
            this.tip = Tip.valueOf(rs.getString("tip"));
            this.vrsta = Vrsta.valueOf(rs.getString("vrsta"));
            this.klasa = Klasa.valueOf(rs.getString("klasa"));
            this.cena = rs.getDouble("cena");
            this.mernaJedinica = MernaJedinica.valueOf(rs.getString("mernaJedinica"));
            this.opis = rs.getString("opis");
        } catch (SQLException ex) {
            Logger.getLogger(Proizvod.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    

   
    
    
    
    
    
}
