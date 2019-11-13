package com.sarthak.java;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	double a,b,c,s,area;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the lenth oof the three sides of triangle");
	a=sc.nextDouble();
	b=sc.nextDouble();
	c=sc.nextDouble();
	s=(a+b+c)/2;
	area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
	System.out.println("THE calculated area is"+area);
    }
}
