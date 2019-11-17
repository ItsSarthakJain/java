package com.sarthak.java;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Dog extends Animal {

    private int legs;
    private int eyes;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight,int legs,int tail,int teeth,int eyes,String coat) {
        super(1,name,1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.coat = coat;
        this.teeth = teeth;
        this.tail = tail;
    }

    private void chew()
    {
        System.out.println("dog chews food");
    }

    public void walk()
    {
        System.out.println("dog.walk() is called");
        move(5);
    }

    public void run()
    {
        System.out.println("dog.run is called");
        move(20);
    }
    @Override
    public void eat()
    {
        chew();
        System.out.println("dog.eat() is called");
        super.eat();
    }

    private void movelegs(int speed)
    {
        System.out.println("dog.movelegs is called");
    }

    @Override
    public void move(int speed) {
        System.out.println("dog.move is called");
        movelegs(20);
        super.move(speed);
    }
}
