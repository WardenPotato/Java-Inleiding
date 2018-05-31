import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class praktijk extends Applet {
    TextField txtfInput;
    Button btnOk;
    int table;

    public void init() {
        setSize(400,400);
        txtfInput = new TextField("", 20);
        btnOk = new Button("Ok");

        txtfInput.addActionListener( new TekstvakListener() );
        btnOk.addActionListener( new ButtonListener() );

        add(txtfInput);
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
    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            table = Integer.parseInt(txtfInput.getText());
            txtfInput.setText("");
            repaint();
        }
    }
    class ButtonListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            table = Integer.parseInt(txtfInput.getText());
            txtfInput.setText("");
            repaint();
        }
    }
}