import java.awt.*;
import java.applet.*;

public class three extends Applet {

    public void init() {
        setBackground(Color.white);
        setSize(400, 400);
    }

    public void paint(Graphics g) {
        g.fillRect(20, 50, 20, 250);
        g.setColor(Color.red);
        g.fillRect(40, 50, 300, 50);
        g.setColor(Color.white);
        g.fillRect(40, 100, 300, 50);
        g.setColor(Color.blue);
        g.fillRect(40, 150, 300, 50);
    }
}