import java.awt.*;
import java.applet.*;

public class two extends Applet {

    public void init() {
        setBackground(Color.white);
        setSize(400, 300);
    }

    public void paint(Graphics g) {
        //Roof
        g.drawLine(90, 90, 140, 20);
        g.drawLine(190, 90, 140, 20);
        //Main body
        g.drawRect(90,90,100,100);
        //Door
        g.drawRect(130,150,20,40);
        //Window
        g.drawRect(100,150,20,20);
    }
}