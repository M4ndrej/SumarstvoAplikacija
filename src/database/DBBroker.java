/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.OpstiDomenskiObjekat;
import java.sql.ResultSet;
import model.Kupac;
import model.Lokalitet;
import model.Menadzer;
import model.Otpremac;
import model.Otpremnica;
import model.Proizvod;
import model.StavkaOtpremnice;

/**
 *
 * @author Andrej
 */
public class DBBroker {

    private Konekcija konekcija = Konekcija.getInstance();
    private Statement statement;

    public List<OpstiDomenskiObjekat> read(OpstiDomenskiObjekat odo) {
        try {
            List<OpstiDomenskiObjekat> lista = new ArrayList<>();
            statement = konekcija.getConnection().createStatement();
            String upit = "SELECT * FROM " + odo.vratiImeKlase();
            ResultSet rs = statement.executeQuery(upit);
            while (rs.next()) {
                OpstiDomenskiObjekat noviObjekat;
                try {
                    noviObjekat = odo.getClass().getDeclaredConstructor().newInstance();
                    if (noviObjekat.napuni(rs)) {
                        lista.add(noviObjekat);
                    }
                } catch (Exception ex) {
                    Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);

                }
            }
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public boolean readOtpremacWithLokalitet(List<Otpremac> lista) {
        try {
            String upit = "SELECT * FROM otpremac o JOIN lokalitet l ON o.lokalitet = l.id";
            statement = konekcija.getConnection().createStatement();
            ResultSet rs = statement.executeQuery(upit);
            while (rs.next()) {
                Lokalitet lokalitet = new Lokalitet();
                lokalitet.napuni(rs);
                Otpremac otpremac = new Otpremac();
                otpremac.napuni(rs);
                otpremac.setLokalitet(lokalitet);
                lista.add(otpremac);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;

    }

    public boolean readOtpremnicaWithMenadzerOtpremacKupac(List<Otpremnica> lista) {
        try {
            String upit = "SELECT * FROM otpremnica otp JOIN menadzer m ON otp.menadzer = m.jmbgMenadzer "
                    + "JOIN otpremac o ON otp.otpremac = o.jmbgOtpremac "
                    + "JOIN kupac k ON otp.kupac = k.id";
            statement = konekcija.getConnection().createStatement();
            ResultSet rs = statement.executeQuery(upit);
            while (rs.next()) {
                Menadzer menadzer = new Menadzer();
                menadzer.napuni(rs);
                Otpremac otpremac = new Otpremac();
                otpremac.napuni(rs);
                Kupac kupac = new Kupac();
                kupac.napuni(rs);
                Otpremnica otpremnica = new Otpremnica();
                otpremnica.napuni(rs);
                otpremnica.setMenadzer(menadzer);
                otpremnica.setOtpremac(otpremac);
                otpremnica.setKupac(kupac);
                lista.add(otpremnica);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    public boolean readStavkeOtpremniceForOtpremnica(List<StavkaOtpremnice> lista, Otpremnica otpremnica) {
        try {
            String upit = "SELECT * FROM  otpremnica o JOIN stavka_otpremnice s ON s.otpremnica = o.brojOtpremnice "
                    + "JOIN proizvod p ON s.proizvod = p.id WHERE o.brojOtpremnice = " + otpremnica.getBrojOtpremnice();
            statement = konekcija.getConnection().createStatement();
            ResultSet rs = statement.executeQuery(upit);
            while (rs.next()) {
                Proizvod proizvod = new Proizvod();
                proizvod.napuni(rs);
                StavkaOtpremnice stavka = new StavkaOtpremnice();
                stavka.napuni(rs);
                stavka.setProizvod(proizvod);
                stavka.setOtpremnica(otpremnica);
                lista.add(stavka);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    public boolean create(OpstiDomenskiObjekat odo) {
        int affectedRows = 0;
        try {
            String upit = "INSERT INTO " + odo.vratiImeKlase() + " " + odo.vratiNaziveKolona() + " VALUES " + odo.vratiVrednostiKolona();
            statement = konekcija.getConnection().createStatement();
            affectedRows = statement.executeUpdate(upit);
            konekcija.getConnection().commit();
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return (affectedRows > 0);
    }
}
