import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class one extends Applet {

    public void init() {
        setSize(400,400);

    }

    void tekenDriehoek( Graphics g, int x1, int y1, int x2, int y2, int x3, int y3){
        g.drawLine(x1, y1, x2, y2);
        g.drawLine(x1, y1, x3, y3);
        g.drawLine(x2, y2, x3, y3);
    }

    public void paint(Graphics g) {
        tekenDriehoek(g, 80, 120, 180, 120, 140, 20);
    }
}