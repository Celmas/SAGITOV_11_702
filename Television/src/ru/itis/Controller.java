package ru.itis;

public class Controller {
    TV tv = TV.getInstance();
    private String name;
    private int serial;
    private String nameOfCompany;
    private String model;
    private double service;

    public Controller(Builder builder){
        this.name = builder.name;
        this.serial = builder.serial;
        this.nameOfCompany = builder.nameOfCompany;
        this.model = builder.model;
        this.service = builder.service;
    }

    void change(Channel channel){
        channel.change(tv);
    }

    public static Builder builder(){
        return new Builder();
    }

    public static class Builder{
        private String name;
        private int serial;
        private String nameOfCompany;
        private String model;
        private double service;

        public Builder name(String name){
            this.name = name;
            return this;
        }
        public Builder serial(int serial){
            this.serial = serial;
            return this;
        }
        public Builder nameOfCompany(String nameOfCompany){
            this.nameOfCompany = nameOfCompany;
            return this;
        }
        public Builder model(String model){
            this.model = model;
            return this;
        }
        public Builder service(double service){
            this.service = service;
            return this;
        }
        public Controller build(){
            return new Controller(this);
        }

    }


}