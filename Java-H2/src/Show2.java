import java.awt.*;
import java.applet.*;

public class Show2 extends Applet {

    private String roepNaam = "Max";
    private String achterNaam = "Krul";

    public void init() {
        setBackground(Color.white);
    }

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString(roepNaam, 50, 60 );
        g.setColor(Color.red);
        g.drawString(achterNaam, 50, 70 );
    }
}