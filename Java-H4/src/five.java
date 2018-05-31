import java.awt.*;
import java.applet.*;

public class five extends Applet {

    public void init() {
        setBackground(Color.blue);
        setSize(400, 400);
    }

    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.fillArc(100, 80, 100, 120, 0, 360);
    }
}