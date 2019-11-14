package com.sarthak.java;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        String a, p = "";
        int len, i, j, lar = 0, count = 0;
        char ch, q='c';
        Scanner sc = new Scanner(System.in);
        a = sc.nextLine();
        len = a.length();
        for (i = 0; i < len; i++) {
            ch = a.charAt(i);
            if (ch != ' ') {
                for (j = 0; j < len; j++) {
                    if (a.charAt(j) == ch)
                        count++;
                }
                if (count > lar) {
                    lar = count;
                    q = ch;
                }
            }
        }
        System.out.println(""+q);
    }
}
