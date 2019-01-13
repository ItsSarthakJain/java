package com.sarthak.java;
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException//IMPORTANT as it throws i/o exception
    {
	double a,b,c,d;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the 3 no's");
        a=Double.parseDouble(br.readLine());//for int Integer.parseInt(.........)
        b=Double.parseDouble(br.readLine());//for char like suppose ch is our variable then ch=(char)(br.readline());
        c=Double.parseDouble(br.readLine());//for string like our string name is str then str=br.readline();
        d=(a+b+c)/3;
        System.out.println("Average of three no's is "+d);
    }
}
/////BUFFER READER METHOD