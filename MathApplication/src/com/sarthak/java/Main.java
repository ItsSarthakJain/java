package com.sarthak.java;
import java.util.*;
class Mathoperation
{
    static double mul(double a, double b)
    {
        return a*b;
    }
    static double divide(double a,double b)
    {
        return a/b;
    }
}
public class Main {

    public static void main(String[] args) {
     double a=Mathoperation.mul(2.2,3.2);
     double b=Mathoperation.divide(a,2);
        System.out.println("multiply = "+a);
        System.out.println("divide = "+b);
    }
}
