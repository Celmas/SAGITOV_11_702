package ru.itis;

import java.time.LocalTime;

public class Channel {
    private String name;
    private int n;
    TV tv = TV.getInstance();
    private Program[] programs;
    Channel(String name, int n){
        this.name = name;
        this.n = n;
        this.programs = new Program[n];
        tv.addChannels(this);
    }


    private int i = 0;
    void addProgram(String name, LocalTime start, LocalTime end){
        programs[i] = new Program(name, start, end);
        i++;
    }

    void change(){
        tv.onTV(programs, n);
    }

    public void setN(int n) {
        this.n = n;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
