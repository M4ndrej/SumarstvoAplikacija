/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Objects;
import model.enumeracija.Klasa;
import model.enumeracija.MernaJedinica;
import model.enumeracija.Tip;
import model.enumeracija.Vrsta;

/**
 *
 * @author Andrej
 */
public class TipDrveta {
    
    private Tip tip;
    private Vrsta vrsta;
    private Klasa klasa;
    private String opis;
    private double cena;
    private MernaJedinica mernaJedinica;

    public TipDrveta() {
    }

    public TipDrveta(Tip tip, Vrsta vrsta, Klasa klasa, String opis, double cena, MernaJedinica mernaJedinica) {
        this.tip = tip;
        this.vrsta = vrsta;
        this.klasa = klasa;
        this.opis = opis;
        this.cena = cena;
        this.mernaJedinica = mernaJedinica;
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
    public String toString() {
        return "TipDrveta: " + "tip" + tip + ", vrsta: " + vrsta + ", klasa: "  + klasa;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.tip);
        hash = 97 * hash + Objects.hashCode(this.vrsta);
        hash = 97 * hash + Objects.hashCode(this.klasa);
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
        final TipDrveta other = (TipDrveta) obj;
        if (this.tip != other.tip) {
            return false;
        }
        if (this.vrsta != other.vrsta) {
            return false;
        }
        return this.klasa == other.klasa;
    }
    
    
    
    
    
}
