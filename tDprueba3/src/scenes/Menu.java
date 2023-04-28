package scenes;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.security.SecureRandom;
import javax.imageio.ImageIO;

import main.Game;
import ui.MyButton;

/**
 *
 * @author Ryan Morales.
 */
public class Menu extends GameScene implements SceneMethods {

    private BufferedImage img;
    private BufferedImage[] sprites = new BufferedImage[100];
    private SecureRandom random;
    private MyButton bPlaying, bSettings, bQuit; 

    public Menu(Game game) {
        super(game);
        importImg();
        loadSprites();
        random = new SecureRandom();
        initButtons(); 

    }
    
    private void initButtons(){
        
        bPlaying = new MyButton("Play", 100,100,100, 30);
    
    }

    @Override
    public void render(Graphics g) {

        drawButtons(g);

    }

    private void drawButtons(Graphics g) {
        bPlaying.draw(g);

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

    private void loadSprites() {
        for (int y = 0; y < 10; y++) {
            for (int x = 0; x < 10; x++) {
                sprites[y * 10 + x] = img.getSubimage(x * 32, y * 32, 32, 32);
            }
        }
    }

    private int getRndInt() {
        return random.nextInt(sprites.length);
    }

}
