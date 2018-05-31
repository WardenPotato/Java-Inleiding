import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class six extends Applet {
    Integer[] getallen = {1,15,13,13,14,15,3,4,6,7,8};
    int count;
    int search;
    TextField txtfInput;
    Button btnOk;
    String result = "";

    public void init() {
        setSize(400,400);
        txtfInput = new TextField();
        btnOk = new Button("Ok");

        btnOk.addActionListener( new ButtonListener() );

        add(txtfInput);
        add(btnOk);
    }

    public void paint(Graphics g) {
        g.drawString(result, 50, 50);
    }
    class ButtonListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            count = 0;
            int found = 0;
            search = Integer.parseInt(txtfInput.getText());
            for(Integer cijfer : getallen){
                if(cijfer == search){
                    found++;
                }
                count++;
            }
            if(found > 0){
                result = "Found " + search + "  " + found + " Times.";
            }else{
                result = "";
            }
            repaint();
        }
    }
}