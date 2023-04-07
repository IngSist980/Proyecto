package main;

import java.awt.Color;
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
    private BufferedImage img;
    private BufferedImage[] sprites = new BufferedImage[100];

    public GameScreen(BufferedImage img) {
        this.img = img;

        loadSprites();

        random = new SecureRandom();
    }

    private void loadSprites() {
        for (int y = 0; y < 10; y++) {
            for (int x = 0; x < 10; x++) {
                sprites[y * 10 + x] = img.getSubimage(x * 32, y * 32, 32, 32);
            }
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (int y = 0; y < 20; y++) {
            for (int x = 0; x < 20; x++) {
                g.drawImage(sprites[getRndInt()], x * 32, y * 32, null);
            }
        }
    }

    private int getRndInt() {
        return random.nextInt(sprites.length);
    }

    private Color getRndColor() {
        int r = random.nextInt(256);
        int g = random.nextInt(256);
        int b = random.nextInt(256);

        return new Color(r, g, b);
    }
}
