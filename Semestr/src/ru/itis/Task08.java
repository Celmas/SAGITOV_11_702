package ru.itis;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1,x2,y1,y2,r1,r2,r;
        x1 = scanner.nextDouble();
        x2 = scanner.nextDouble();
        y1 = scanner.nextDouble();
        y2 = scanner.nextDouble();
        r1 = scanner.nextDouble();
        r2 = scanner.nextDouble();
        r = Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
        if (r < r1 + r2){
            System.out.println("Пересекается");
        } else System.out.println("Не пересекается");

    }
}
