package com.sarthak.java;
import java.awt.*;
import java.applet.*;
/*
<applet code="Main" width=300 height=200>
</applet>
*/
public class Main extends Applet {
    public void init() {
        Label one = new Label("One");
        Label two = new Label("Two");
        Label three = new Label("Three");
// add labels to applet window
        add(one);
        add(two);
        add(three);
    }
}
