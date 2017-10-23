package ru.itis;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String coor = scanner.next();
        int x = coor.charAt(0) - 'a' + 1;
        int y = coor.charAt(1) - '0';
        if (x % 2 == 0){
            if (y % 2 == 0) {
                System.out.println("Черный");
            } else{
                System.out.println("Белый");
            }
        } else{
            if (y % 2 == 0){
                System.out.println("Белый");
            } else{
                System.out.println("Черный");
            }

        }

    }
}
