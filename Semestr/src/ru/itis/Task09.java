package ru.itis;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a != 0) {
            System.out.print("" + a + "x^2");
        }
        if ((b > 0) && (a != 0)) {
            System.out.print("+" + b + "x");
        }else if ((b < 0) || (b > 0)) System.out.print("" + b + "x");
        if ((c > 0) && ((a != 0) ||(b != 0))) {
            System.out.println("+" + c);
        }else if ((c < 0) || (c > 0)) System.out.println("" + c); ;
    }
}
