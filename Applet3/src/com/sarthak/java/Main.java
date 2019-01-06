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
        g.drawOval(40,40,120,150);
        g.drawOval(57,75,30,20);
        g.drawOval(110,75,30,20);
        g.fillOval(68,81,10,10);
        g.fillOval(121,81,10,10);
        g.fillOval(85,100,30,30);
        g.fillArc(60,125,80,40,180,180);
        g.drawOval(25,92,15,30);
        g.drawOval(160,92,15,30);
        g.drawLine(40,107,40,10);
        g.drawLine(160,107,160,10);
        g.setColor(Color.black);
        g.fillOval(40,0,120,20);
    }
}
