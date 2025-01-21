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
public class Menadzer {
    
    private String jmbg;
    private String imePrezime;
    private String kontakt;
    private String lozinka;
    private String email;

    public Menadzer() {
    }

    public Menadzer(String jmbg, String imePrezime, String kontakt, String lozinka, String email) {
        this.jmbg = jmbg;
        this.imePrezime = imePrezime;
        this.kontakt = kontakt;
        this.lozinka = lozinka;
        this.email = email;
    }

    public String getJmbg() {
        return jmbg;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public String getKontakt() {
        return kontakt;
    }

    public String getLozinka() {
        return lozinka;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Menadzer: "+imePrezime;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.jmbg);
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
        final Menadzer other = (Menadzer) obj;
        return Objects.equals(this.jmbg, other.jmbg);
    }
    
    
}
