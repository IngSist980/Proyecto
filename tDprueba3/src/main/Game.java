package main;

/**
 *
 * @author Ryan Morales.
 */
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.swing.JFrame;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class Game extends JFrame {

    private GameScreen gameScreen;

    private BufferedImage img;

    public Game() {

        importImg();

        setSize(640, 640);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
       
        gameScreen = new GameScreen(img);
        add(gameScreen);

    }

    private void importImg() {

        try {
            InputStream is = getClass().getResourceAsStream("/spriteatlas.png");
            if (is != null) { // verificar que el InputStream no sea nulo
                img = ImageIO.read(is);
            } else {
                System.err.println("Error al cargar la imagen: InputStream nulo.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        Game game = new Game();
    }
}
