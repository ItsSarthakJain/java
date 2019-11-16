package com.sarthak.java;
import java.util.*;
public class Employ extends Person {
    double sal;
    String name;
    void getsal()
    {
        System.out.println("Enter name and salary of employ");
        name=sc.nextLine();
        sal=sc.nextDouble();

    }
    void putsal()
    {
        System.out.println("employ name: "+name);
        System.out.println("Salary is: "+sal);
    }
}
