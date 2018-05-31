import java.awt.*;
import java.applet.*;


public class two extends Applet {
    double secondsInHour = 0;
    double secondsInDay = 0;
    double secondsInYear = 0;

    public void init() {
        setSize(400, 400);
        secondsInHour = 60 * 60;
        secondsInDay = 24 * 60 * 60;
        secondsInYear = 365 * 24 * 60 *60;
    }

    public void paint(Graphics g) {
        g.drawString("Hour: " + secondsInHour, 20, 20);
        g.drawString("Day: " + secondsInDay, 20, 40);
        g.drawString("year: " + secondsInYear, 20, 60);
    }
}