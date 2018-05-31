import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class three extends Applet {
    TextField txtfInput;
    Label lblTextField;
    Button btnOk;
    Double result = 0.0;

    public void init() {
        lblTextField = new Label("Voer iets in: ");
        txtfInput = new TextField("", 20);
        btnOk = new Button("Ok");
        btnOk.addActionListener( new ButtonListener() );
        txtfInput.addActionListener( new TekstvakListener() );
        add(lblTextField);
        add(txtfInput);
        add(btnOk);
    }

    public void paint(Graphics g) {
        g.drawString("Met BTW: " + ((result / 100 * 21) + result), 50, 60 );
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            result = Double.parseDouble(txtfInput.getText());
            repaint();
        }
    }
    class ButtonListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            result = Double.parseDouble(txtfInput.getText());
            repaint();
        }
    }
}