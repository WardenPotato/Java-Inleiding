import java.awt.*;
import java.applet.*;

public class two extends Applet {

    public void init() {
        setSize(400,400);
    }

    public void paint(Graphics g) {
        int y = 20;
        for(int i = 20; i >= 10; i--){
            g.drawString(Integer.toString(i), 20, y);
            y += 10;
        }
    }
}