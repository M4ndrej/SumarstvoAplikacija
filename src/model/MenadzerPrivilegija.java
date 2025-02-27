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
public class MenadzerPrivilegija implements OpstiDomenskiObjekat{
    
    private Menadzer menadzer;
    private Privilegija privilegija;
    private java.util.Date datumSticanja;

    public MenadzerPrivilegija() {
    }

    public MenadzerPrivilegija(Menadzer menadzer, Privilegija privilegija, Date datumSticanja) {
        this.menadzer = menadzer;
        this.privilegija = privilegija;
        this.datumSticanja = datumSticanja;
    }

    public Menadzer getMenadzer() {
        return menadzer;
    }

    public void setMenadzer(Menadzer menadzer) {
        this.menadzer = menadzer;
    }

    public Privilegija getPrivilegija() {
        return privilegija;
    }

    public void setPrivilegija(Privilegija privilegija) {
        this.privilegija = privilegija;
    }

    public Date getDatumSticanja() {
        return datumSticanja;
    }

    public void setDatumSticanja(Date datumSticanja) {
        this.datumSticanja = datumSticanja;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.menadzer);
        hash = 59 * hash + Objects.hashCode(this.privilegija);
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
        final MenadzerPrivilegija other = (MenadzerPrivilegija) obj;
        if (!Objects.equals(this.menadzer, other.menadzer)) {
            return false;
        }
        return Objects.equals(this.privilegija, other.privilegija);
    }

    @Override
    public String vratiImeKlase() {
        return "menadzer_privilegija";
    }

    @Override
    public boolean napuni(ResultSet rs) {
        try {
            this.datumSticanja = rs.getDate("datumSticanja");
        } catch (SQLException ex) {
            Logger.getLogger(MenadzerPrivilegija.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    @Override
    public String vratiNaziveKolona() {
        return "(menadzer,privilegija,datumSticanja)";
    }

    @Override
    public String vratiVrednostiKolona() {
        java.sql.Date datum = new java.sql.Date(this.datumSticanja.getTime());
        return "('"+this.menadzer.getJmbg()+"',"+this.privilegija.getId()+","+"'"+datum+"')";
    }

    @Override
    public String vratiUslovNadjiSlog() {
        return "menadzer="+"'"+this.menadzer.getJmbg()+"' AND privilegija="+this.privilegija.getId();
    }

    @Override
    public String vratiUslovNadjiSlogove() {
        return null;
    }

    
    
    
}
