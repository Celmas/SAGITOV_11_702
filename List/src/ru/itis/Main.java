package ru.itis;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,n;
        ArrayList array = new ArrayList();
        array.menu();
        a = scanner.nextInt();
        if (a!=1 && a!=6){
            System.out.println("Ты не создал массив!");
            System.out.println("Аривидерчи");
            System.exit(0);
        }
        if (a==6) System.exit(0);
        n = scanner.nextInt();
        int b[] = new int[n];
        for (int i=0; i < n; i++){
            b[i] = scanner.nextInt();
        }
        array.count=n-1;
        while(true){
            array.menu();
            a = scanner.nextInt();
            if (a == 2){
                if (array.count+1==n) {
                    b=ArrayList.increaseMas(n,b);
                    n=2*n;
                }
                ArrayList.addNum(b,array.count+1);
                array.count++;
            }else if (a == 3){
                ArrayList.deleteNum(b,array.count);
                array.count--;
            }else if (a == 4){
                if (array.count+1==n) {
                    b=ArrayList.increaseMas(n,b);
                    n=2*n;
                }
                ArrayList.putNum(b,array.count);
                array.count++;
            }else if (a == 5){
                ArrayList.writeMas(b,array.count);
            }else if (a == 6){
                System.exit(0);
            }
        }
    }
}