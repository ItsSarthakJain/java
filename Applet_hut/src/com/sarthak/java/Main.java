package com.sarthak.java;
import java.awt.*;
import java.applet.*;
/*
<applet code="Main" width=30000 height=30000>
</applet>
 */
public class Main extends Applet {
    public void paint(Graphics g)
    {
        g.drawRect(100,200,300,150);
        g.drawRect(25,0,800,500);
        Polygon tri=new Polygon();
        tri.addPoint(100,200);
        tri.addPoint(150,75);
        tri.addPoint(200,200);
        g.drawPolygon(tri);
        g.drawLine(200,200,200,350);
        g.fillRect(130,275,40,75);
        g.drawLine(150,75,350,75);
        g.drawLine(350,75,400,200);
        g.drawRect(275,250,50,50);
        g.drawLine(300,250,300,300);
        //g.setColor(Color.cyan);
        g.drawLine(275,275,325,275);
        //g.drawArc(100,350,26,0,0,90);
        g.setColor(Color.blue);
        g.fillRect(25,400,802,100);
    }
}
