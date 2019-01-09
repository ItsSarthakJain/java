package com.sarthak.java;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	int a[]=new int[5];
	System.out.println("enter array elements");
	int i,j,temp,index=-1;
	Scanner sc=new Scanner(System.in);
	for(i=0;i<5;i++)
	    a[i]=sc.nextInt();
	int small,s=0;
	for(j=0;j<5;j++)
    {
        small=j;
	 for(i=j+1;i<5;i++)
	 {
        if (a[i] < a[small]) {
            small = i;
        }
     }
        temp=a[j];
        a[j]=a[small];
        a[small]=temp;
    }
        for(i=0;i<5;i++)
            System.out.println(""+a[i]);
    }


    }


