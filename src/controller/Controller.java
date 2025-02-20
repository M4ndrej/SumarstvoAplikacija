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

    public boolean kreirajKupac(Kupac kupac) {
        return dbb.create(kupac);
    }

    public boolean kreirajLokalitet(Lokalitet lokalitet) {
        return dbb.create(lokalitet);
    }

    public boolean kreirajOtpremac(Otpremac otpremac) {
        return dbb.create(otpremac);
    }

    public boolean kreirajProizvod(Proizvod proizvod) {
        return dbb.create(proizvod);
    }

    public boolean kreirajOtpremnicu(Otpremnica otpremnica) {
        return dbb.create(otpremnica);
    }

    public boolean kreirajStavkuOtpremnice(StavkaOtpremnice stavkaOtpremnice) {
        return dbb.create(stavkaOtpremnice);
    }

    public boolean izmeniKupca(Kupac kupac) {
        return dbb.update(kupac);
    }

    public boolean izmeniLokalitet(Lokalitet lokalitet) {
        return dbb.update(lokalitet);
    }

    public boolean izmeniMenadzera(Menadzer menadzer) {
        return dbb.update(menadzer);
    }

    public boolean izmeniProizvod(Proizvod proizvod) {
        return dbb.update(proizvod);
    }

    public boolean izmeniOtpremaca(Otpremac otpremac) {
        return dbb.update(otpremac);
    }

    public boolean obrisiKupca(Kupac kupac) {
        return dbb.delete(kupac);
    }

    public boolean obrisiLokalitet(Lokalitet lokalitet) {
        return dbb.delete(lokalitet);
    }

    public boolean obrisiOtpremaca(Otpremac otpremac) {
        return dbb.delete(otpremac);
    }

    public boolean orbisiProizvod(Proizvod proizvod) {
        return dbb.delete(proizvod);
    }

    public boolean vratiListuSviKupac(Kupac kupac, List<Kupac> lista) {
        List<OpstiDomenskiObjekat> listaOdo = dbb.readWithCondition(kupac);
        if (listaOdo == null) {
            return false;
        }
        for (OpstiDomenskiObjekat o : listaOdo) {
            lista.add((Kupac) o);
        }
        return true;
    }

    public boolean vratiListuSviLokalitet(Lokalitet lokalitet, List<Lokalitet> lista) {
        List<OpstiDomenskiObjekat> listaOdo = dbb.readWithCondition(lokalitet);
        if (listaOdo == null) {
            return false;
        }
        for (OpstiDomenskiObjekat o : listaOdo) {
            lista.add((Lokalitet) o);
        }
        return true;
    }

    public boolean vratiListuSviMenadzer(Menadzer menadzer, List<Menadzer> lista) {
        List<OpstiDomenskiObjekat> listaOdo = dbb.readWithCondition(menadzer);
        if(listaOdo == null){
            return false;
        }
        for (OpstiDomenskiObjekat o : listaOdo) {
            lista.add((Menadzer) o);
        }
        return true;
    }

    public boolean vratiListuSviOtpremac(Otpremac otpremac, List<Otpremac> lista) {
        List<OpstiDomenskiObjekat> listaOdo = dbb.readWithCondition(otpremac);
        if (listaOdo == null) {
            return false;
        }
        for (OpstiDomenskiObjekat o : listaOdo) {
            lista.add((Otpremac) o);
        }
        return true;
    }

}
