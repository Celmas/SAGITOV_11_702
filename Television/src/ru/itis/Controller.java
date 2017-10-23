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

    void change(String s){
        for (int i = 0; i < tv.channels.length; i++){
            if (s == tv.channels[i].getName()){
                tv.channels[i].change();
                break;
            }
        }
    }

    public static Builder builder(){
        return new Builder();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public String getNameOfCompany() {
        return nameOfCompany;
    }

    public void setNameOfCompany(String nameOfCompany) {
        this.nameOfCompany = nameOfCompany;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getService() {
        return service;
    }

    public void setService(double service) {
        this.service = service;
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