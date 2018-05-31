import java.awt.*;
import java.applet.*;

public class six extends Applet {

    public void init() {
        setBackground(Color.blue);
        setSize(600, 800);
    }

    public void paint(Graphics g) {
        g.fillRect(150, 110, 200, 550);
        g.setColor(Color.red);
        g.fillOval(175, 130, 150, 150);
        g.setColor(Color.orange);
        g.fillOval(175, 300, 150, 150);
        g.setColor(Color.green);
        g.fillOval(175, 470, 150, 150);
    }
}