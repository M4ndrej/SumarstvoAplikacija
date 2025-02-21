/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import com.formdev.flatlaf.FlatLaf;
import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.io.InputStream;
import javax.swing.BorderFactory;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
/**
 *
 * @author Andrej
 */
public class AppStyles {

    public static void setLookAndFeel() {
        try {
            // Postavljanje FlatLaf teme (svetla tema)
            UIManager.setLookAndFeel(new com.formdev.flatlaf.FlatLightLaf());

            // Postavljanje globalnih stilova
            setButtonStyle();
            setTextFieldStyle();
            setComboBoxStyle();
            setTableStyle();
            setModernFont();
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
    }
    
 

    // Metoda za postavljanje modernog fonta
    public static void setModernFont() {
        // Postavljanje fonta za sve komponente
        UIManager.put("defaultFont", new Font("Roboto", Font.PLAIN, 12));
        UIManager.put("Button.font", new Font("Roboto", Font.BOLD, 12));
        UIManager.put("Label.font", new Font("Roboto", Font.PLAIN, 12));
        UIManager.put("TextField.font", new Font("Roboto", Font.PLAIN, 12));
        UIManager.put("TextArea.font", new Font("Roboto", Font.PLAIN, 12));
    }

    // Stil za dugmadi (savetuje se svetlo zelena sa odsjajem)
    private static void setButtonStyle() {
        
        UIManager.put("Button.font", new Font("Arial",Font.PLAIN, 14));
        UIManager.put("Button.arc", 15);  // Za zaobljene ivi Font.BOLDce
        UIManager.put("Button.shadow", new Color(50, 50, 50, 50));  // Odsjaj
        UIManager.put("Button.select", new Color(135, 206, 250));
        UIManager.put("Button.rollover", true);
    }

    // Stil za tekstualna polja (blage prozirne boje)
    private static void setTextFieldStyle() {
        UIManager.put("TextField.background", new Color(255, 255, 255, 200));  // Prozirna pozadina
        UIManager.put("TextField.foreground", Color.BLACK);  // Tekst boja
        UIManager.put("TextField.font", new Font("Arial", Font.PLAIN, 14));
        UIManager.put("TextField.border", BorderFactory.createLineBorder(new Color(200, 200, 200)));  // Ivica
        
    }

    // Stil za ComboBox (blaga prozirnost)
    private static void setComboBoxStyle() {
        UIManager.put("ComboBox.background", new Color(240, 255, 240, 200));  // Prozirna pozadina
        UIManager.put("ComboBox.foreground", Color.BLACK);  // Tekst boja
        UIManager.put("ComboBox.font", new Font("Arial", Font.PLAIN, 14));
        UIManager.put("ComboBox.border", BorderFactory.createLineBorder(new Color(200, 200, 200)));
    }

    // Stil za JTable (tabele)
    private static void setTableStyle() {
        UIManager.put("Table.background", new Color(255, 255, 255));  // Pozadina tabele
        UIManager.put("Table.gridColor", new Color(200, 200, 200));  // Boja mreže između ćelija
        UIManager.put("Table.font", new Font("Arial", Font.PLAIN, 12));
        UIManager.put("Table.selectionBackground", new Color(144, 238, 144));  // Selektovana ćelija pozadina
        UIManager.put("Table.selectionForeground", Color.BLACK);  // Selektovana ćelija tekst boja
    }
}
