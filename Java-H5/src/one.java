import java.awt.*;
import java.applet.*;

public class one extends Applet {

    public void init() {
        setBackground(Color.white);
        setSize(1000, 800);
    }

    public void paint(Graphics g) {
        int height1 = 100;
        int width1 = 200;
        g.drawLine(10, 20, 10 + width1, 20);
        g.drawString("Lijn",50, 40);

        g.drawRect(10, 70, width1, height1);
        g.drawString("Rechthoek", 50, 190);

        g.drawRoundRect(10, 210, width1, height1, 30, 30);
        g.drawString("Afgeronde rechthoek", 50, 330);

        g.setColor(Color.magenta);
        g.fillRect(230, 70, width1, height1);
        g.setColor(Color.black);
        g.drawOval(230, 70, width1, height1);
        g.drawString("Gevulde rechthoek met ovaal", 250, 190);

        g.setColor(Color.magenta);
        g.fillOval(230, 210, width1, height1);
        g.setColor(Color.black);
        g.drawString("Gevulde ovaal", 280, 330);

        g.setColor(Color.magenta);
        g.fillArc(450, 70, width1, height1, 0, 45);
        g.setColor(Color.black);
        g.drawOval(450, 70, width1, height1);
        g.drawString("Taartpunt met ovaal eromheen",450, 190);

        g.drawOval(500, 210, 100, 100);
        g.drawString("Cirkel", 530, 330);
    }
}