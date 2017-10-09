package ru.itis;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList array = new ArrayList();

        int a,n;

        array.menu();
        a = scanner.nextInt();
        if (a!=1 && a!=6){
            System.out.println("Ты не создал массив!");
            System.out.println("Аривидерчи");
            System.exit(0);
        }
        if (a==6) System.exit(0);
        n = scanner.nextInt();
        array.create(n);
        for (int i=0; i < n; i++){
            int k = scanner.nextInt();
            array.add(k);
        }
        while(true){
            array.menu();
            a = scanner.nextInt();
            if (a == 2){
                System.out.println("Введите число");
                int k = scanner.nextInt();
                if (array.count==n){
                    array.increase(n);
                    n=2*n;
                }
                array.add(k);
            }else if (a == 3){
                System.out.println("Введите индекс");
                int k = scanner.nextInt();
                array.delete(k);
            }else if (a == 4){
                System.out.println("Введи number");
                int number = scanner.nextInt();
                System.out.println("Введи index");
                int index = scanner.nextInt();
                if (array.count==n){
                    array.increase(n);
                    n=2*n;
                }
                array.putNum(index,number);
            }else if (a == 5){
                array.show();
            }else if (a == 6) System.exit(0);
        }
    }
}
