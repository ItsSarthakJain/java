package com.sarthak.java;

public class Animal {

    private int brain;
    private String name;
    private int size;
    private int weight;

    public Animal(int brain, String name, int size, int weight) {
        this.brain = brain;
        this.name = name;
        this.size = size;
        this.weight = weight;
    }

    public void eat(){
        System.out.println("animal.eat() is called");
    }

    public void move(int speed){
        System.out.println("animal is moving at " + speed);

    }

    public int getdata() {
    }
}
