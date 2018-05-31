import java.awt.*;
import java.applet.*;

public class two extends Applet {
    java.awt.Button[] knoppen;
    int count;
    double average;

    public void init() {
        knoppen = new Button[24];
        setSize(400,400);
        for(int i = 0; i < knoppen.length; i++){
            knoppen[i] = new Button("Ok");
        }
        for(java.awt.Button knop : knoppen){
            add(knop);
        }
        repaint();
    }

    public void paint(Graphics g) {

    }
}