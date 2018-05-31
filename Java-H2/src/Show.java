import java.awt.*;
import java.applet.*;

public class Show extends Applet {

    private String naam = "Max";

    public void init() {
        setBackground(Color.blue);
    }

    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.drawString(naam, 50, 60 );
    }
}