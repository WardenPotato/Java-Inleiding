import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.util.ArrayList;

public class five extends Applet {
    TextField txtfInput;
    Button btnOk;
    int count;
    Double average;
    String passed;

    ArrayList<Double> cijfers = new ArrayList<Double>();
    public void init() {
        setSize(400,400);
        txtfInput = new TextField("", 20);
        txtfInput.addActionListener( new TekstvakListener() );

        btnOk = new Button("Ok");
        btnOk.addActionListener( new ButtonListener() );

        add(txtfInput);
        add(btnOk);
    }

    public void paint(Graphics g) {
        g.drawString("Aantal cijfers: " + count, 50, 60 );
        g.drawString("Gemiddelde: " + average, 50, 80 );
        g.drawString("Beoordeling: " + passed, 50, 100);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double cijfer = Double.parseDouble(txtfInput.getText());
            cijfers.add(cijfer);
            txtfInput.setText("");
            repaint();
        }
    }
    class ButtonListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            count = 0;
            double result = 0.0;
            for(Double cijfer : cijfers){
                count++;
                result += cijfer;
                System.out.println(result);
            }
            average = (result / count);
            if(average < 5.5){
                passed = "Gefaald";
            }else{
                passed = "Geslaagd";
            }
            repaint();
        }
    }
}