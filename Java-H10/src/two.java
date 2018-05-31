import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class two extends Applet {
    TextField txtfInput;
    int highest = 0;
    int lowest = 0;
    boolean first = true;

    public void init() {
        txtfInput = new TextField("", 20);

        txtfInput.addActionListener( new TekstvakListener() );

        add(txtfInput);
    }

    public void paint(Graphics g) {
        g.drawString("Hoogste getal: " + highest, 50, 60 );
        g.drawString("Laagste getal: " + lowest, 50, 80 );
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int out = Integer.parseInt(txtfInput.getText());
            if (first){
                first = false;
                lowest = out;
            }
            if (out > highest){
                highest = out;
            }
            if (out < lowest){
                lowest = out;
            }
            txtfInput.setText("");
            repaint();
        }
    }
}