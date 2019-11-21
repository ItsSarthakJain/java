package com.sarthak.java;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        String a,p="",s="";
        int len,i,j,lar=0,count=0;
        char ch;
        Scanner sc=new Scanner(System.in);
        a= sc.nextLine();
        a=a+" ";
        len=a.length();
        for(i=0;i<len;i++)
        {
            ch=a.charAt(i);
            if(ch!=' ')
            {
                p=p+ch;
            }
            else
            {
                int l=p.length();
                for(j=0;j<l;j++)
                if(p.charAt(j)=='a'||p.charAt(j)=='e'||p.charAt(j)=='i'||p.charAt(j)=='o'||p.charAt(j)=='u')
                    count++;
                if(count>lar) {
                    lar = count;
                    s=p;
                }
                count=0;
                p="";

            }
        }
        System.out.println(s);
    }
}
