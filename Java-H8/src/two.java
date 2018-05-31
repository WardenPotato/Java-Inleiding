import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class two extends Applet {
    Button btnMen;
    Button btnWomen;
    Button btnBoy;
    Button btnGirl;

    int countMen = 0;
    int countWomen = 0;
    int countBoy = 0;
    int countGirl = 0;

    public void init() {
        btnMen = new Button("Man");
        btnWomen = new Button("Vrouw");
        btnBoy = new Button("LL Man");
        btnGirl = new Button("LL Vrouw");

        btnMen.addActionListener( new ButtonListener() );
        btnWomen.addActionListener( new ButtonListener2() );
        btnBoy.addActionListener( new ButtonListener3() );
        btnGirl.addActionListener( new ButtonListener4() );

        add(btnMen);
        add(btnWomen);
        add(btnBoy);
        add(btnGirl);
    }

    public void paint(Graphics g) {
        g.drawString("Mannen: " + countMen, 50, 60 );
        g.drawString("Vrouwen: " + countWomen, 50, 80 );
        g.drawString("Potentiele Mannen: " + countBoy, 50, 100 );
        g.drawString("Potentiele Vrouwen: " + countGirl, 50, 120 );
        g.drawString("Totaal: " + (countMen + countWomen + countBoy + countGirl), 50, 140);
    }
    class ButtonListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            countMen++;
            repaint();
        }
    }
    class ButtonListener2 implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            countWomen++;
            repaint();
        }
    }
    class ButtonListener3 implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            countBoy++;
            repaint();
        }
    }
    class ButtonListener4 implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            countGirl++;
            repaint();
        }
    }
}