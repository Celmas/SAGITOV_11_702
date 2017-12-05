package ru.itis;

public class Task27 {
    public static void main(String[] args) {
        int sum1 = 0, sum2 = 0;
        for (int i = 1; i < 101; i++){
            sum1+=i*i;
            sum2+=i;
        }
        System.out.println(sum1 + " " + sum2*sum2);
    }
}
