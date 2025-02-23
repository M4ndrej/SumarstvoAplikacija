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
    private boolean prviLog;

    public Menadzer() {
    }

    public Menadzer(String jmbg, String imePrezime, String kontakt, String lozinka, String email, boolean prviLog) {
        this.jmbg = jmbg;
        this.imePrezime = imePrezime;
        this.kontakt = kontakt;
        this.lozinka = lozinka;
        this.email = email;
        this.prviLog = prviLog;
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

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public void setKontakt(String kontakt) {
        this.kontakt = kontakt;
    }

    public void setLozinka(String lozinka) {
        this.lozinka = lozinka;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isPrviLog() {
        return prviLog;
    }

    public void setPrviLog(boolean prviLog) {
        this.prviLog = prviLog;
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
            this.prviLog = rs.getBoolean("prviLog");
        } catch (SQLException ex) {
            Logger.getLogger(Menadzer.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    @Override
    public String vratiNaziveKolona() {
        return "(jmbgMenadzer,imePrezime,kontakt,lozinka,email,prviLog)";
    }

    @Override
    public String vratiVrednostiKolona() {
        return "('"+this.jmbg+"','"+this.imePrezime+"','"+this.kontakt+"','"+this.lozinka+"','"+this.email+"',"+this.prviLog+")";
    }

    @Override
    public String vratiUslovNadjiSlog() {
        return "jmbgMenadzer="+this.getJmbg();
    }

    @Override
    public String vratiUslovNadjiSlogove() {
        return "imePrezime LIKE LOWER ('"+this.getImePrezime()+"%')";
    }

}
