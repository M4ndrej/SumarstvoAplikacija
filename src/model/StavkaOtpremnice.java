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
public class StavkaOtpremnice implements OpstiDomenskiObjekat{
    
    private Otpremnica otpremnica;
    private int redniBroj;
    private Proizvod proizvod;
    private double kolicina;
    private double ukupnaCena;

    public StavkaOtpremnice() {
    }

    public StavkaOtpremnice(Otpremnica otpremnica, int redniBroj, Proizvod proizvod, double kolicina, double ukupnaCena) {
        this.otpremnica = otpremnica;
        this.redniBroj = redniBroj;
        this.proizvod = proizvod;
        this.kolicina = kolicina;
        this.ukupnaCena = ukupnaCena;
    }

    public Otpremnica getOtpremnica() {
        return otpremnica;
    }

    public void setOtpremnica(Otpremnica otpremnica) {
        this.otpremnica = otpremnica;
    }

    public int getRedniBroj() {
        return redniBroj;
    }

    public void setRedniBroj(int redniBroj) {
        this.redniBroj = redniBroj;
    }

    public Proizvod getProizvod() {
        return proizvod;
    }

    public void setProizvod(Proizvod proizvod) {
        this.proizvod = proizvod;
    }

    public double getKolicina() {
        return kolicina;
    }

    public void setKolicina(double kolicina) {
        this.kolicina = kolicina;
    }

    public double getUkupnaCena() {
        return ukupnaCena;
    }

    public void setUkupnaCena(double ukupnaCena) {
        this.ukupnaCena = ukupnaCena;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.otpremnica);
        hash = 29 * hash + this.redniBroj;
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
        final StavkaOtpremnice other = (StavkaOtpremnice) obj;
        if (this.redniBroj != other.redniBroj) {
            return false;
        }
        return Objects.equals(this.otpremnica, other.otpremnica);
    }

    @Override
    public String vratiImeKlase() {
        return "stavka_otpremnice";
    }

    @Override
    public boolean napuni(ResultSet rs) {
        try {
            this.redniBroj = rs.getInt("redniBroj");
            this.kolicina = rs.getDouble("kolicina");
            this.ukupnaCena = rs.getDouble("ukupnaCena");
        } catch (SQLException ex) {
            Logger.getLogger(StavkaOtpremnice.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    @Override
    public String vratiNaziveKolona() {
        return "(redniBroj,proizvod,otpremnica,kolicina,ukupnaCena)";
    }
    
    @Override
    public String vratiVrednostiKolona() {
        return "("+this.redniBroj+","+this.proizvod+","+this.otpremnica+","+this.kolicina+","+this.ukupnaCena+")";
    }
    
    
}
