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
    
    private String brojOtpremnice;
    private Otpremac otpremac;
    private Menadzer menadzer;
    private java.util.Date datumOtpremnice;

    public Otpremnica() {
    }

    public Otpremnica(String brojOtpremnice, Otpremac otpremac, Menadzer menadzer, Date datumOtpremnice) {
        this.brojOtpremnice = brojOtpremnice;
        this.otpremac = otpremac;
        this.menadzer = menadzer;
        this.datumOtpremnice = datumOtpremnice;
    }

    public String getBrojOtpremnice() {
        return brojOtpremnice;
    }

    public void setBrojOtpremnice(String brojOtpremnice) {
        this.brojOtpremnice = brojOtpremnice;
    }

    public Otpremac getOtpremac() {
        return otpremac;
    }

    public void setOtpremac(Otpremac otpremac) {
        this.otpremac = otpremac;
    }

    public Menadzer getMenadzer() {
        return menadzer;
    }

    public void setMenadzer(Menadzer menadzer) {
        this.menadzer = menadzer;
    }

    public Date getDatumOtpremnice() {
        return datumOtpremnice;
    }

    public void setDatumOtpremnice(Date datumOtpremnice) {
        this.datumOtpremnice = datumOtpremnice;
    }

    @Override
    public String toString() {
        return "Otpremnica: " + brojOtpremnice ;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.brojOtpremnice);
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
        return Objects.equals(this.brojOtpremnice, other.brojOtpremnice);
    }
    
    
    
    
}
