import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.ui.ApplicationFrame;

import java.io.File;
import java.io.IOException;

public class XYSeriesDemo extends ApplicationFrame {
    float[] MEsort;
    float[] BUsort;
    float[] SEsort;
    float[] QUsort;

    public XYSeriesDemo(final String title, float[] MEsort, float[] BUsort, float[] SEsort, float[] QUsort) throws IOException {
        super(title);
        this.MEsort = MEsort;
        this.BUsort = BUsort;
        this.SEsort = SEsort;
        this.QUsort = QUsort;

        final XYSeries Buble = new XYSeries("Bubble Data");
        for (int i = 0, x = 3; i <= 52; i++, x++) {
            Buble.add(x, BUsort[i]);
        }

        final XYSeries Merge = new XYSeries("Merge Data");
        for (int i = 0, x = 3; i <= 52; i++, x++) {
            Merge.add(x, MEsort[i]);
        }

        final XYSeries Selection = new XYSeries("Selection Data");
        for (int i = 0, x = 3; i <= 52; i++, x++) {
            Selection.add(x, SEsort[i]);
        }

        final XYSeries Quick = new XYSeries("Quick Data");
        for (int i = 0, x = 3; i <= 52; i++, x++) {
            Quick.add(x, QUsort[i]);
        }

        final XYSeriesCollection data = new XYSeriesCollection(Buble);
        data.addSeries(Merge);
        data.addSeries(Selection);
        data.addSeries(Quick);
        final JFreeChart chart = ChartFactory.createXYLineChart(
                "Algorithm Comparision",
                "Size of Array",
                "Time",
                data,
                PlotOrientation.VERTICAL,
                true,
                true,
                false
        );

        final ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(500, 270));
        setContentPane(chartPanel);
        ChartUtilities.saveChartAsJPEG(new File("C:\\Users\\Aredio\\Desktop\\PNG\\" + "Comparision4.png"), chart, 1920, 1080);
    }

}
