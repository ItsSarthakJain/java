package com.sarthak.java;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	double len,bre,area,peri;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the length and breath");
	len=sc.nextDouble();
	bre=sc.nextDouble();
	area=len*bre;
	peri=2*(len+bre);
	System.out.println("THE area calculated is = "+area);
	System.out.println("The calculated value of perimeter = " +peri);
    }
}
