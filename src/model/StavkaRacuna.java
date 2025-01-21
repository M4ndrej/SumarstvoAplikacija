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
public class StavkaRacuna {
    
    private Otpremnica otpremnica;
    private Racun sifraRacuna;
    private int rb;
    private double kolicina;
    private double prosecnaCena;
    private double ukupnaCena;
    private TipDrveta tipDrveta;

    public StavkaRacuna() {
    }

    public StavkaRacuna(Otpremnica otpremnica, Racun sifraRacuna, int rb, double kolicina, double prosecnaCena, double ukupnaCena, TipDrveta tipDrveta) {
        this.otpremnica = otpremnica;
        this.sifraRacuna = sifraRacuna;
        this.rb = rb;
        this.kolicina = kolicina;
        this.prosecnaCena = prosecnaCena;
        this.ukupnaCena = ukupnaCena;
        this.tipDrveta = tipDrveta;
    }

    public Otpremnica getOtpremnica() {
        return otpremnica;
    }

    public void setOtpremnica(Otpremnica otpremnica) {
        this.otpremnica = otpremnica;
    }

    public Racun getSifraRacuna() {
        return sifraRacuna;
    }

    public void setSifraRacuna(Racun sifraRacuna) {
        this.sifraRacuna = sifraRacuna;
    }

    public int getRb() {
        return rb;
    }

    public void setRb(int rb) {
        this.rb = rb;
    }

    public double getKolicina() {
        return kolicina;
    }

    public void setKolicina(double kolicina) {
        this.kolicina = kolicina;
    }

    public double getProsecnaCena() {
        return prosecnaCena;
    }

    public void setProsecnaCena(double prosecnaCena) {
        this.prosecnaCena = prosecnaCena;
    }

    public double getUkupnaCena() {
        return ukupnaCena;
    }

    public void setUkupnaCena(double ukupnaCena) {
        this.ukupnaCena = ukupnaCena;
    }

    public TipDrveta getTipDrveta() {
        return tipDrveta;
    }

    public void setTipDrveta(TipDrveta tipDrveta) {
        this.tipDrveta = tipDrveta;
    }

    @Override
    public String toString() {
        return "StavkaRacuna: " + rb;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.otpremnica);
        hash = 89 * hash + Objects.hashCode(this.sifraRacuna);
        hash = 89 * hash + this.rb;
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
        final StavkaRacuna other = (StavkaRacuna) obj;
        if (this.rb != other.rb) {
            return false;
        }
        if (!Objects.equals(this.otpremnica, other.otpremnica)) {
            return false;
        }
        return Objects.equals(this.sifraRacuna, other.sifraRacuna);
    }
    
    
    
}
