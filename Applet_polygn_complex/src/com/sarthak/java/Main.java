package com.sarthak.java;
import java.awt.*;
import java.applet.*;
/*
<applet code="Main" width=300 height=300>
</applet>
 */
public class Main extends Applet {
    public void paint(Graphics g)
    {
        Polygon poly=new Polygon();
        poly.addPoint(20,20);
        poly.addPoint(120,120);
        poly.addPoint(220,20);
        poly.addPoint(20,20);
        g.drawPolygon(poly);
    }
}
