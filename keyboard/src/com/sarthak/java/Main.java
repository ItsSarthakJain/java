package com.sarthak.java;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code="Main" width=300 height=100>
</applet>
*/
public class Main extends Applet implements KeyListener {
    String msg = "";
    int X = 10, Y = 20; // output coordinates

    public void init() {
        addKeyListener(this);
        requestFocus(); // request input focus
    }

    public void keyPressed(KeyEvent ke) {
        showStatus("Key Down");
    }

    public void keyReleased(KeyEvent ke) {
        showStatus("Key Up");
    }

    public void keyTyped(KeyEvent ke) {
        msg += ke.getKeyChar();
        repaint();
    }

    // Display keystrokes.
    public void paint(Graphics g) {
        g.drawString(msg, X, Y);
    }
}
