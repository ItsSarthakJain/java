package com.sarthak.java;

public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model) {
        String validModel = model;
        if(validModel.equals("aaaa") || validModel.equals("holden"))
        {
            this.model = validModel;
        }
        else
        {
            this.model = "Unknown";
        }

    }

    public String getModel()
    {
        return this.model;
    }
}
