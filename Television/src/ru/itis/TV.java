package ru.itis;

import java.time.LocalTime;

public class TV {
    private static final TV instance;
    public Channel[] channels;
    private int i = 0;

    void createArrayOfChannels(int n){
        channels = new Channel[n];
    }

    void addChannels(Channel channel){
            channels[i] = channel;
            i++;
    }

    void onTV(Program[] programs, int n){
        for (int i = 0; i < n; i++){
            if (LocalTime.now().isAfter(programs[i].getStart()) && LocalTime.now().isBefore(programs[i].getEnd())){
                System.out.println("Сейчас идет " + programs[i].getName() );
            }
        }
    }

    private TV(){

    }

    static {
        instance = new TV();
    }

    public static TV getInstance() {
        return instance;
    }
}
