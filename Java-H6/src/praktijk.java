import java.awt.*;
import java.applet.*;
import java.lang.Math;

public class praktijk extends Applet {
    double grade1 = 5.9;
    double grade2 = 6.3;
    double grade3 = 6.9;
    double result = 0;

    public void init() {
        setSize(400, 400);
        result = ((double)((int)(((grade1 + grade2 + grade3) / 3) * 10))) / 10;
    }

    public void paint(Graphics g) {
        g.drawString("Gemiddelde: " + result, 20, 20);
    }
}

