package ru.itis;

import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,b,d,sum = 0;
        a = sc.nextDouble();
        b = sc.nextDouble();
        d = sc.nextDouble();
        if (a > b) {
            double buf = a;
            a = b;
            b = buf;
        }
        while (a < b){
            a += d;
            sum += a;
        }
        System.out.println(sum - b);
    }
}
