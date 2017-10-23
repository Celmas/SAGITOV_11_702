package ru.itis;

public class Main {
    public static int parse(char[] number){
        int x = number[0] - '0';
        for (int i = 1; i < number.length; i++){
            x*=10;
            int buf = number[i]-'0';
            x= x+buf;
        }
        return x;
    }

    public static void main(String[] args) {
	    char[] number = {'2','4','6'};
	    int x = parse(number);
        System.out.println(x);
    }
}
