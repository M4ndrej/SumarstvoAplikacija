/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;
import java.util.Objects;
import model.enumeracija.JedinicaGazdinstva;

/**
 *
 * @author Andrej
 */
public class Lokalitet {
    
    private String odsekOdeljenje;
    private String naziv;
    private JedinicaGazdinstva jedinicaGazdinstva;
    private double doznaka;
    private java.util.Date datumDoznake;

    public Lokalitet() {
    }

    public Lokalitet(String odsekOdeljenje, String naziv, JedinicaGazdinstva jedinicaGazdinstva, double doznaka, Date datumDoznake) {
        this.odsekOdeljenje = odsekOdeljenje;
        this.naziv = naziv;
        this.jedinicaGazdinstva = jedinicaGazdinstva;
        this.doznaka = doznaka;
        this.datumDoznake = datumDoznake;
    }

    public String getOdsekOdeljenje() {
        return odsekOdeljenje;
    }

    public void setOdsekOdeljenje(String odsekOdeljenje) {
        this.odsekOdeljenje = odsekOdeljenje;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public JedinicaGazdinstva getJedinicaGazdinstva() {
        return jedinicaGazdinstva;
    }

    public void setJedinicaGazdinstva(JedinicaGazdinstva jedinicaGazdinstva) {
        this.jedinicaGazdinstva = jedinicaGazdinstva;
    }

    public double getDoznaka() {
        return doznaka;
    }

    public void setDoznaka(double doznaka) {
        this.doznaka = doznaka;
    }

    public Date getDatumDoznake() {
        return datumDoznake;
    }

    public void setDatumDoznake(Date datumDoznake) {
        this.datumDoznake = datumDoznake;
    }

    @Override
    public String toString() {
        return "Lokalitet: " + naziv;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.odsekOdeljenje);
        hash = 47 * hash + Objects.hashCode(this.naziv);
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
        final Lokalitet other = (Lokalitet) obj;
        if (!Objects.equals(this.odsekOdeljenje, other.odsekOdeljenje)) {
            return false;
        }
        return Objects.equals(this.naziv, other.naziv);
    }

    
    
    
    
}
