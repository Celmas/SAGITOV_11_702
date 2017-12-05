package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

import java.io.*;
import java.util.Scanner;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        final NumberAxis xAxis = new NumberAxis();
        final NumberAxis yAxis = new NumberAxis();
        final LineChart<Number,Number> lineChart = new LineChart<>(xAxis,yAxis);
        primaryStage.setTitle("Изи");

        Line[] line = new Line[25];
        SortedListOfPoints list = new SortedListOfPoints();
        Scanner scanner = null;
        int countOfLines = 0;
        try {
            scanner = new Scanner(new File("C:\\Users\\Ilnur\\Desktop\\java\\LineWithPoints\\src\\sample\\points.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (scanner.hasNextInt()) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            list.add(new Point(x,y));
        }
        int i = 0;
        while (list.count > 0){
            line[i] = new Line(list.getArray());
            line[i].show();
            i++;
        }
        XYChart.Series series[] = new XYChart.Series[i];
        for(int j = 0; j < i; j++){
            series[j] = new XYChart.Series();
            for (int k = 0; k < line[j].points.length; k++) {
                series[j].getData().add(new XYChart.Data(line[j].points[k].x, line[j].points[k].y));
            }
            lineChart.getData().add(series[j]);
        }
/*        list.show();
        System.out.println(countOfLines);*/

        primaryStage.setScene(new Scene(lineChart, 800, 600));
        primaryStage.show();

    }


    public static void main(String[] args) {

        launch(args);

    }
}
