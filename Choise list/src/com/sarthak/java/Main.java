package com.sarthak.java;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code="Main" height=300 width=300>
</applet>
 */

public class Main extends Applet implements ItemListener{
    Choice year,subjects;
    String msg="";

    public void init()
    {
        year=new Choice();
        subjects=new Choice();

        year.addItem("1st year");
        year.addItem("2nd year");
        year.addItem("3rd year");
        year.addItem("4th year");

        subjects.addItem("C language");
        subjects.addItem("C++ language");
        subjects.addItem("java language");
        subjects.addItem("Android studio");

        year.select("1st year");
        subjects.select("C language");

        add(year);
        add(subjects);

        year.addItemListener(this);
        subjects.addItemListener(this);
    }
    public void itemStateChanged(ItemEvent ie)
    {
        repaint();
    }
    public void paint(Graphics g)
    {

        if(year.getSelectedItem()=="1st year")
            subjects.select("C language");
        msg="Current year: ";

        if(year.getSelectedItem()=="2nd year")
            subjects.select("C++ language");
        msg="Current year: ";

        if(year.getSelectedItem()=="3rd year")
            subjects.select("java language");
        msg="Current year: ";

        if(year.getSelectedItem()=="4th year")
            subjects.select("Android studio");
        msg="Current year: ";

        msg+=year.getSelectedItem();
        g.drawString(msg,6,80);
        msg="current Subject: ";
        msg+=subjects.getSelectedItem();
        g.drawString(msg,6,120);
    }

}
