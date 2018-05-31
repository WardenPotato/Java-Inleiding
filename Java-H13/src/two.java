import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class two extends Applet {

    public void init() {
        setSize(400,400);

    }

    public void drawRow(java.awt.Graphics g, boolean startWhite){
        boolean color = startWhite;
        int y = 0;
        for(int i = 0; i <= 20; i++) {

            int x = 0;
            int boxSize = 20;
            for (int i1 = 0; i1 <= 20; i1++) {
                if (color) {
                    g.setColor(Color.red);
                    g.fillRect(x, y, boxSize * 2, boxSize);
                } else {
                    g.setColor(new Color(200, 108, 64));
                    g.fillRect(x, y, boxSize * 2, boxSize);
                }
                color = !color;
                x += 40;
            }

            y += 20;
        }
    }

    public void paint(Graphics g) {
        boolean color = true;
        drawRow(g, color);

    }
}