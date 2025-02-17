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
public class Otpremnica {
    
    private Kupac kupac;
    private Menadzer menadzer;
    private Otpremac otpremac;
    private int brojOtpremnice;
    private java.util.Date datumOtpremnice;

    public Otpremnica() {
    }

    public Otpremnica(Kupac kupac, Menadzer menadzer, Otpremac otpremac, int brojOtpremnice, Date datumOtpremnice) {
        this.kupac = kupac;
        this.menadzer = menadzer;
        this.otpremac = otpremac;
        this.brojOtpremnice = brojOtpremnice;
        this.datumOtpremnice = datumOtpremnice;
    }

    public Kupac getKupac() {
        return kupac;
    }

    public void setKupac(Kupac kupac) {
        this.kupac = kupac;
    }

    public Menadzer getMenadzer() {
        return menadzer;
    }

    public void setMenadzer(Menadzer menadzer) {
        this.menadzer = menadzer;
    }

    public Otpremac getOtpremac() {
        return otpremac;
    }

    public void setOtpremac(Otpremac otpremac) {
        this.otpremac = otpremac;
    }

    public int getBrojOtpremnice() {
        return brojOtpremnice;
    }

    public void setBrojOtpremnice(int brojOtpremnice) {
        this.brojOtpremnice = brojOtpremnice;
    }

    public Date getDatumOtpremnice() {
        return datumOtpremnice;
    }

    public void setDatumOtpremnice(Date datumOtpremnice) {
        this.datumOtpremnice = datumOtpremnice;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.brojOtpremnice;
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
        final Otpremnica other = (Otpremnica) obj;
        return this.brojOtpremnice == other.brojOtpremnice;
    }
}
