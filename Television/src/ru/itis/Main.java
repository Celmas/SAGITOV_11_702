package ru.itis;

import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {
	    TV tv = TV.getInstance();
        Controller c1 = Controller.builder()
                .model("Oxxxy")
                .name("Моя прелесть")
                .nameOfCompany("Nokia")
                .serial(15102017)
                .service(2.5)
                .build();
        Channel channel1 = new Channel("Первый канал", 4);
        channel1.addProgram("Доброе утро", LocalTime.parse("06:00:00"), LocalTime.parse("12:00:00"));
        channel1.addProgram("Давай поженимся", LocalTime.parse("12:00:00"), LocalTime.parse("15:00:00"));
        channel1.addProgram("Пусть говорят", LocalTime.parse("15:00:00"), LocalTime.parse("21:00:00"));
        channel1.addProgram("КВН", LocalTime.parse("21:00:00"), LocalTime.parse("06:00:00"));
        Channel channel2 = new Channel("Россия 1", 4);
        channel2.addProgram("Маша и Медведь", LocalTime.parse("06:00:00"), LocalTime.parse("12:00:00"));
        channel2.addProgram("Сто к одному", LocalTime.parse("12:00:00"), LocalTime.parse("15:00:00"));
        channel2.addProgram("Вести", LocalTime.parse("15:00:00"), LocalTime.parse("21:00:00"));
        channel2.addProgram("Воскрессный вечер", LocalTime.parse("21:00:00"), LocalTime.parse("06:00:00"));
        Channel channel3 = new Channel("РенТВ", 4);
        channel3.addProgram("Званный ужин", LocalTime.parse("06:00:00"), LocalTime.parse("12:00:00"));
        channel3.addProgram("Солдаты", LocalTime.parse("12:00:00"), LocalTime.parse("15:00:00"));
        channel3.addProgram("Знахарь", LocalTime.parse("15:00:00"), LocalTime.parse("21:00:00"));
        channel3.addProgram("Военная тайна", LocalTime.parse("21:00:00"), LocalTime.parse("06:00:00"));
        Channel channel4 = new Channel("СТС", 4);
        channel4.addProgram("Уральские пельмени", LocalTime.parse("06:00:00"), LocalTime.parse("12:00:00"));
        channel4.addProgram("Воронины", LocalTime.parse("12:00:00"), LocalTime.parse("15:00:00"));
        channel4.addProgram("Кухня", LocalTime.parse("15:00:00"), LocalTime.parse("21:00:00"));
        channel4.addProgram("Ночь кино", LocalTime.parse("21:00:00"), LocalTime.parse("06:00:00"));
        Channel channel5 = new Channel("ТНТ", 4);
        channel5.addProgram("Реальные пацаны", LocalTime.parse("06:00:00"), LocalTime.parse("12:00:00"));
        channel5.addProgram("Comedy Club", LocalTime.parse("12:00:00"), LocalTime.parse("15:00:00"));
        channel5.addProgram("СашаТаня", LocalTime.parse("15:00:00"), LocalTime.parse("21:00:00"));
        channel5.addProgram("Дом 2", LocalTime.parse("21:00:00"), LocalTime.parse("06:00:00"));

        c1.change(channel1);
        c1.change(channel3);
        c1.change(channel4);
    }
}
