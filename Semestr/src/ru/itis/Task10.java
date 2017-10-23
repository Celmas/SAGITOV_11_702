package ru.itis;

import java.util.Scanner;

public class Task10 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b  = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = b * b - 4 * a * c;
        if (d < 0){
            System.out.println("0 корней");
            System.out.println(-1);
        } else if (d == 0){
            System.out.println("1 корень:");
            System.out.println(-b / (2 * a));
        } else{
            System.out.println("2 корня:");
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println(x1 + " и " + x2);
        }
    }
}
