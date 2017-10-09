package ru.itis;

public class ArrayList {
    int elements[];
    int count=0;
    void menu(){
        System.out.println("Меню");
        System.out.println("1. Создать массив");
        System.out.println("2. Добавить число в конец массива");
        System.out.println("3. Удалить число из массива");
        System.out.println("4. Вставить число в массив");
        System.out.println("5. Вывести массив");
        System.out.println("6. Выход");
    }
    void create(int n){
        elements = new int[n];
    }
    void add(int num){
        elements[count] = num;
        count++;
    }
    void delete(int index){
        count--;
        for (int i=index; i<count; i++){
            int buf=elements[i];
            elements[i]=elements[i+1];
            elements[i+1]=buf;
        }
    }
    void putNum(int index, int number){
        for (int i=count-1; i>=index; i--){
            elements[i+1]=elements[i];
        }
        elements[index]=number;
        count++;
    }
    void show(){
        System.out.println("Массив:");
        System.out.println(count);
        for( int i=0;i < count; i++){
            System.out.println(elements[i]);
        }
    }
    void increase (int n){
        int newElemets[] = new int[2*n];
        for (int i=0; i<elements.length; i++){
            newElemets[i]=elements[i];
        }
        elements=newElemets;
    }
}
