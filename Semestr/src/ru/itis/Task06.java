package ru.itis;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int data = scanner.nextInt();
        if ((data % 400 == 0) || ((data % 4 == 0) && (data % 100 != 0))){
            System.out.println(12 + "/0" + 9 + "/" + data);
        } else{
            System.out.println(13 + "/0" + 9 + "/" + data);
        }
    }
}