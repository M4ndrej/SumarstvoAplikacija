/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Andrej
 */
public class Otpremnica implements OpstiDomenskiObjekat{
    
    private Kupac kupac;
    private Menadzer menadzer;
    private Otpremac otpremac;
    private int brojOtpremnice;
    private java.util.Date datumOtpremnice;
    private boolean zavrsena;

    public Otpremnica() {
    }

    public Otpremnica(Kupac kupac, Menadzer menadzer, Otpremac otpremac, int brojOtpremnice, Date datumOtpremnice, boolean zavrsena) {
        this.kupac = kupac;
        this.menadzer = menadzer;
        this.otpremac = otpremac;
        this.brojOtpremnice = brojOtpremnice;
        this.datumOtpremnice = datumOtpremnice;
        this.zavrsena = zavrsena;
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

    public boolean isZavrsena() {
        return zavrsena;
    }

    public void setZavrsena(boolean zavrsena) {
        this.zavrsena = zavrsena;
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

    @Override
    public String vratiImeKlase() {
        return "otpremnica";
    }

    @Override
    public boolean napuni(ResultSet rs) {
        try {
            this.brojOtpremnice = rs.getInt("brojOtpremnice");
            this.datumOtpremnice = rs.getDate("datumOtpremnice");
            this.zavrsena = rs.getBoolean("zavrsena");
        } catch (SQLException ex) {
            Logger.getLogger(Otpremnica.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    @Override
    public String vratiNaziveKolona() {
        return "(brojOtpremnice,menadzer,otpremac,datumOtpremnice,kupac,zavrsena)";
    }

    @Override
    public String vratiVrednostiKolona() {
        java.sql.Date datum = new java.sql.Date(this.getDatumOtpremnice().getTime());
        return "("+this.brojOtpremnice+",'"+this.menadzer.getJmbg()+"','"+this.otpremac.getJmbg()+"','"+datum+"',"+this.kupac.getId()+","+this.zavrsena+")";
    }

    @Override
    public String vratiUslovNadjiSlog() {
        return "brojOtpremnice="+this.getBrojOtpremnice();
    }

    @Override
    public String vratiUslovNadjiSlogove() {
        StringBuilder sb = new StringBuilder();
        sb.append("");
        boolean prev = false;
        if(this.brojOtpremnice > -1){
            sb.append("brojOtpremnice = "+this.brojOtpremnice);
            prev = true;
        }
        if(!this.kupac.getNaziv().isEmpty()){
            if(prev){
                sb.append(" AND ");
            }
            sb.append(" naziv LIKE LOWER ('"+this.kupac.getNaziv().toLowerCase()+"%') ");
            prev = true;
        }
        if(this.otpremac != null){
            if(prev){
                sb.append(" AND ");
            }
            sb.append(" otpremac LIKE ('"+this.otpremac.getJmbg()+"')");
        }
        return sb.toString();
    }
}
