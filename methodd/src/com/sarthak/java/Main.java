package com.sarthak.java;
import java.util.*;
public class Main {
    void str(String stri,int x)
    {
        int len=stri.length();
        if(x%2==0)
        for(int i=1;i<len;i+=2)
        System.out.print(""+stri.charAt(i));
        else
            for(int i=0;i<len;i+=2)
                System.out.print(""+stri.charAt(i));
        System.out.println("");
    }
    void str(String stri,char c)
    {
        int len=stri.length();
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
            for(int i=0;i<len;i++){
                if(stri.charAt(i)=='a'||stri.charAt(i)=='e'||stri.charAt(i)=='i'||stri.charAt(i)=='o'||stri.charAt(i)=='u')
                 System.out.print(""+stri.charAt(i));
        }
        else
            for(int i=0;i<len;i++)
                        if(stri.charAt(i)!='a'||stri.charAt(i)!='e'||stri.charAt(i)!='i'||stri.charAt(i)!='o'||stri.charAt(i)!='u')
                            System.out.print(""+stri.charAt(i));

    }
    public static void main(String[] args)
    {
        Main ob=new Main();
        Scanner sc=new Scanner(System.in);
        String s;
        s=sc.nextLine();
        int a;
        char c;
        a=sc.nextInt();
        c=sc.next().charAt(0);
        ob.str(s,a);
        ob.str(s,c);
    }
}
