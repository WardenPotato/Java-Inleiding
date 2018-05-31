import java.awt.*;
import java.applet.*;

public class seven extends Applet {

    public void init() {
        setBackground(Color.blue);
        setSize(400, 400);
    }

    public void paint(Graphics g) {
        int spacing = 50;
        g.fillOval(40 - spacing, 150 + spacing, 20, 20);
        g.fillOval(40 - spacing, 130 - spacing, 20, 20);
        g.fillOval(60 + spacing, 150 + spacing, 20, 20);
        g.fillOval(60 + spacing, 130 - spacing, 20, 20);
        g.drawRoundRect(30 - (spacing * 2), 120 - (spacing * 2), 60 + (spacing * 4), 60 + (spacing * 4), 0, 0);
    }
}