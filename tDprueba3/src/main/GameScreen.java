package main;

import inputs.KeyboardListener;
import inputs.MyMouseListener;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.security.SecureRandom;
import javax.crypto.spec.PSource;

/**
 *
 * author Ryan Morales.
 */
public class GameScreen extends JPanel {

    private SecureRandom random;
    private Game game;
    private Dimension size;

    private MyMouseListener myMouseListener;
    private KeyboardListener keyboardListener;

    public GameScreen(Game game) {
        this.game = game;

        setPanelSize();
    }

       public void initIputs() {
        myMouseListener = new MyMouseListener(game);

        keyboardListener = new KeyboardListener();

        addMouseListener(myMouseListener);
        addMouseMotionListener(myMouseListener);
        addKeyListener(keyboardListener);

        //Dirige la interacción del jugador con la pantalla: 
        requestFocus();

    }

    private void setPanelSize() {
        size = new Dimension(640, 640);
        setMaximumSize(size);
        setPreferredSize(size);
        setMaximumSize(size);

    }
    //Las dimensiones de la imagen del juego: 

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        game.getRender().render(g);

    }

    private Color getRndColor() {
        int r = random.nextInt(256);
        int g = random.nextInt(256);
        int b = random.nextInt(256);

        return new Color(r, g, b);
    }
}
