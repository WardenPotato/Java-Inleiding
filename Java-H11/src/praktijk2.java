import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class praktijk2 extends Applet {
    Button btnOk;
    int table = 1;

    public void init() {
        setSize(400,400);
        btnOk = new Button("Ok");

        btnOk.addActionListener( new ButtonListener() );

        add(btnOk);
    }

    public void tafels(java.awt.Graphics g, int tafel){
        int y = 60;
        for(int i = 0; i <= 10; i++){
            String msg = tafel + " x " + i + " = " + Integer.toString(tafel * i);
            g.drawString(msg, 20, y);
            y += 20;
        }
    }

    public void paint(Graphics g) {
        tafels(g, table);
    }

    class ButtonListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            if(table < 10) {
                table++;
            }else {
                table = 1;
            }
            repaint();
        }
    }
}