package com.sarthak.java;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	double base,height,area;
	System.out.println("Enter base and heigth");
	Scanner sc=new Scanner(System.in);
	base=sc.nextDouble();
	height=sc.nextDouble();
	area=(0.5)*base*height;
        System.out.println("THE calculated area of traingle is"+area);
    }
}
