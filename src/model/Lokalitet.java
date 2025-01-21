/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import model.enumeracija.JedinicaGazdinstva;

/**
 *
 * @author Andrej
 */
public class Lokalitet {
    
    private int id;
    private String naziv;
    private JedinicaGazdinstva jedinicaGazdinstva;
    private String odeljenje;
    private String odsek;

    public Lokalitet() {
    }

    public Lokalitet(int id, String naziv, JedinicaGazdinstva jedinicaGazdinstva, String odeljenje, String odsek) {
        this.id = id;
        this.naziv = naziv;
        this.jedinicaGazdinstva = jedinicaGazdinstva;
        this.odeljenje = odeljenje;
        this.odsek = odsek;
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

    public JedinicaGazdinstva getJedinicaGazdinstva() {
        return jedinicaGazdinstva;
    }

    public void setJedinicaGazdinstva(JedinicaGazdinstva jedinicaGazdinstva) {
        this.jedinicaGazdinstva = jedinicaGazdinstva;
    }

    public String getOdeljenje() {
        return odeljenje;
    }

    public void setOdeljenje(String odeljenje) {
        this.odeljenje = odeljenje;
    }

    public String getOdsek() {
        return odsek;
    }

    public void setOdsek(String odsek) {
        this.odsek = odsek;
    }

    @Override
    public String toString() {
        return "Lokalitet: "+naziv;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.id;
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
    
    
    
    
}
