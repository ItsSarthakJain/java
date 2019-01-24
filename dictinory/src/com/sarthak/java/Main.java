package com.sarthak.java;
import java.util.*;
public class Main
{

    public static void main(String[] args) {
        // write your code here
        String str;
        int i, len, j;
        char ch, temp, c;
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        len = str.length();
        for (i = 65; i <= 90; i++) {

            for (j = 0; j < len; j++)
            {
                c = str.charAt(j);
                if (c == (char) i)
                    System.out.print(c);
            }
        }
    }
}