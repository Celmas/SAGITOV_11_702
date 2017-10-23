package ru.itis;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if ((a > b + c) || (b > a + c) || (c > b + a)){
            System.out.println("Не существует");
        }else {
            System.out.println("Существует");
        }
    }
}
