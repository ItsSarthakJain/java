package com.sarthak.java;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code="Main" height=300 width=300>
</applet>
*/

public class Main extends Applet implements ActionListener {

    String msg = "";
    Button b1, b2, b3;

    public void init() {

        b1 = new Button("yes");
        b2 = new Button("No");
        b3 = new Button("Undefined");

        add(b1);
        add(b2);
        add(b3);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource()==b1)
            msg = "yes is clicked";
        else if (ae.getSource()==b2)
            msg = "you pressed no";
        else
            msg = "you pressed undefined";
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString(msg, 6, 100);
    }
}