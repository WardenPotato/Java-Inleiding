import java.awt.*;
import java.applet.*;

public class seven extends Applet {

    public void init() {
        setSize(800,800);

    }

    public void paint(Graphics g) {
        int width = 20;
        int height = 20;
        int x = 300;
        int y = 300;
        for(int i = 0; i <= 50; i++){
            g.drawOval(x, y, width, height);
            width += 10;
            height += 10;
            x -= 5;
            y -= 5;
        }
    }
}