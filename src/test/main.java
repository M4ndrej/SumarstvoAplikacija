/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import view.PrijavaForma;

/**
 *
 * @author Andrej
 */
public class main {

    public static void main(String[] args) {

        AppStyles.setLookAndFeel();

        SwingUtilities.invokeLater(() -> {
            new PrijavaForma().setVisible(true); // Pokretanje tvoje forme
        });

    }

}
