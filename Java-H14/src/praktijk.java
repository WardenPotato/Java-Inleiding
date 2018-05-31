import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class praktijk extends Applet {
    public int smileys = 23;
    Button btnSubmit;
    TextField txtfAmount;
    public boolean drawResult = false;
    public boolean won = false;
    public boolean drawComputer = false;
    public int removed = 0;

    public void init() {
        setSize(400,400);

        btnSubmit = new Button("Play");
        txtfAmount = new TextField(20);

        btnSubmit.addActionListener( new PlayListener() );

        add(txtfAmount);
        add(btnSubmit);
    }

    public void drawSmileys(Graphics g ,int Amount){
        int x = 0;
        int y = 40;
        int xStepsize = 40;
        int yStepsize = 40;
        int count = 0;
        for(int i = 0; i < Amount; i++ ){
            if((i % 4) == 0){ y += yStepsize; x = 20; count = 0;}
            count++;
            g.fillRect(x + (xStepsize * count), y, 20, 20);
        }
    }

    public void setMove(int amount){
        smileys -= amount;
        if(smileys <= 0){
            drawResult = true;
            won = false;
            repaint();
        }else {
            computerMove();
        }
    }

    public void computerMove(){
        drawComputer = true;
        switch (smileys % 4){
            case 1:
                removed = 1;
                smileys -= 1;
                break;
            case 0:
                removed = 3;
                smileys -= 3;
                break;
            case 3:
                removed = 2;
                smileys -= 2;
                break;
            case 2:
                removed = 1;
                smileys -= 1;
                break;
        }
        if(smileys <= 0){
            drawResult = true;
            drawComputer = false;
            won = true;
            repaint();
        }
    }

    public void paint(Graphics g) {
        drawSmileys(g, smileys);
        if (drawResult){
            if (won){
                g.drawString("You won", 20, 20);
            }else{
                g.drawString("You lose", 20, 20);
            }
        }
        if(smileys >= 1) {
            g.drawString("Smileys left: " + smileys, 20, 40);
        }
        if(drawComputer && smileys >= 1) {
            g.drawString("Your opponent has removed: " + removed + " smileys", 20, 60);
        }
    }

    class PlayListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            setMove(Integer.parseInt(txtfAmount.getText()));
            repaint();
        }
    }
}