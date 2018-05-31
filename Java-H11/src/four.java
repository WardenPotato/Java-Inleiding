import java.awt.*;
import java.applet.*;

public class four extends Applet {

    public void init() {
        setSize(400,400);

    }

    public void paint(Graphics g) {
        int y = 20;
        int tafel = 3;
        for(int i = 0; i <= 10; i++){
            g.drawString(Integer.toString(tafel * i), 20, y);
            y += 20;
        }
    }
}