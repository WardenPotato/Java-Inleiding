import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.util.Arrays;

public class three extends Applet {
    java.awt.TextField[] textFields;
    int count;
    double average;
    Button btnOk;

    public void init() {
        btnOk = new Button("Ok");
        btnOk.addActionListener( new ButtonListener() );
        add(btnOk);
        textFields = new TextField[4];
        setSize(400,400);
        for(int i = 0; i < textFields.length; i++){
            textFields[i] = new TextField();
        }
        for(TextField field : textFields){
            add(field);
        }
        repaint();
    }

    public void paint(Graphics g) {

    }

    class ButtonListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            for(TextField field : textFields){
                String original = field.getText();
                char[] chars = original.toCharArray();
                Arrays.sort(chars);
                String sorted = new String(chars);
                field.setText(sorted);
            }
            repaint();
        }
    }
}