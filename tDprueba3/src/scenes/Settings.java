package scenes;
import java.awt.Color;
 import java.awt.Graphics;
import main.Game;

/**
 *
 * @author Ryan Morales. 
 */
public class Settings extends GameScene implements SceneMethods{
    
     
    public Settings (Game game) {
        super(game);
    }
    
    @Override
    public void render(Graphics g){
    
         g.setColor(Color.BLUE);
        g.fillRect(0, 0, 640, 640);
    
    }
    
}
