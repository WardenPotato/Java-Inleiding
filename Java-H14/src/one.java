import java.awt.*;
import java.applet.*;

public class one extends Applet {
    public String[] soorten = {"Schoppen", "Harten", "Ruiten", "Klaver"};
    public String[] subsoorten = {"Een", "Twee", "Drie", "Vier", "Vijf", "Zes", "Zeven", "Acht", "Negen", "Tien", "Boer", "Vrouw", "Koning", "Aas"};

    public void init() {
        setSize(400,400);
    }

    public String randomKaart(){
        double r = Math.random();
        int rand = (int)(r * 14);

        double r1 = Math.random();
        int rand1 = (int)(r * 4);

        return soorten[rand1] + " " + subsoorten[rand];
    }

    public void paint(Graphics g) {
        g.drawString(randomKaart(), 50, 50);
    }
}