import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class praktijk extends Applet {
    TextField txtfInput;
    TextField txtfInput2;
    Button btnTimes;
    Button btnDivide;
    Button btnPlus;
    Button btnMinus;
    Double result = 0.0;

    public void init() {
        txtfInput = new TextField("", 20);
        txtfInput2 = new TextField("", 20);
        btnTimes = new Button("*");
        btnDivide = new Button("/");
        btnPlus = new Button("+");
        btnMinus = new Button("-");

        btnTimes.addActionListener( new ButtonListener() );
        btnDivide.addActionListener( new ButtonListener2() );
        btnPlus.addActionListener( new ButtonListener3() );
        btnMinus.addActionListener( new ButtonListener4() );

        add(txtfInput);
        add(txtfInput2);
        add(btnTimes);
        add(btnDivide);
        add(btnPlus);
        add(btnMinus);
    }

    public void paint(Graphics g) {
        g.drawString("Antwoord: " + result, 50, 60 );
    }

    class ButtonListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            result = Double.parseDouble(txtfInput.getText()) * Double.parseDouble(txtfInput2.getText());
            txtfInput.setText(Double.toString(result));
            txtfInput2.setText("");
            repaint();
        }
    }
    class ButtonListener2 implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            result = Double.parseDouble(txtfInput.getText()) / Double.parseDouble(txtfInput2.getText());
            txtfInput.setText(Double.toString(result));
            txtfInput2.setText("");
            repaint();
        }
    }
    class ButtonListener3 implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            result = Double.parseDouble(txtfInput.getText()) + Double.parseDouble(txtfInput2.getText());
            txtfInput.setText(Double.toString(result));
            txtfInput2.setText("");
            repaint();
        }
    }
    class ButtonListener4 implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            result = Double.parseDouble(txtfInput.getText()) - Double.parseDouble(txtfInput2.getText());
            txtfInput.setText(Double.toString(result));
            txtfInput2.setText("");
            repaint();
        }
    }
}