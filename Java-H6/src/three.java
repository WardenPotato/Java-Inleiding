import java.awt.*;
import java.applet.*;


public class three extends Applet {
    int magic = 2147483647;
    int magic2 = 2;
    int result = 0;

    public void init() {
        setSize(400, 400);
        result = magic + magic2;
    }

    public void paint(Graphics g) {
        g.drawString("Value: " + result, 20, 20);
    }
}

