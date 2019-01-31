package com.sarthak.java;
import java.awt.*;
import java.applet.*;
/*
<applet code="myapplet5" width=300 height=300>
</applet>
 */
public class Main extends Applet {
    Color c1,c2,c3;
    Font f1;
    public void init()
    {
        c1=new Color(190,10,10);
        c2=new Color(20,20,20);
        c3=new Color(205,5,105);
        f1=new Font("helvetica",Font.ITALIC,40);
        setBackground(c1);
    }
    public void paint(Graphics g)
    {
        g.setFont(f1);
        g.setColor(c2);
        g.drawString("welcome",100,100);
        g.setColor(Color.cyan);
        g.drawString("hello",150,150);
    }
}
