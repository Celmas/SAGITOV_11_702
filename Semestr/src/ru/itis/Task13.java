package ru.itis;

import java.util.Scanner;

public class Task13 {
    public static int palindrom(int x){
        int newX=0;
        for (int i = 0; i<6; i++){
            newX *= 10;
            newX += x % 10;
            x/=10;
        }
        return newX;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = Integer.parseInt(scanner.nextLine());
        if (x == palindrom(x)){
            System.out.println("Палиндром");
        }else System.out.println("Не палиндром");
    }
}
