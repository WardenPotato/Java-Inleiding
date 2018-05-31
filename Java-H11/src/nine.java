import java.awt.*;
import java.applet.*;

public class nine extends Applet {

    public void init() {
        setSize(800,800);

    }

    public void drawRow(java.awt.Graphics g, boolean startWhite, int y){
        boolean color = startWhite;
        int x = 20;
        int boxSize = 20;
        for(int i = 0; i <= 8; i++){
            if(color){
                g.setColor(Color.white);
                g.fillRect(x, y, boxSize, boxSize);
            }else {
                g.setColor(Color.BLACK);
                g.fillRect(x, y, boxSize, boxSize);
            }
            color = !color;
            x += 20;
        }
    }

    public void paint(Graphics g) {
        int y = 20;
        boolean color = true;
        for(int i = 0; i <= 8; i++){
            drawRow(g, color, y);
            y += 20;
            color = !color;
        }
    }
}