package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    private static Line[] lines;
    XYChart.Series series[] = new XYChart.Series[15];
    @FXML
    private CategoryAxis x;

    @FXML
    private NumberAxis y;

    @FXML
    private LineChart<?, ?> chart;

    public static void setLines(Line[] lines) {
        Controller.lines = lines;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public static void show(){

    }
}
