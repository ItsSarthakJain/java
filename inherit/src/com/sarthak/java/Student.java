package com.sarthak.java;

import java.util.Scanner;

public class Student  extends Person{
        float marks;
        Scanner sc=new Scanner(System.in);
        void getmarks()
        {
            System.out.println("Enter student marks ");
            marks=sc.nextFloat();
        }
        void putmarks()
        {
            System.out.println("Student's marks = "+marks);
        }
    }
