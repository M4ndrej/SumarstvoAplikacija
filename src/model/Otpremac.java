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
public class Otpremac implements OpstiDomenskiObjekat{
    
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
        return imePrezime +" / "+ lokalitet;
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

    @Override
    public String vratiImeKlase() {
        return "otpremac";
    }

    @Override
    public boolean napuni(ResultSet rs) {
        try {
            this.jmbg = rs.getString("jmbgOtpremac");
            this.imePrezime = rs.getString("imePrezime");
        } catch (SQLException ex) {
            Logger.getLogger(Otpremac.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    @Override
    public String vratiNaziveKolona() {
        return "(jmbgOtpremac,imePrezime,lokalitet)";
    }

    @Override
    public String vratiVrednostiKolona() {
        return "('"+this.jmbg+"','"+this.imePrezime+"',"+this.lokalitet.getId()+")";
    }

    @Override
    public String vratiUslovNadjiSlog() {
        return "jmbgOtpremac="+this.getJmbg();
    }

    @Override
    public String vratiUslovNadjiSlogove() {
        if(this.imePrezime.isEmpty() && this.lokalitet != null){
            return "lokalitet = "+this.lokalitet.getId();
        }else if(!this.imePrezime.isEmpty() && this.lokalitet == null){
            return "imePrezime LIKE LOWER('"+this.getImePrezime().toLowerCase()+"')";
        }else{
            return "lokalitet = "+this.lokalitet.getId()+" AND "+ "imePrezime LIKE LOWER('"+this.getImePrezime().toLowerCase()+"')";
        }
    }
}
