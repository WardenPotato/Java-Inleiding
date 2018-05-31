import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class three extends Applet {
    TextField txtfInput;
    String maand = "";
    String dagen = "";

    public void init() {
        txtfInput = new TextField("", 20);

        txtfInput.addActionListener( new TekstvakListener() );

        add(txtfInput);
    }

    public void paint(Graphics g) {
        g.drawString("Maand: " + maand, 50, 60 );
        g.drawString("Dagen: " + dagen, 50, 80 );
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = txtfInput.getText();
            int day = Integer.parseInt(s);
            switch(day) {
                case 1:
                    maand = "januari";
                    dagen = "31";
                    break;
                case 2:
                    maand = "februari";
                    dagen = "28";
                    break;
                case 3:
                    maand = "maart";
                    dagen = "31";
                    break;
                case 4:
                    maand = "april";
                    dagen = "30";
                    break;
                case 5:
                    maand = "mei";
                    dagen = "31";
                    break;
                case 6:
                    maand = "Juni";
                    dagen = "30";
                    break;
                case 7:
                    maand = "Juli";
                    dagen = "31";
                    break;
                case 8:
                    maand = "Augustus";
                    dagen = "31";
                    break;
                case 9:
                    maand = "September";
                    dagen = "30";
                    break;
                case 10:
                    maand = "Oktober";
                    dagen = "31";
                    break;
                case 11:
                    maand = "November";
                    dagen = "30";
                    break;
                case 12:
                    maand = "December";
                    dagen = "31";
                    break;
                default:
                    maand = "U hebt een verkeerd nummer ingetikt ..!";
                    break;
            }
            repaint();
        }
    }
}