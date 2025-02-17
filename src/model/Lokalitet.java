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

    private int id;
    private JedinicaGazdinstva jedinicaGazdinstva;
    private String odsekOdeljenje;
    private double doznaka;
    private java.util.Date datumDoznake;

    public Lokalitet() {
    }

    public Lokalitet(int id, JedinicaGazdinstva jedinicaGazdinstva, String odsekOdeljenje, double doznaka, Date datumDoznake) {
        this.id = id;
        this.jedinicaGazdinstva = jedinicaGazdinstva;
        this.odsekOdeljenje = odsekOdeljenje;
        this.doznaka = doznaka;
        this.datumDoznake = datumDoznake;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public JedinicaGazdinstva getJedinicaGazdinstva() {
        return jedinicaGazdinstva;
    }

    public void setJedinicaGazdinstva(JedinicaGazdinstva jedinicaGazdinstva) {
        this.jedinicaGazdinstva = jedinicaGazdinstva;
    }

    public String getOdsekOdeljenje() {
        return odsekOdeljenje;
    }

    public void setOdsekOdeljenje(String odsekOdeljenje) {
        this.odsekOdeljenje = odsekOdeljenje;
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
    public int hashCode() {
        int hash = 5;
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
        final Lokalitet other = (Lokalitet) obj;
        return this.id == other.id;
    }

    @Override
    public String toString() {
        return "jedinicaGazdinstva=" + jedinicaGazdinstva + ", odsekOdeljenje=" + odsekOdeljenje + '}';
    }
    
    

    
}
