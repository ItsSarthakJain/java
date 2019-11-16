package com.sarthak.java;

import java.util.Scanner;

public class Person {
    int rollno;
    String name;
    Scanner sc=new Scanner(System.in);
    void getperson()
    {
        System.out.println("Enter the person name and roll no:");
        name=sc.nextLine();
        rollno=sc.nextInt();
    }
    void putperson()
    {
        System.out.println("person roll no :"+rollno);
        System.out.println("person name :"+name);
    }
}
