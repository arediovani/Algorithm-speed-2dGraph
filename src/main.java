import org.jfree.*;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

import java.io.File;
import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {
        //Create objects of all the Algorithms we will use
        Bubble BS = new Bubble();
        Merge ME = new Merge();
        Selection SE = new Selection();
        Quick QU = new Quick();
        //Bogo BO = new Bogo();

        //Create arrays that will hold the average time of the sorts, since its in nano seconds we need it in float type
        float[] BUsort = new float[53];
        float[] MEsort = new float[53];
        float[] SEsort = new float[53];
        float[] QUsort = new float[53];
        //float[] BOsort = new float[53];

        //Fill the array with the values
        //it i is equal to 3 because we want sortsto happen from value 3 to 53, so in total 50sorting sizes
        //GetAverageTime will return an average time of 10 sorts of the specific sort
        for (int i = 3, x = 0; i <= 53; i++, x++) {
            BUsort[x] = BS.GetAverageTime(i);
            MEsort[x] = ME.GetAverageTime(i);
            SEsort[x] = SE.GetAverageTime(i);
            QUsort[x] = QU.GetAverageTime(i);
            //BOsort[x] = BO.GetAverageTime(i);
        }
//Genereate the Graph, passed the arrays with the values
        final XYSeriesDemo demo = new XYSeriesDemo("Java programing course project", MEsort, BUsort, SEsort, QUsort);
        demo.pack();
        RefineryUtilities.centerFrameOnScreen(demo);
        demo.setVisible(true);

    }


}
