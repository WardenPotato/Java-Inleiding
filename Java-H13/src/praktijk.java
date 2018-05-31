import java.awt.*;
import java.applet.*;

public class praktijk extends Applet {


    public void init() {
        setSize(400,400);
    }

    public void drawTree(java.awt.Graphics g, int x, int y){
        g.setColor(new Color(139,69,19));
        g.fillRect(x, y, 20, 120);
        g.setColor(Color.green);
        g.fillOval(x - 40, y - 40, 100, 100);
    }


    public void paint(Graphics g) {
        int x = 0;
        int y = 0;
        for(int i = 0; i < 2; i++){
            for(int b = 0; b < 5; b++){
                drawTree(g, x, y);
                x += 40;
            }
            y += 80;
        }
    }
}