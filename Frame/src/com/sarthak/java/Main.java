package com.sarthak.java;

import java.awt.*;
import java.applet.*;

/*
<applet code=Main height=300 width=300>
</applet>
 */
public class Main extends Applet
{
    public void init()
    {
        myframe m1=new myframe("my first frame");
        m1.setSize(200,200);
        m1.setVisible(true);
    }
}
class myframe extends Frame
{

        public myframe(String str)
        {
            super(str);
        }
}

