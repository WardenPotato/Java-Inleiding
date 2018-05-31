import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class one extends Applet {
    TextField txtfInput;
    Label lblTextField;
    Button btnOk;
    Button btnReset;
    String result;
    public void init() {
        lblTextField = new Label("Voer iets in: ");
        txtfInput = new TextField("", 20);
        btnOk = new Button("Ok");
        btnReset = new Button("Reset");
        btnReset.addActionListener( new ButtonListener() );
        btnOk.addActionListener( new ButtonListener2() );
        txtfInput.addActionListener( new TekstvakListener() );
        add(lblTextField);
        add(txtfInput);
        add(btnOk);
        add(btnReset);
    }

    public void paint(Graphics g) {
        g.drawString("Result: " + result, 50, 60 );
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            result = txtfInput.getText();
            repaint();
        }
    }
    class ButtonListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            txtfInput.setText("");
            repaint();
        }
    }
    class ButtonListener2 implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            result = txtfInput.getText();
            repaint();
        }
    }
}