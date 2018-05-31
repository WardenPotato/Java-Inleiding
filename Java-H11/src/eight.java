import java.awt.*;
import java.applet.*;

public class eight extends Applet {

    public void init() {
        setSize(800,800);

    }

    public void paint(Graphics g) {
        int width = 20;
        int height = 20;
        for(int i = 0; i <= 100; i++){
            g.drawOval(200, 200, width, height);
            width += 5;
            height += 5;
        }
    }
}