package com.sarthak.java;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        int i,j,no,sum=0,index=-1,count=0;
        System.out.println("Enter tne nos you want to insert");
        Scanner sc=new Scanner(System.in);
        no=sc.nextInt();
        System.out.println("Enter array elements");
        int a[]=new int [no];
        for(i=0;i<no;i++) {
            a[i] =sc.nextInt();
            sum=sum+a[i];
        }
        int search;
        System.out.println("Enter no to search");
        search=sc.nextInt();
        int s=0,b=no,mid;
        while(s<=b) {
            mid = (s + b) / 2;
            if (search < a[mid])
                s = mid - 1;
            else if (search > a[mid])
                s = mid + 1;
            else if (search == a[mid]) {
                index=1;
                break;
            }
        }
        if(index==1)
            System.out.println("found");
        else
            System.out.println("not found");
        }

        }


