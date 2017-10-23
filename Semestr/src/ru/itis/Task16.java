package ru.itis;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = Integer.parseInt(scanner.nextLine());
        int a = Task14.first(x);
        int b = Task14.second(x);
        if (Math.abs(a-b) == 1){
            System.out.println("Yes");
        }
    }
}
