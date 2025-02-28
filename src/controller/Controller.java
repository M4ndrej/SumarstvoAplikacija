/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import database.DBBroker;
import java.util.ArrayList;
import java.util.List;
import model.Kupac;
import model.Lokalitet;
import model.Menadzer;
import model.MenadzerPrivilegija;
import model.OpstiDomenskiObjekat;
import model.Otpremac;
import model.Otpremnica;
import model.Privilegija;
import model.Proizvod;
import model.StavkaOtpremnice;
import test.Statistika;

/**
 *
 * @author Andrej
 */public class Controller {

    private static Controller instance;
    private List<Menadzer> menadzeri = new ArrayList<>();
    private Menadzer ulogovani;
    private DBBroker dbb = new DBBroker();
    private Privilegija privilegija;

    private Controller() {

    }

    public Privilegija getPrivilegija() {
        return privilegija;
    }

    public Menadzer getUlovovani() {
        return ulogovani;
    }

    public void setUlogovani(Menadzer ulogovani) {
        this.ulogovani = ulogovani;
    }

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

    public boolean kreirajOtpremnicu(Otpremnica otpremnica, List<StavkaOtpremnice> listaStavki) {
        if(dbb.create(otpremnica)){
            for (StavkaOtpremnice stavkaOtpremnice : listaStavki) {
                stavkaOtpremnice.setOtpremnica(otpremnica);
                boolean uspesno = Controller.getInstance().kreirajStavkuOtpremnice(stavkaOtpremnice);
                if(!uspesno){
                    return false;
                }
            }
        }
        return true;
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
        if (listaOdo == null) {
            return false;
        }
        for (OpstiDomenskiObjekat o : listaOdo) {
            lista.add((Menadzer) o);
        }
        return true;
    }

    public boolean vratiListuSviOtpremac(Otpremac otpremac, List<Otpremac> lista) {
        return dbb.readWithConditionOtpremacLokalitet(otpremac, lista);
    }

    public boolean vratiListuSviProizvod(Proizvod proizvod, List<Proizvod> lista) {
        List<OpstiDomenskiObjekat> listaOdo = dbb.readWithCondition(proizvod);
        if (listaOdo == null) {
            return false;
        }
        for (OpstiDomenskiObjekat o : listaOdo) {
            lista.add((Proizvod) o);
        }
        return true;
    }

    public boolean vratiListuSviOtpremnica(Otpremnica otpremnica, List<Otpremnica> lista) {
        return dbb.readWithConditionOtpremnicaKupacOtpremac(otpremnica, lista);
    }

    public boolean prijaviMenadzer(String jmbg, String lozinka) {
        List<OpstiDomenskiObjekat> listaOdo = dbb.read(new Menadzer());
        if (listaOdo == null) {
            menadzeri = null;
        }
        for (OpstiDomenskiObjekat o : listaOdo) {
            menadzeri.add((Menadzer) o);
        }

        for (Menadzer m : menadzeri) {
            if (m.getJmbg().equals(jmbg) && m.getLozinka().equals(lozinka)) {
                ulogovani = m;
                postaviPrivilegiju();
                return true;
            }
        }
        return false;
    }

    public boolean kreirajMenadzer(Menadzer menadzer) {
        return dbb.create(menadzer);
    }

    public boolean vratiListuDoznakaOtprema(List<Object[]> podaci) {
        return dbb.readWithConditionDoznakaOtprema(podaci);
    }

    public boolean analiziraj(StavkaOtpremnice so, String prosekUkupno, String cenaKolicina, List<Object[]> lista) {
        Statistika statistika = new Statistika();
        return statistika.analize(so, prosekUkupno, cenaKolicina, lista);
    }

    public boolean vratiListuPrivilegija(List<Privilegija> privilegije) {
        List<OpstiDomenskiObjekat> listaOdo = dbb.read(new Privilegija());
        if (listaOdo == null) {
            return false;
        }
        for (OpstiDomenskiObjekat o : listaOdo) {
            privilegije.add((Privilegija) o);
        }
        return true;
    }

    public boolean kreirajMenadzerPrivilegija(MenadzerPrivilegija mp) {
        return dbb.create(mp);
    }

    public boolean vratiListuMenadzerPrivilegija(List<MenadzerPrivilegija> listaMenadzerPrivilegija) {
        List<OpstiDomenskiObjekat> listaOdo = dbb.readMenadzerPrivilegijaWithPrivilegijaMenadzer(new MenadzerPrivilegija());
        if (listaOdo == null) {
            return false;
        }
        for (OpstiDomenskiObjekat o : listaOdo) {
            listaMenadzerPrivilegija.add((MenadzerPrivilegija) o);
        }
        return true;
    }

    private void postaviPrivilegiju() {
        List<MenadzerPrivilegija> listaMenadzerPrivilegija = new ArrayList<>();
        boolean uspesno = Controller.getInstance().vratiListuMenadzerPrivilegija(listaMenadzerPrivilegija);
        for (MenadzerPrivilegija mp : listaMenadzerPrivilegija) {
            if (mp.getMenadzer().equals(ulogovani)) {
                privilegija = mp.getPrivilegija();
                return;
            }
        }
    }

    public boolean obrisiStavkuOtpremnice(StavkaOtpremnice so) {
        return dbb.delete(so);
    }

    public boolean azurirajOtpremnicu(Otpremnica otpremnica) {
        return dbb.update(otpremnica);
    }
}
