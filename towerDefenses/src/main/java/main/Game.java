package main;

import java.awt.EventQueue;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.imageio.*;

/**
 *
 * @author R
 */
public class Game extends JFrame {

    private GameScreen gameScreen;
    private BufferedImage img;

    public Game() {

        importImg();

        setSize(640, 640);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        gameScreen = new GameScreen(img);
        //gameScreen.setImg(img);
        add(gameScreen);

    }

        private void importImg() {

        InputStream is = getClass().getResourceAsStream("/spriteatlas");

       /* try {
            img = ImageIO.read(is);
        } catch (IOException e) {
            e.printStackTrace();
        }*/

    } 

    public static void main(String[] args) {

        Game game = new Game();

    }

}
