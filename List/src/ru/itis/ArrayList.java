package ru.itis;

import java.util.Scanner;

public class ArrayList {
    public static int count;
    public static void menu(){
        System.out.println("Меню");
        System.out.println("1. Создать массив");
        System.out.println("2. Добавить число в конец массива");
        System.out.println("3. Удалить число из массива");
        System.out.println("4. Вставить число в массив");
        System.out.println("5. Вывести массив");
        System.out.println("6. Выход");
    }
    public static void addNum(int array[],int x){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи число");
        int num = scanner.nextInt();
        array[x]=num;
    }
    public static void deleteNum(int array[],int k){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи index");
        int index = scanner.nextInt();
        array[index]=0;
        for (int i=index; i < k; i++){
            int buf=array[i];
            array[i]=array[i+1];
            array[i+1]=buf;
        }
    }
    public static void putNum(int array[],int k){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи number");
        int number = scanner.nextInt();
        System.out.println("Введи index");
        int index = scanner.nextInt();
        for( int i=k; i >= index; i--){
            array[i+1]=array[i];
        }
        array[index]=number;
    }
    public static void writeMas(int array[],int k){
        System.out.println("Массив:");
        for( int i=0;i <= k; i++){
            System.out.println(array[i]);
        }
    }
    public static int[] increaseMas(int old,int m[]){
        int b2[] = new int[2*old];
        for (int i=0; i<m.length; i++){
            b2[i]=m[i];
        }
        return b2;
    }
}
