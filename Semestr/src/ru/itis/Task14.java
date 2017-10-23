package ru.itis;

import java.util.Scanner;

public class Task14 {
    public static int first(int x){
        return x / 100000 + (x / 10000) % 10 + (x / 1000) % 10;
    }
    public static int second(int x){
        return x % 10 + (x / 10) % 10 + (x / 100) % 10;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = Integer.parseInt(scanner.nextLine());
        if (first(x) == second(x)){
            System.out.println("Счастливый");
        }else System.out.println("Несчастливый");
    }
}