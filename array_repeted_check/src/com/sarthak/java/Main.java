package com.sarthak.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int arr[],a,size=0,flag=0;
	Scanner sc=new Scanner(System.in);
	arr=new int[10];
        System.out.println("Enter array elements\n");
        for(int i=0;i<10;i++) {
            arr[i] = sc.nextInt();
        }
        /*
        int s=0;
        for(int i=0;i<10;i++)
        {
            if(arr[s]==arr[i]&&s!=i) {
                flag = 1;
            }
            if(i==9)
            {
                i=0;
                s++;
                if(s>9)
                {
                    break;
                }
            }
        }*/
        if(flag==1)
            System.out.println("repeted");
        else
            System.out.println("not repeted");
    }
}
