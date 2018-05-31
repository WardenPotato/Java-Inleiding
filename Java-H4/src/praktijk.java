import java.awt.*;
import java.applet.*;

public class praktijk extends Applet {

    public void init() {
        setBackground(Color.white);
        setSize(1000, 800);
    }

    public void paint(Graphics g) {
    g.drawLine(10, 20, 110, 20);
    g.drawString("Lijn",50, 40);

    g.drawRect(10, 70, 200, 100);
    g.drawString("Rechthoek", 50, 190);

    g.drawRoundRect(10, 210, 200, 100, 30, 30);
    g.drawString("Afgeronde rechthoek", 50, 330);

    g.setColor(Color.magenta);
    g.fillRect(230, 70, 200, 100);
    g.setColor(Color.black);
    g.drawOval(230, 70, 200, 100);
    g.drawString("Gevulde rechthoek met ovaal", 250, 190);

    g.setColor(Color.magenta);
    g.fillOval(230, 210, 200, 100);
    g.setColor(Color.black);
    g.drawString("Gevulde ovaal", 280, 330);

    g.setColor(Color.magenta);
    g.fillArc(450, 70, 200, 100, 0, 45);
    g.setColor(Color.black);
    g.drawOval(450, 70, 200, 100);
    g.drawString("Taartpunt met ovaal eromheen",450, 190);

    g.drawOval(500, 210, 100, 100);
    g.drawString("Cirkel", 530, 330);
    }
}