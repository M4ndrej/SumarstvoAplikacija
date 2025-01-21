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
public class MenadzerPrivilegija {
    
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

    
    
    
}
