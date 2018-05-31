import java.awt.*;
import java.applet.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.net.URL;

public class two extends Applet {
    public String[] subsoorten = {"Een", "Twee", "Drie", "Vier", "Vijf", "Zes", "Zeven", "Acht", "Negen", "Tien", "Boer", "Vrouw", "Koning", "Aas"};
    List<String> deck = new ArrayList<String>();
    public String[] fullDeck = new String[52];
    List<String> deckplayer1 = new ArrayList<String>();
    List<String> deckplayer2 = new ArrayList<String>();
    List<String> deckplayer3 = new ArrayList<String>();
    List<String> deckplayer4 = new ArrayList<String>();
    //private URL pad;
    private AudioClip sound;

    public void init() {
        setSize(400,400);
        kaarten();
        for(int i = 0; i < 13; i++){
            deckplayer1.add(deelKaart());
        }
        for(int i = 0; i < 13; i++){
            deckplayer2.add(deelKaart());
        }
        for(int i = 0; i < 13; i++){
            deckplayer3.add(deelKaart());
        }
        for(int i = 0; i < 13; i++){
            deckplayer4.add(deelKaart());
        }
        //pad = two.class.getResource("resources/");
        sound = getAudioClip(getDocumentBase(), "scream1.wav");
    }

    public void kaarten(){
        for(String kaart : subsoorten){
            deck.add("Schoppen " + kaart);
            deck.add("Klaver " + kaart);
            deck.add("Harten " + kaart);
            deck.add("Ruiten " + kaart);
        }
        deck.toArray(fullDeck);
        String[] fullDeck1 = deck.toArray(new String[deck.size()]);
        fullDeck = fullDeck1;
    }

    private String deelKaart() {
        int random = new Random().nextInt(fullDeck.length);
        String kaart = fullDeck[random];

        //vervang de inhoud van deck
        String[] hulpLijst = new String[fullDeck.length - 1];
        int hulpindex = 0;
        for (int i = 0; i < fullDeck.length; i++) {
            if (i != random) {
                hulpLijst[hulpindex] = fullDeck[i];
                hulpindex++;
            }
        }
        fullDeck = hulpLijst;
        return kaart;
    }

    public void paint(Graphics g) {
        int count = 0;
        for(String kaart : deckplayer1){
            g.drawString(kaart, 0, 20 + (20 * count));
            count++;
        }
        count = 0;
        for(String kaart : deckplayer2){
            g.drawString(kaart, 100, 20 + (20 * count));
            count++;
        }
        count = 0;
        for(String kaart : deckplayer3){
            g.drawString(kaart, 200, 20 + (20 * count));
            count++;
        }
        count = 0;
        for(String kaart : deckplayer4){
            g.drawString(kaart, 300, 20 + (20 * count));
            count++;
        }
        sound.play();
    }
}