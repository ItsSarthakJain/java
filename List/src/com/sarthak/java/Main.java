package com.sarthak.java;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*
<applet code = "Main" height=300 width=300>
</applet>
 */
public class Main extends Applet implements ActionListener{
    List os,browser;
    String msg="";

    public void init()
    {
        os=new List(3,true);
        browser=new List(3,false);

        os.add("Linux");
        os.add("windows");
        os.add("Mac");
        os.add("solaris");

        browser.add("netscape");
        browser.add("Internet explorer");
        browser.add("Google chrome");
        browser.add("Safari");
        browser.add("moxila");

        add(os);
        add(browser);

        os.select(1);
        os.addActionListener(this);
        browser.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
        repaint();
    }
    public void paint(Graphics g)
    {
        String idx[];

        msg="Current os: ";
        idx=os.getSelectedItems();
        for(int i=0;i<idx.length;i++)
            msg+=idx[i]+"  ";
        g.drawString(msg,6,120);
        msg="Current Browser";
        msg+=browser.getSelectedItem();
        g.drawString(msg,6,140);
    }
    }
