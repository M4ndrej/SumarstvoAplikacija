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
import model.enumeracija.Klasa;
import model.enumeracija.MernaJedinica;
import model.enumeracija.Tip;
import model.enumeracija.Vrsta;

/**
 *
 * @author Andrej
 */
public class Proizvod implements OpstiDomenskiObjekat {

    private int id;
    private Tip tip;
    private Vrsta vrsta;
    private Klasa klasa;
    private String opis;
    private double cena;
    private MernaJedinica mernaJedinica;

    public Proizvod() {
    }

    public Proizvod(int id, Tip tip, Vrsta vrsta, Klasa klasa, String opis, double cena, MernaJedinica mernaJedinica) {
        this.id = id;
        this.tip = tip;
        this.vrsta = vrsta;
        this.klasa = klasa;
        this.opis = opis;
        this.cena = cena;
        this.mernaJedinica = mernaJedinica;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Tip getTip() {
        return tip;
    }

    public void setTip(Tip tip) {
        this.tip = tip;
    }

    public Vrsta getVrsta() {
        return vrsta;
    }

    public void setVrsta(Vrsta vrsta) {
        this.vrsta = vrsta;
    }

    public Klasa getKlasa() {
        return klasa;
    }

    public void setKlasa(Klasa klasa) {
        this.klasa = klasa;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public MernaJedinica getMernaJedinica() {
        return mernaJedinica;
    }

    public void setMernaJedinica(MernaJedinica mernaJedinica) {
        this.mernaJedinica = mernaJedinica;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + this.id;
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
        final Proizvod other = (Proizvod) obj;
        return this.id == other.id;
    }

    @Override
    public String toString() {
        return tip.toString() + " " + vrsta.toString() + " " + klasa.toString() + " " + mernaJedinica.toString() + " x " + cena + "€";
    }

    @Override
    public String vratiImeKlase() {
        return "proizvod";
    }

    @Override
    public boolean napuni(ResultSet rs) {
        try {
            this.id = rs.getInt("id");
            this.tip = Tip.valueOf(rs.getString("tip"));
            this.vrsta = Vrsta.valueOf(rs.getString("vrsta"));
            this.klasa = Klasa.valueOf(rs.getString("klasa"));
            this.cena = rs.getDouble("cena");
            this.mernaJedinica = MernaJedinica.valueOf(rs.getString("mernaJedinica"));
            this.opis = rs.getString("opis");
        } catch (SQLException ex) {
            Logger.getLogger(Proizvod.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    @Override
    public String vratiNaziveKolona() {
        return "(id,tip,vrsta,klasa,cena,mernaJedinica,opis)";
    }

    @Override
    public String vratiVrednostiKolona() {
        return "(" + this.id + ",'" + this.tip.toString() + "','" + this.vrsta.toString() + "','" + this.klasa.toString() + "'," + this.cena + ",'" + this.mernaJedinica + "','" + this.opis + "')";
    }

    @Override
    public String vratiUslovNadjiSlog() {
        return "id=" + this.getId();
    }

    private double cenaOd = -1;
    private double cenaDo = -1;

    public void filterCena(double cenaOd, double cenaDo) {
        this.cenaOd = cenaOd;
        this.cenaDo = cenaDo;
    }

    @Override
    public String vratiUslovNadjiSlogove() {
        StringBuilder sb = new StringBuilder();
        sb.append("");
        boolean prev = false;
        if (this.tip != null) {
            sb.append("tip LIKE LOWER ('" + this.tip.toString().toLowerCase() + "') ");
            prev = true;
        }
        if (this.vrsta != null) {
            if (prev == true) {
                sb.append(" AND ");
            }
            sb.append("vrsta LIKE LOWER ('" + this.vrsta.toString().toLowerCase() + "') ");
            prev = true;
        }
        if (this.klasa != null) {
            if (prev == true) {
                sb.append(" AND ");
            }
            sb.append("klasa LIKE LOWER ('" + this.klasa.toString().toLowerCase() + "') ");
            prev = true;
        }
        if (cenaOd > -1) {
            if (prev == true) {
                sb.append(" AND ");
            }
            sb.append("cena > " + this.cenaOd);
            prev = true;
        }
        if (cenaDo > -1) {
            if (prev == true) {
                sb.append(" AND ");
            }
            sb.append("cena < " + this.cenaDo);
            prev = true;
        }
        
        return sb.toString();
    }

}
