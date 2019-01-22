package com.sarthak.java;
import java.util.*;

class aaa
{
    int a,b;
    aaa(int x,int y)
    {
        a=x;
        b=y;
        System.out.println("base class constructor called");
    }
    void show()
    {
        System.out.println("value of a:"+a);
        System.out.println("value of b is:"+b);
    }
}
class ccc extends aaa
{
    int c;
    ccc(int x,int y,int z)
    {
        super(x,y);
        c=30;
        System.out.println("child class constructor called");
    }
     void show()
    {
        super.show();
        System.out.println("value of c is:"+c);
    }
}
public class Main
{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ccc c1=new ccc(10,20,30);
        c1.show();
    }
}
