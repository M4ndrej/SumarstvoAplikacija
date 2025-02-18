/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import database.DBBroker;
import java.util.List;
import model.Kupac;
import model.Lokalitet;
import model.Menadzer;
import model.OpstiDomenskiObjekat;
import model.Otpremac;
import model.Otpremnica;
import model.Proizvod;
import model.StavkaOtpremnice;

/**
 *
 * @author Andrej
 */
public class Controller {

    private static Controller instance;
    private DBBroker dbb = new DBBroker();

    public static Controller getInstance() {
        if (instance == null) {
            instance = new Controller();
        }
        return instance;
    }

    public boolean vratiListuKupac(List<Kupac> lista) {

        List<OpstiDomenskiObjekat> listaOdo = dbb.read(new Kupac());
        if (listaOdo == null) {
            return false;
        }
        for (OpstiDomenskiObjekat o : listaOdo) {
            lista.add((Kupac) o);
        }
        return true;
    }

    public boolean vratiListuLokalitet(List<Lokalitet> lista) {
        List<OpstiDomenskiObjekat> listaOdo = dbb.read(new Lokalitet());
        if (listaOdo == null) {
            return false;
        }
        for (OpstiDomenskiObjekat o : listaOdo) {
            lista.add((Lokalitet) o);
        }
        return true;
    }

    public boolean vratiListuZaposlenih(List<Menadzer> lista) {
        List<OpstiDomenskiObjekat> listaOdo = dbb.read(new Menadzer());
        if (listaOdo == null) {
            return false;
        }
        for (OpstiDomenskiObjekat o : listaOdo) {
            lista.add((Menadzer) o);
        }
        return true;
    }

    public boolean vratiListuOtpremaca(List<Otpremac> lista) {
        return dbb.readOtpremacWithLokalitet(lista);
    }

    public boolean vratiListuOtpremnica(List<Otpremnica> lista) {
        return dbb.readOtpremnicaWithMenadzerOtpremacKupac(lista);
    }

    public boolean vratiListuProizvoda(List<Proizvod> lista) {
        List<OpstiDomenskiObjekat> listaOdo = dbb.read(new Proizvod());
        if (listaOdo == null) {
            return false;
        }
        for (OpstiDomenskiObjekat o : listaOdo) {
            lista.add((Proizvod) o);
        }
        return true;
    }

    public boolean vratiListuStavkiOtpremnica(List<StavkaOtpremnice> lista, Otpremnica otpremnica) {
        return dbb.readStavkeOtpremniceForOtpremnica(lista, otpremnica);
    }

}
