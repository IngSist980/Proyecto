package managers;

import java.awt.image.BufferedImage;
import objects.Tile;
import helpz.LoadSave;
//import java.util.ArrayList;

public class TileManager {

    private Tile GRASS, WATER, ROAD;
    public BufferedImage atlas;
    public Tile[] tiles = new Tile[3];

    public TileManager() {
        loadAtlas();
        createTiles();
    }

    private void createTiles() {
        tiles[0] = GRASS = new Tile(getSprite(8, 1));
        tiles[1] = WATER = new Tile(getSprite(0, 6));
        tiles[2] = ROAD = new Tile(getSprite(9, 0));
    }
    
    private void loadAtlas() {
        atlas = LoadSave.getSpriteAtlas();
    }
    
    public BufferedImage getSprite(int id) {
        return tiles[id].getSprite();
    }

    private BufferedImage getSprite(int xCord, int yCord) {
        return atlas.getSubimage(xCord * 32, yCord * 32, 32, 32);
    }
}
