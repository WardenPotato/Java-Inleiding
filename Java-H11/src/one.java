import java.awt.*;
import java.applet.*;

public class one extends Applet {

    public void init() {
        setSize(400,400);
    }

    public void paint(Graphics g) {
        int x = 20;
        int y = 100;
        for(int i = 0; i < 10; i++){
           g.drawLine(x, y, x, 20);
           x += 10;
        }
    }
}