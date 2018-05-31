import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class one extends Applet {
    TextField txtfInput;
    int highest = 0;

    public void init() {
        txtfInput = new TextField("", 20);

        txtfInput.addActionListener( new TekstvakListener() );

        add(txtfInput);
    }

    public void paint(Graphics g) {
        g.drawString("Hoogste getal: " + highest, 50, 60 );
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int out = Integer.parseInt(txtfInput.getText());
            if (out > highest){
                highest = out;
            }
            txtfInput.setText("");
            repaint();
        }
    }
}