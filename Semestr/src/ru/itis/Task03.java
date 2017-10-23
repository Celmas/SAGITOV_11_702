package ru.itis;

import com.sun.org.apache.xpath.internal.SourceTree;
import org.omg.CORBA.MARSHAL;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String coor = scanner.next();
        int x = coor.charAt(0) - 'a' + 1;
        int y = coor.charAt(1) - '0';
        coor = scanner.next();
        int x1 = coor.charAt(0) - 'a' + 1;
        int y1 = coor.charAt(1) - '0';
        if ((Math.abs(x-x1) == 1) && (Math.abs(y-y1) == 2)){
            System.out.println("Yes");
        }else if ((Math.abs(x-x1) == 2) && (Math.abs(y-y1) == 1)){
            System.out.println("Yes");
        }else System.out.println("No");
    }
}
