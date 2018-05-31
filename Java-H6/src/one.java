import java.awt.*;
import java.applet.*;


public class one extends Applet {
    double money = 113;
    double cut = 0;

    public void init() {
        setSize(400, 400);
        cut = money / 4;
    }

    public void paint(Graphics g) {
        g.drawString("Jan: " + cut, 20, 20);
        g.drawString("Ali: " + cut, 20, 40);
        g.drawString("Jeannette: " + cut, 20, 60);
        g.drawString("Max: " + cut, 20, 80);
    }
}