package ru.itis;

public class Task26 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 2; i < 1000; i++){
            if ((i % 3 == 0) &&(i % 5 == 0)) {
                sum +=i;
            }
        }
        System.out.println(sum);
    }
}
