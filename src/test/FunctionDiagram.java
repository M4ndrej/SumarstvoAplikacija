package test;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import javax.swing.*;
import java.awt.*;

public class FunctionDiagram {

    public static void kreirajDijagram(JPanel panel) {
        panel.setLayout(new BorderLayout());

        // Kreiranje skupa podataka (X, f(X,Y))
        XYSeries series = new XYSeries("f(x,y) = x^2 + y^2");

        // Generisanje fiksnih tačaka za x i y
        for (int x = -5; x <= 5; x++) {
            double y = x;  // Da bi bila linija, možemo koristiti y = x
            double fxy = Math.pow(x, 2) + Math.pow(y, 2);  // f(x, y) = x^2 + y^2
            series.add(x, fxy); // Dodajemo tačku (x, f(x, y))
        }

        // Kreiranje kolekcije podataka
        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(series);

        // Kreiranje grafikona
        JFreeChart chart = ChartFactory.createXYLineChart(
                "Dijagram funkcije",
                "X vrednost",
                "f(X,Y) vrednost",
                dataset
        );

        // Prilagođavanje izgleda grafikona
        XYPlot plot = chart.getXYPlot();
        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer(true, false);  // Prikazuje liniju bez tačaka
        plot.setRenderer(renderer);

        // Kreiramo panel za grafikon
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(panel.getWidth(), panel.getHeight()));

        // Dodajemo grafikon u panel
        panel.removeAll();
        panel.add(chartPanel, BorderLayout.CENTER);
        panel.revalidate();
        panel.repaint();
    }
}
