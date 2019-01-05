import java.awt.*;
import java.applet.*;
/*
<applet code="myapplet5" width=300 height=300>
</applet>
 */
class Applet1 extends Applet {
    Color c1,c2,c3;
    Font f1;
    public void init()
    {
        c1=new Color(100,100,100);
        c2=new Color(200,200,200);
        c3=new Color(250,250,250);
        f1=new Font("helventica",Font.BOLD+Font.ITALIC,40);
        setBackground(c1);
    }
    public void paint(Graphics g)
    {
        g.setFont(f1);
        g.setColor(c2);
        g.drawString("welcome",100,100);
        g.setColor(Color.cyan);
        g.drawString("hello",150,150);
    }
}
