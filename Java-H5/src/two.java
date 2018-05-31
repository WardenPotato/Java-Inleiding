import java.awt.*;
import java.applet.*;

public class two extends Applet {

    public void init() {
        setBackground(Color.white);
        setSize(400, 400);
    }

    private int yHeight(int height, int y){
        return y - height;
    }

    private void graphNumber(int value, int x, int y, java.awt.Graphics graphic){
        graphic.drawString(Integer.toString(value), x, y - value);
        graphic.drawLine(x, y - value, y, y - value);
    }

    public void paint(Graphics g) {
        graphNumber(0, 10, 150, g);
        graphNumber(20, 10, 150, g);
        graphNumber(40, 10, 150, g);
        graphNumber(60, 10, 150, g);
        graphNumber(80, 10, 150, g);
        graphNumber(100, 10, 150, g);

        int height1 = 10;
        int height2 = 50;
        int height3 = 60;

        g.setColor(Color.red);
        g.fillRect(40, yHeight(height1, 150), 20, height1);
        g.drawString("Valerie", 40 - 10, 150 + 20);
        g.setColor(Color.black);
        g.fillRect(80, yHeight(height2, 150), 20, height2);
        g.drawString("Jeroen", 80 - 10, 150 + 20);
        g.setColor(Color.green);
        g.fillRect(120, yHeight(height3, 150), 20, height3);
        g.drawString("Hans", 120 - 5, 150 + 20);
    }
}