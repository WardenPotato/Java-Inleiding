import java.awt.*;
import java.applet.*;

public class six extends Applet {

    public void init() {
        setSize(400,400);

    }

    public void paint(Graphics g) {
        int width = 20;
        int height = 20;
        int x = 30;
        int y = 30;
        for(int i = 0; i <= 5; i++){
            g.drawOval(x, y, width, height);
            width += 10;
            height += 10;
            x -= 5;
            y -= 5;
        }
    }
}