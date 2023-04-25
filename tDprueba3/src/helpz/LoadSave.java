package helpz;

import java.awt.image.BufferedImage; 
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;
/**
 *
 * @author Ryan Morales. 
 */
public class LoadSave {
    
    public static BufferedImage getSpriteAtlas(){
        
        BufferedImage img = null;
        
         try {
            InputStream is = LoadSave.class.getClassLoader()
                    .getResourceAsStream("spriteatlas.png");
            if (is != null) { // verificar que el InputStream no sea nulo
                img = ImageIO.read(is);
            } else {
                System.err.println("Error al cargar la imagen: InputStream nulo.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return img; 
        
    
    }
    
}
