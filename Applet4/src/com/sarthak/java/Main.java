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
       int xPoints[]={10,170,80,10};
       int yPoints[]={20,40,140,20};
       int nPoints=xPoints.length;
       g.fillPolygon(xPoints,yPoints,nPoints);
    }
}
