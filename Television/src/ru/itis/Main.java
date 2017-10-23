package ru.itis;

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
        tv.createArrayOfChannels(10); // Setting number of channels
        Channel channel1 = new Channel("Первый канал", 4); // n is number of programs
        channel1.addProgram("Доброе утро", "06:00:00", "12:00:00");
        channel1.addProgram("Давай поженимся", "12:00:00", "15:00:00");
        channel1.addProgram("Пусть говорят", "15:00:00", "21:00:00");
        channel1.addProgram("КВН", "21:00:00", "23:00:00");
        Channel channel2 = new Channel("Россия 1", 4);
        channel2.addProgram("Маша и Медведь", "06:00:00", "12:00:00");
        channel2.addProgram("Сто к одному", "12:00:00", "15:00:00");
        channel2.addProgram("Вести", "15:00:00", "21:00:00");
        channel2.addProgram("Воскрессный вечер", "21:00:00", "23:00:00");
        Channel channel3 = new Channel("РенТВ", 4);
        channel3.addProgram("Званный ужин", "06:00:00", "12:00:00");
        channel3.addProgram("Солдаты", "12:00:00", "15:00:00");
        channel3.addProgram("Знахарь", "15:00:00", "21:00:00");
        channel3.addProgram("Военная тайна", "21:00:00", "23:00:00");
        Channel channel4 = new Channel("СТС", 4);
        channel4.addProgram("Уральские пельмени", "06:00:00", "12:00:00");
        channel4.addProgram("Воронины", "12:00:00", "15:00:00");
        channel4.addProgram("Кухня", "15:00:00", "21:00:00");
        channel4.addProgram("Ночь кино", "21:00:00", "23:00:00");
        Channel channel5 = new Channel("ТНТ", 4);
        channel5.addProgram("Реальные пацаны", "06:00:00", "12:00:00");
        channel5.addProgram("Comedy Club", "12:00:00", "15:00:00");
        channel5.addProgram("СашаТаня", "15:00:00", "21:00:00");
        channel5.addProgram("Дом 2", "21:00:00", "23:00:00");
        Channel channel6 = new Channel("Россия 24", 4);
        channel6.addProgram("Новости 24", "06:00:00", "12:00:00");
        channel6.addProgram("Промывание мозгов", "12:00:00", "15:00:00");
        channel6.addProgram("Навальынй-Гитлер", "15:00:00", "21:00:00");
        channel6.addProgram("IT новости", "21:00:00", "23:00:00");
        Channel channel7 = new Channel("Cybersport", 4);
        channel7.addProgram("Dota 2", "06:00:00", "12:00:00");
        channel7.addProgram("CS GO", "12:00:00", "15:00:00");
        channel7.addProgram("LOL", "15:00:00", "21:00:00");
        channel7.addProgram("FIFA", "21:00:00", "23:00:00");
        Channel channel8 = new Channel("Disney", 4);
        channel8.addProgram("Финес и Ферб", "06:00:00", "12:00:00");
        channel8.addProgram("Смешарики", "12:00:00", "15:00:00");
        channel8.addProgram("Гравити фолз", "15:00:00", "21:00:00");
        channel8.addProgram("Маленький принц", "21:00:00", "23:00:00");
        Channel channel9 = new Channel("ТВ 3", 4);
        channel9.addProgram("Мультфильмы", "06:00:00", "12:00:00");
        channel9.addProgram("Касл", "12:00:00", "15:00:00");
        channel9.addProgram("Менталист", "15:00:00", "21:00:00");
        channel9.addProgram("OxxxymOron vs Dizaster", "21:00:00", "23:00:00");
        Channel channel10 = new Channel("Узнавайка", 4);
        channel10.addProgram("Как сдать экзамен Арсланову?", "06:00:00", "12:00:00");
        channel10.addProgram("Как выжить на дошиках?", "12:00:00", "15:00:00");
        channel10.addProgram("Как стать популярным?", "15:00:00", "21:00:00");
        channel10.addProgram("Как живут в армии?", "21:00:00", "23:00:00");

        c1.change("ТНТ");
        c1.change("РенТВ");
        c1.change("СТС");
        c1.change("Узнавайка");
        c1.change("Cybersport");
    }
}
