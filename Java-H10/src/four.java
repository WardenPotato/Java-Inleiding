import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class four extends Applet {
    TextField txtfInput;
    TextField txtfInput2;
    String maand = "";
    String dagen = "";
    String jaar = "";

    public void init() {
        txtfInput = new TextField("", 20);
        txtfInput2 = new TextField("", 20);
        txtfInput.addActionListener( new TekstvakListener() );
        txtfInput2.addActionListener( new TekstvakListener() );

        add(txtfInput);
        add(txtfInput2);
    }

    public void paint(Graphics g) {
        g.drawString("Maand: " + maand, 50, 60 );
        g.drawString("Dagen: " + dagen, 50, 80 );
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int day = Integer.parseInt(txtfInput.getText());
            int jaartal = Integer.parseInt(txtfInput2.getText());
            if ( (jaartal % 4 == 0 && !(jaartal % 100 == 0)) || jaartal % 400 == 0 ){
                maand = "Februari";
                dagen = "29";
                repaint();
                return;
            }
            switch(day) {
                case 1:
                    maand = "Januari";
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
            txtfInput.setText("");
            txtfInput2.setText("");
            repaint();
        }
    }
}