import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class praktijk extends Applet {
    String[] tel = {};
    String[] naam = {};
    int count;
    int search;
    TextField txtfInput;
    TextField txtfInput2;
    Button btnOk;
    String result = "Telefoons: ";
    String result2 = "Namen: ";

    public void init() {
        setSize(400,400);
        tel = new String[9];
        naam = new String[9];
        txtfInput = new TextField();
        txtfInput2 = new TextField();
        btnOk = new Button("Ok");

        btnOk.addActionListener( new ButtonListener() );

        add(txtfInput);
        add(txtfInput2);
        add(btnOk);
    }

    public void paint(Graphics g) {
        g.drawString(result, 50, 50);
        g.drawString(result2, 50, 80);
    }
    class ButtonListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            if(count < 9){
                tel[count] = txtfInput.getText();
                naam[count] = txtfInput2.getText();
                count++;
            }else{
                for(String telefoon : tel){
                    result = result + " " + telefoon;
                }
                for(String name : naam){
                    result2 = result2 + " " + name;
                }
                repaint();
            }
        }
    }
}