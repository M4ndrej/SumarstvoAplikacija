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

/**
 *
 * @author Andrej
 */
public class Menadzer implements OpstiDomenskiObjekat {

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
        return imePrezime;
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

    @Override
    public String vratiImeKlase() {
        return "menadzer";
    }

    @Override
    public boolean napuni(ResultSet rs) {
        try {
            this.jmbg = rs.getString("jmbgMenadzer");
            this.imePrezime = rs.getString("imePrezime");
            this.kontakt = rs.getString("kontakt");
            this.email = rs.getString("email");
            this.lozinka = rs.getString("lozinka");
        } catch (SQLException ex) {
            Logger.getLogger(Menadzer.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    @Override
    public String vratiNaziveKolona() {
        return null;
    }

    @Override
    public String vratiVrednostiKolona() {
        return null;
    }

}
