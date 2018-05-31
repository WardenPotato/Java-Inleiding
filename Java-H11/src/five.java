import java.awt.*;
import java.applet.*;

public class five extends Applet {

    public void init() {
        setSize(400,400);

    }

    public void paint(Graphics g) {
        int y = 20;
        int x = 20;
        for(int i = 0; i <= 5; i++){
            g.drawRect(x, y, 20, 20);
            y += 20;
            x += 20;
        }
    }
}