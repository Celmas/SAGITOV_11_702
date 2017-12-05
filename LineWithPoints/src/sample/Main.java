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
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Изи");
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.show();

    }


    public static void main(String[] args) {
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
/*        list.show();
        System.out.println(countOfLines);*/

        primaryStage.setScene(new Scene(lineChart, 800, 600));
        primaryStage.show();
        launch(args);

    }
}
