package com.sarthak.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int acc_no;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Account no");
        acc_no=sc.nextInt();
        Accounts a=new Accounts(acc_no);

    }
}
