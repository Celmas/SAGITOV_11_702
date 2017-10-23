package ru.itis;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String coor = scanner.next();
        int x = coor.charAt(0) - 'a' + 1;
        int y = coor.charAt(1) - '0';
        coor = scanner.next();
        int x1 = coor.charAt(0) - 'a' + 1;
        int y1 = coor.charAt(1) - '0';
        if ((x == x1) || (y == y1)){
            System.out.println("Yes");
        } else System.out.println("No");
    }
}
