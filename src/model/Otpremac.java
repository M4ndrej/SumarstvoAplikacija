/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Objects;

/**
 *
 * @author Andrej
 */
public class Otpremac {
    
    private String jmbg;
    private String imePrezime;
    private Lokalitet lokalitet;

    public Otpremac() {
    }

    public Otpremac(String jmbg, String imePrezime, Lokalitet lokalitet) {
        this.jmbg = jmbg;
        this.imePrezime = imePrezime;
        this.lokalitet = lokalitet;
    }

    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public Lokalitet getLokalitet() {
        return lokalitet;
    }

    public void setLokalitet(Lokalitet lokalitet) {
        this.lokalitet = lokalitet;
    }

    @Override
    public String toString() {
        return "Otpremac: " + imePrezime +", "+ lokalitet;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 13 * hash + Objects.hashCode(this.jmbg);
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
        final Otpremac other = (Otpremac) obj;
        return Objects.equals(this.jmbg, other.jmbg);
    }
    
    
    
    
    
}
