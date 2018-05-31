import java.awt.*;
import java.applet.*;

public class one extends Applet {
    Integer[] getallen = {1,15,13,13,14,15,3,4,6,7,8};
    int count;
    double average;

    public void init() {
        setSize(400,400);

        repaint();
    }

    public void paint(Graphics g) {
        int x = 20;
        int y = 20;
        count = 0;
        double result = 0.0;
        for(Integer cijfer : getallen){
            g.drawString(Integer.toString(cijfer), x, y);
            y += 20;
            count++;
            result += cijfer;
        }
        average = (result / count);
        average = ((double)((int)(average * 10))) / 10;
        g.drawString("Average: " + average, x, y);
    }
}