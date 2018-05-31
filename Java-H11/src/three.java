import java.awt.*;
import java.applet.*;

public class three extends Applet {

    public void init() {
        setSize(400,400);
        int last = 1;
        int lastlast = 0;
        int result;
        System.out.println(1);
        for(int i = 0; i < 40; i++){
            result = (last + lastlast);
            lastlast = last;
            last = result;
            System.out.println(result);
        }
    }

    public void paint(Graphics g) {

    }
}