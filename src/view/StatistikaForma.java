/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.Controller;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Lokalitet;
import model.Otpremac;
import model.Otpremnica;
import model.Proizvod;
import model.StavkaOtpremnice;
import model.enumeracija.JedinicaGazdinstva;
import model.enumeracija.Klasa;
import model.enumeracija.Tip;
import model.enumeracija.Vrsta;
import tabela_model.StatistikaModelTabele;
import view.dialog.StatistikaDialog;

/**
 *
 * @author Andrej
 */
public class StatistikaForma extends javax.swing.JFrame {

    /**
     *
     * Creates new form StatistikaForma
     */
    public StatistikaForma() {
        initComponents();
        setTitle("Statistika");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
        inicijalizacija();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableStatistika = new javax.swing.JTable();
        jComboBoxTip = new javax.swing.JComboBox<>();
        jComboBoxVrsta = new javax.swing.JComboBox<>();
        jButtonAnaliziraj = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxKlasa = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jComboBoxGazdinskaJedinica = new javax.swing.JComboBox<>();
        jComboBoxOdsekOdeljenje = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldGodina = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxKriterijum1 = new javax.swing.JComboBox<>();
        jComboBoxKriterijum2 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTableStatistika.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableStatistika);

        jButtonAnaliziraj.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonAnaliziraj.setText("Analiziraj");
        jButtonAnaliziraj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnalizirajActionPerformed(evt);
            }
        });

        jLabel3.setText("Tip");

        jLabel4.setText("Vrsta");

        jLabel5.setText("Klasa");

        jLabel7.setText("Odsek i odeljenje");

        jLabel9.setText("Gazdinska jedinica");

        jTextFieldGodina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldGodinaActionPerformed(evt);
            }
        });

        jLabel8.setText("Unesite godinu");

        jLabel1.setText("Izračunaj");

        jComboBoxKriterijum1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PROSEK", "UKUPNO", "UDEO" }));
        jComboBoxKriterijum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxKriterijum1ActionPerformed(evt);
            }
        });

        jComboBoxKriterijum2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CENA", "KOLIČINA" }));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonAnaliziraj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBoxKlasa, 0, 117, Short.MAX_VALUE)
                                    .addComponent(jComboBoxVrsta, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBoxTip, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBoxKriterijum1, 0, 117, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBoxOdsekOdeljenje, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBoxGazdinskaJedinica, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldGodina, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jComboBoxKriterijum2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxTip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxVrsta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jComboBoxKlasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jTextFieldGodina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxGazdinskaJedinica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxOdsekOdeljenje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBoxKriterijum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxKriterijum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addComponent(jButtonAnaliziraj)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldGodinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldGodinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldGodinaActionPerformed

    private void jButtonAnalizirajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnalizirajActionPerformed
        if (jComboBoxTip.getSelectedItem() == null && jComboBoxVrsta.getSelectedItem() == null && jComboBoxKlasa.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Izaberite kriterijum analize", "Greška", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Tip tip = (Tip) jComboBoxTip.getSelectedItem();
        Vrsta vrsta = (Vrsta) jComboBoxVrsta.getSelectedItem();
        Klasa klasa = (Klasa) jComboBoxKlasa.getSelectedItem();
        JedinicaGazdinstva jedinicaGazdinstva = (JedinicaGazdinstva) jComboBoxGazdinskaJedinica.getSelectedItem();
        String odsekOdeljenje = (String) jComboBoxOdsekOdeljenje.getSelectedItem();
        String godina = jTextFieldGodina.getText();
        String datumString = null;
        java.util.Date datum = null;
        if (!godina.isEmpty()) {
            datumString = godina + "-01-01";
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            try {
                datum = format.parse(datumString);
            } catch (ParseException ex) {
                Logger.getLogger(StatistikaForma.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        String prosekUkupno = (String) jComboBoxKriterijum1.getSelectedItem();
        String cenaKolicina = (String) jComboBoxKriterijum2.getSelectedItem();

        Proizvod proizvod = new Proizvod();
        proizvod.setTip(tip);
        proizvod.setVrsta(vrsta);
        proizvod.setKlasa(klasa);

        Otpremac otpremac = new Otpremac();

        Lokalitet lokalitet = new Lokalitet();
        lokalitet.setJedinicaGazdinstva(jedinicaGazdinstva);
        lokalitet.setOdsekOdeljenje(odsekOdeljenje);

        if (jedinicaGazdinstva == null && odsekOdeljenje == null) {
            otpremac.setLokalitet(null);
        } else {
            otpremac.setLokalitet(lokalitet);
        }

        Otpremnica otpremnica = new Otpremnica();
        otpremnica.setOtpremac(otpremac);
        otpremnica.setDatumOtpremnice(datum);

        StavkaOtpremnice so = new StavkaOtpremnice();
        so.setOtpremnica(otpremnica);
        so.setProizvod(proizvod);

        List<Object[]> lista = new ArrayList<>();
        boolean uspesno = Controller.getInstance().analiziraj(so, prosekUkupno, cenaKolicina, lista);
        if (uspesno && !lista.isEmpty()) {
            if (lista.get(0).length == 3) {

                List<Integer> vreme = new ArrayList<>();
                List<String> mesta = new ArrayList<>();
                List<Double> vrednosti = new ArrayList<>();

                for (int i = 0; i < lista.size(); i++) {
                    vreme.add((Integer) lista.get(i)[0]);
                    mesta.add((String) lista.get(i)[1]);
                    vrednosti.add((Double) lista.get(i)[2]);
                }
                boolean isGodina = jTextFieldGodina.getText().isEmpty() ? true : false;
                StatistikaDialog sd = new StatistikaDialog(this, true, vreme, isGodina, mesta, vrednosti);
                sd.setVisible(true);
                //StackedDiagram.createStackedBarChart(jPanelStackedDiagram, lokaliteti, meseci, vrednosti);
            } else {
                ArrayList<Integer> vreme = new ArrayList<>();
                ArrayList<Double> vrednosti = new ArrayList<>();
                for (int i = 0; i < lista.size(); i++) {
                    vreme.add((Integer) lista.get(i)[0]);
                    vrednosti.add((Double) lista.get(i)[1]);
                }
                boolean isGodina = jTextFieldGodina.getText().isEmpty() ? true : false;
                StatistikaDialog sd = new StatistikaDialog(this, true, vreme, isGodina, vrednosti);
                sd.setVisible(true);
                //HistogramExample.kreirajGrafikon(jPanelChart, meseci, vrednosti);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Nema rezultata za odabrane kriterijume", "Obaveštenje", JOptionPane.INFORMATION_MESSAGE);
            return;
        }


    }//GEN-LAST:event_jButtonAnalizirajActionPerformed

    private void jComboBoxKriterijum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxKriterijum1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxKriterijum1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StatistikaForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StatistikaForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StatistikaForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StatistikaForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StatistikaForma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAnaliziraj;
    private javax.swing.JComboBox<JedinicaGazdinstva> jComboBoxGazdinskaJedinica;
    private javax.swing.JComboBox<Klasa> jComboBoxKlasa;
    private javax.swing.JComboBox<String> jComboBoxKriterijum1;
    private javax.swing.JComboBox<String> jComboBoxKriterijum2;
    private javax.swing.JComboBox<String> jComboBoxOdsekOdeljenje;
    private javax.swing.JComboBox<Tip> jComboBoxTip;
    private javax.swing.JComboBox<Vrsta> jComboBoxVrsta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableStatistika;
    private javax.swing.JTextField jTextFieldGodina;
    // End of variables declaration//GEN-END:variables

    private void inicijalizacija() {
        popuniComboBox();
        List<Object[]> podaci = new ArrayList<>();
        boolean uspesno = Controller.getInstance().vratiListuDoznakaOtprema(podaci);
        if (!uspesno) {
            JOptionPane.showMessageDialog(this, "Greška prilikom učitavanja podataka");
            return;
        }
        StatistikaModelTabele smt = new StatistikaModelTabele(podaci);
        jTableStatistika.setModel(smt);
        //HistogramExample.kreirajGrafikon(jPanelChart);
        //FunctionDiagram.kreirajDijagram(jPanelDiagram);

        //StackedDiagram.createStackedBarChart(jPanelStackedDiagram, lokaliteti, meseci, kolicine);
    }

    private void popuniComboBox() {

        Tip[] tipovi = Tip.values();
        Vrsta[] vrste = Vrsta.values();
        Klasa[] klase = Klasa.values();
        JedinicaGazdinstva[] jedinice = JedinicaGazdinstva.values();
        List<Lokalitet> lokaliteti = new ArrayList<>();
        Controller.getInstance().vratiListuLokalitet(lokaliteti);

        // Dodavanje opcije "IZABERI" koja će predstavljati null vrednost
        jComboBoxTip.addItem(null);
        for (Tip t : tipovi) {
            jComboBoxTip.addItem(t);
        }
        jComboBoxTip.setSelectedIndex(0); // Postavlja "IZABERI" kao podrazumevanu vrednost

        jComboBoxVrsta.addItem(null);
        for (Vrsta v : vrste) {
            jComboBoxVrsta.addItem(v);
        }
        jComboBoxVrsta.setSelectedIndex(0);

        jComboBoxKlasa.addItem(null);
        for (Klasa k : klase) {
            jComboBoxKlasa.addItem(k);
        }
        jComboBoxKlasa.setSelectedIndex(0);

        jComboBoxGazdinskaJedinica.addItem(null);
        for (JedinicaGazdinstva jg : jedinice) {
            jComboBoxGazdinskaJedinica.addItem(jg);
        }
        jComboBoxGazdinskaJedinica.setSelectedIndex(0);

        jComboBoxOdsekOdeljenje.addItem(null);
        for (Lokalitet l : lokaliteti) {
            jComboBoxOdsekOdeljenje.addItem(l.getOdsekOdeljenje());
        }
        jComboBoxOdsekOdeljenje.setSelectedIndex(0);

    }

}
