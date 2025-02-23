package test;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import org.jfree.chart.labels.ItemLabelAnchor;
import org.jfree.chart.labels.ItemLabelPosition;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.ui.TextAnchor;

public class HistogramExample {

    public static void kreirajGrafikon(JPanel panel, ArrayList<Integer> vreme, boolean isGodina, ArrayList<Double> kolicine) {
        panel.setLayout(new BorderLayout());

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        for (int i = 0; i < vreme.size(); i++) {
            dataset.addValue(kolicine.get(i), "Otprema", vreme.get(i));
        }

        JFreeChart chart = ChartFactory.createBarChart(
                "Otprema po " + (isGodina ? "godinama" : "mesecima"),
                (isGodina ? "Godine" : "Meseci"),
                "Vrednost", // Osa Y
                dataset, // Podaci
                PlotOrientation.VERTICAL,
                true, true, false
        );

        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(panel.getWidth(), panel.getHeight()));

        panel.removeAll();
        panel.add(chartPanel, BorderLayout.CENTER); 
        panel.revalidate();
        panel.repaint();
    }

}
