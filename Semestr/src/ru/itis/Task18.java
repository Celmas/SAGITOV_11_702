package ru.itis;

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        int k=0;
        for (int i = 0; i < 4;i++){
            if (a.charAt(i) == b.charAt(i)) k++;
        }
        System.out.println(k);
    }
}
