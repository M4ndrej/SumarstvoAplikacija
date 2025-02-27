package test;

import javax.swing.SwingUtilities;
import view.PrijavaForma;

/**
 *
 * @author Andrej
 */
public class main {

    public static void main(String[] args) {

        AppStyles.setLookAndFeel();

        SwingUtilities.invokeLater(() -> {
            new PrijavaForma().setVisible(true);
        });

    }

}
