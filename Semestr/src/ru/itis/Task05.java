package ru.itis;

import java.util.Scanner;

public class Task05 {
    public static boolean isSame(int x, int x1, int y, int y1){
        return Math.abs(x-x1) == Math.abs(y-y1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String coor = scanner.next();
        int x = coor.charAt(0) - 'a' + 1;
        int y = coor.charAt(1) - '0';
        coor = scanner.next();
        int x1 = coor.charAt(0) - 'a' + 1;
        int y1 = coor.charAt(1) - '0';
        if (isSame(x,x1,y,y1)){
            System.out.println("Same");
        } else if (isSame(++x,x1,y,y1)) {
            System.out.println("Neibghour");
        } else if (isSame(x-2,x1,y,y1)){
            System.out.println("Neibghour");
        }
    }
}

