package ru.itis;

import java.util.Scanner;

public class Main {
    public static void showMenu(){
        System.out.println("**********************************");
        System.out.println("1. Предыдущая локация");
        System.out.println("2. Следующая локация");
        System.out.println("3. Монстры");
        System.out.println("4. Рюкзак");
        System.out.println("5. Магазин");
        System.out.println("6. Выход");

    }
    public static void showBattleMenu(){
        System.out.println();
        System.out.println("1. Атаковать");
        System.out.println("2. Использовать заклинание");
        System.out.println("3. Рюкзак");
        System.out.println("4. Бежать");
    }
    public static void showSetHero(){
        System.out.println("**********************************");
        System.out.println("1. Воин");
        System.out.println("2. Маг");
        System.out.println("3. Лучник");
    }

    public static void battle(){

    }
    public static HeroClass init(){
        System.out.println("Выберите персонажа");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch (a){
            case 1: return new HeroClass(600, 200, 50);
            case 2: return new HeroClass(400,400, 39);
            case 3: return new HeroClass(400,200, 70);
            default:{
                System.out.println("Вы не выбрали класс");
                System.exit(0);
            }

    }

    public static void main(String[] args) {

        HeroClass mob1 = new Monster(600,2,50,100,50);
        HeroClass mainCharacter = init();
        System.out.println(mob1.lvl);
    }

}
