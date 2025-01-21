/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Andrej
 */
public class Racun {
    
    private Otpremnica otpremnica;
    private String sifraRacuna;
    private java.util.Date datumRacuna;
    private Kupac kupac;

    public Racun() {
    }

    public Racun(Otpremnica otpremnica, String sifraRacuna, Date datumRacuna, Kupac kupac) {
        this.otpremnica = otpremnica;
        this.sifraRacuna = sifraRacuna;
        this.datumRacuna = datumRacuna;
        this.kupac = kupac;
    }

    public Otpremnica getOtpremnica() {
        return otpremnica;
    }

    public void setOtpremnica(Otpremnica otpremnica) {
        this.otpremnica = otpremnica;
    }

    public String getSifraRacuna() {
        return sifraRacuna;
    }

    public void setSifraRacuna(String sifraRacuna) {
        this.sifraRacuna = sifraRacuna;
    }

    public Date getDatumRacuna() {
        return datumRacuna;
    }

    public void setDatumRacuna(Date datumRacuna) {
        this.datumRacuna = datumRacuna;
    }

    public Kupac getKupac() {
        return kupac;
    }

    public void setKupac(Kupac kupac) {
        this.kupac = kupac;
    }

    @Override
    public String toString() {
        return "Racun: " + sifraRacuna;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.otpremnica);
        hash = 97 * hash + Objects.hashCode(this.sifraRacuna);
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
        final Racun other = (Racun) obj;
        if (!Objects.equals(this.sifraRacuna, other.sifraRacuna)) {
            return false;
        }
        return Objects.equals(this.otpremnica, other.otpremnica);
    }
    
    
    
}
