package scenes;

import java.awt.Color;
import java.awt.Graphics;
import main.Game;
import managers.TileManager;
import helpz.LevelBuild;

/*
 *
 * @author Ryan Morales. 
 */
public class Playing extends GameScene implements SceneMethods {

    private int[][] lvl;
    private TileManager tileManager;

    public Playing(Game game) {
        super(game);
        lvl = LevelBuild.getLevelData();
        tileManager = new TileManager();
       

        //El nivel
        //tilemamager
    }

    @Override
    public void render(Graphics g) {

        for (int y = 0; y < lvl.length; y++) {
            for (int x = 0; x < lvl[y].length; x++) {
                int id = lvl[y][x];
                g.drawImage
        (tileManager.getSprite(id), x * 32, y * 32, null);

            }

        }

        //g.setColor(Color.red);
        //g.fillRect(0, 0, 640, 640);
    }

}
