import java.awt.*;
import java.applet.*;

public class one extends Applet {

    public void init() {
        setBackground(Color.white);
        setSize(400, 300);
    }

    public void paint(Graphics g) {
        g.drawLine(100, 120, 180, 120);
        g.drawLine(100, 120, 140, 20);
        g.drawLine(180, 120, 140, 20);
    }
}