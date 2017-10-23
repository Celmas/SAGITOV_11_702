package ru.itis;

import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        int k=0;
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                if ((a.charAt(j) == b.charAt(i)) && (j!=i)) k++;
            }
        }
        System.out.println(k);
    }
}
