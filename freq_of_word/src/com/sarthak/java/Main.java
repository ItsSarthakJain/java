package com.sarthak.java;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        String a, find,p="";
        int i, j, l,s=0, l2,no=0, index = 0, count = 0;
        char ch;
        Scanner sc = new Scanner(System.in);
        a = sc.nextLine();
        find = sc.nextLine();
        a=a+" ";
        find=find;
        l = a.length();
        l2 = find.length();
        for (i = 0; i < l; i++)
        {
            ch = a.charAt(i);
            if(ch!=' ')
            {
                p=p+ch;
            }
        else {
                if(p.equals(find))
                    no++;
                    p="";
            }

        }
        if (no!=0)
        System.out.println("the word was found "+no+" times");
        else
            System.out.println("not found");
    }
}
