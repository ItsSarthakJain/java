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
        for(int i=0;i<=4;i++)
        {
            if(i%2==0)
                g.drawOval(120,i*60,50,50);
            else
                g.fillOval(120,i*60+10,50,50);
        }
    }
}
