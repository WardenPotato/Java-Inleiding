import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.util.ArrayList;

public class praktijk extends Applet {
    TextField txtfInput;
    Button btnOk;
    int count;
    Double average = 0.0;
    String passed = "N/A";
    //Label lblGrade;
    String gradeCijfer = "N/A";

    ArrayList<Integer> cijfers = new ArrayList<Integer>();
    public void init() {
        setSize(400,500);
        txtfInput = new TextField("", 20);
        txtfInput.addActionListener( new TekstvakListener() );

        //lblGrade = new Label();

        btnOk = new Button("Ok");
        btnOk.addActionListener( new ButtonListener() );

        add(txtfInput);
        add(btnOk);
        //add(lblGrade);
    }

    public void paint(Graphics g) {
        g.drawString( gradeCijfer, 50, 40);
        g.drawString("Aantal cijfers: " + count, 50, 60 );
        g.drawString("Gemiddelde: " + average, 50, 80 );
        g.drawString("Beoordeling: " + passed, 50, 100);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int cijfer;
            try{
                cijfer = Integer.parseInt(txtfInput.getText());
            }catch (Exception excp){
                gradeCijfer = "Ongeldig getal";
                txtfInput.setText("");
                repaint();
                return;
            }

            if(cijfer >= 1 && cijfer <= 10){
                switch (cijfer){
                    case 1:
                    case 2:
                    case 3:
                        gradeCijfer = "Slecht";
                        break;
                    case 4:
                        gradeCijfer = "Onvoldoende";
                        break;
                    case 5:
                        gradeCijfer = "Matig";
                        break;
                    case 6:
                    case 7:
                        gradeCijfer = "Voldoende";
                        break;
                    case 8:
                    case 9:
                    case 10:
                        gradeCijfer = "Goed";
                        break;
                    default:
                        gradeCijfer = "Ongeldig getal";

                }
                cijfers.add(cijfer);
            }else {
                gradeCijfer = "Ongeldig getal";
            }
            txtfInput.setText("");
            repaint();
        }
    }
    class ButtonListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            count = 0;
            double result = 0.0;
            for(Integer cijfer : cijfers){
                count++;
                result += cijfer;
            }
            average = (result / count);
            average = ((double)((int)(average * 10))) / 10;
            if(average < 5.5){
                passed = "Gefaald";
            }else{
                passed = "Geslaagd";
            }
            repaint();
        }
    }
}