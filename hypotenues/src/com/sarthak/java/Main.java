package com.sarthak.java;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	double base,height,hypo;
	System.out.println("Enter the base and height");
	Scanner sc=new Scanner(System.in);
	base=sc.nextDouble();
	height=sc.nextDouble();
	hypo=Math.sqrt((height*height)+(base*base));
        System.out.println("The calculated value of hypo"+hypo);
    }
}
