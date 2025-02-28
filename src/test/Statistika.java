/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import database.DBBroker;
import database.Konekcija;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.StavkaOtpremnice;

/**
 *
 * @author Andrej
 */
public class Statistika {
    
    private Konekcija konekcija = Konekcija.getInstance();
    private Statement statement;
    
    public boolean analize(StavkaOtpremnice so, String prosekUkupno, String cenaKolicina, List<Object[]> lista) {
        try {
            statement = konekcija.getConnection().createStatement();
            StringBuilder select = new StringBuilder();
            StringBuilder where = new StringBuilder();
            StringBuilder groupBy = new StringBuilder();
            StringBuilder from = new StringBuilder();

            select.append("SELECT ");
            where.append(" WHERE ");
            groupBy.append(" GROUP BY ");
            from.append(" FROM stavka_otpremnice so JOIN otpremnica o ON o.brojOtpremnice = so.otpremnica JOIN otpremac otp ON o.otpremac = otp.jmbgOtpremac JOIN lokalitet l ON l.id = otp.lokalitet JOIN proizvod p ON p.id = so.proizvod ");

            boolean prev = false;
            //datumi
            
            if (so.getOtpremnica().getDatumOtpremnice() != null) {
                select.append(" MONTH(o.datumOtpremnice) ");
                groupBy.append(" MONTH(o.datumOtpremnice)");
                if (prev) {
                    where.append(" AND ");
                }
                where.append(" YEAR(o.datumOtpremnice) = " + (so.getOtpremnica().getDatumOtpremnice().getYear() + 1900));
                prev = true;

            } else {
                select.append(" YEAR(o.datumOtpremnice) ");
                groupBy.append(" YEAR(o.datumOtpremnice)");
            }
            //lokaliteti
            if(so.getOtpremnica().getOtpremac().getLokalitet() == null && prosekUkupno != "UDEO"){
                select.append(" ,jedinicaGazdinstva ");
                groupBy.append(" ,jedinicaGazdinstva ");
            }
            else{
                if (so.getOtpremnica().getOtpremac().getLokalitet() != null && so.getOtpremnica().getOtpremac().getLokalitet().getJedinicaGazdinstva() != null) {
                    if (prev) {
                        where.append(" AND ");
                    }
                    prev = true;
                    where.append(" jedinicaGazdinstva LIKE '" + so.getOtpremnica().getOtpremac().getLokalitet().getJedinicaGazdinstva().toString() + "'");
                }
                if (so.getOtpremnica().getOtpremac().getLokalitet() != null && so.getOtpremnica().getOtpremac().getLokalitet().getOdsekOdeljenje() != null) {
                    if (prev) {
                        where.append(" AND ");
                    }
                    prev = true;
                    where.append(" odsekOdeljenje LIKE '" + so.getOtpremnica().getOtpremac().getLokalitet().getOdsekOdeljenje().toString() + "'");
                }
            }
            //agregacija
            if (prosekUkupno == "PROSEK") {
                if (cenaKolicina == "CENA") {
                    select.append(", AVG(ukupnaCena) ");
                } else {
                    select.append(", AVG(kolicina) ");
                }
            } else if(prosekUkupno == "UKUPNO") {
                if (cenaKolicina == "CENA") {
                    select.append(", SUM(ukupnaCena) ");
                } else {
                    select.append(", SUM(kolicina) ");
                }
            }else{
                if (cenaKolicina == "CENA") {
                    select.append(",(SUM(so.ukupnaCena) / (SELECT SUM(ukupnaCena) FROM stavka_otpremnice)) * 100");
                } else {
                    select.append(",(SUM(so.kolicina) / (SELECT SUM(kolicina) FROM stavka_otpremnice)) * 100");
                }
            }
            //
            if (so.getProizvod().getTip() != null) {
                if (prev) {
                    where.append(" AND ");
                }
                prev = true;
                where.append(" tip LIKE '" + so.getProizvod().getTip().toString() + "'");
            }
            if (so.getProizvod().getVrsta() != null) {
                if (prev) {
                    where.append(" AND ");
                }
                prev = true;
                where.append(" vrsta LIKE '" + so.getProizvod().getVrsta().toString() + "'");
            }
            if (so.getProizvod().getKlasa() != null) {
                if (prev) {
                    where.append(" AND ");
                }
                prev = true;
                where.append(" klasa LIKE '" + so.getProizvod().getKlasa().toString() + "'");
            }

            String upit = select.toString() + from.toString() + where.toString() + groupBy.toString();
            System.out.println(upit);

            ResultSet rs = statement.executeQuery(upit);
            if (!rs.isBeforeFirst()) {
                return false;
            }
            while (rs.next()) {

                
                if (rs.getMetaData().getColumnCount() == 3) {
                    int vreme = rs.getInt(1);
                    String mesto = rs.getString(2);
                    double vrednost = rs.getDouble(3);
                    lista.add(new Object[]{vreme, mesto, vrednost});
                    System.out.println("tri");

                } else {
                    int vreme = rs.getInt(1);
                    double vrednost = rs.getDouble(2);
                    lista.add(new Object[]{vreme, vrednost});
                    System.out.println("dve");
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }
    
}
