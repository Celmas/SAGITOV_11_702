package ru.itis;

import java.util.Scanner;

public class Task20 {
    public static int ticket(int a, int b, int n){
        int sum = 0;
        for (int i = n-1; i > 0; i--) {
            sum += (a / (10 * n) + b / (10 * n))%10;
            a = a / (10 * n);
            b = b / (10 * n);
            sum *= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = ticket(a,b,6);
        a=Task14.first(c);
        b=Task14.second(c);
        if (a==b){
            System.out.println("Yes");
        }else System.out.println("No");
    }
}
