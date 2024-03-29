package main;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.security.SecureRandom;
import java.security.SecureRandom;

//import java.util.Random;
import javax.imageio.ImageIO;

/**
 *
 * @author R
 */
public class Render {

    private Game game;
   

    public Render(Game game) {
        this.game = game;
       
      
    }

    public void render(Graphics g) {

        switch (GameStates.gameStates) {

            case MENU:
                game.getMenu().render(g);
               
               
                break;
            case PLAYING:
                game.getPlaying().render(g);
                
                break;

            case SETTINGS:
                
                game.getSettings().render(g);
                
                break;

        }

    }


}
