import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class three extends Applet {
    Button btnRed;
    Button btnGray;
    boolean gray = false;
    boolean red = false;

    public void init() {
        setSize(400,400);
        btnRed = new Button("Red");
        btnGray = new Button("Gray");

        btnRed.addActionListener( new ButtonListener() );
        btnGray.addActionListener( new ButtonListener2() );

        add(btnRed);
        add(btnGray);
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
    public void drawConcrete(java.awt.Graphics g, boolean startWhite){
        boolean color = startWhite;
        int y = 0;
        for(int i = 0; i <= 20; i++) {

            int x = 0;
            int boxSize = 20;
            for (int i1 = 0; i1 <= 20; i1++) {
                if (color) {
                    g.setColor(Color.lightGray);
                    g.fillRect(x, y, boxSize * 3, boxSize);
                } else {
                    g.setColor(new Color(128, 128, 128));
                    g.fillRect(x, y, boxSize * 3, boxSize);
                }
                color = !color;
                x += 60;
            }

            y += 20;
        }
    }

    public void paint(Graphics g) {
        boolean color = true;
        if(red == true) {
            drawRow(g, true);
        }
        if(gray == true){
            drawConcrete(g, true);
        }

    }
    class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            red = true;
            repaint();
        }
    }
    class ButtonListener2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            gray = true;
            repaint();
        }
    }
}