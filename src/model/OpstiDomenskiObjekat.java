/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package model;

import java.sql.ResultSet;
/**
 *
 * @author Andrej
 */
public interface OpstiDomenskiObjekat {
    
    public String vratiImeKlase();
    public boolean napuni(ResultSet rs);
    public String vratiNaziveKolona();
    public String vratiVrednostiKolona();
    public String vratiUslovNadjiSlog();
    public String vratiUslovNadjiSlogove();
}
