package ui;

import java.awt.Color;
import java.awt.Graphics; 
import java.awt.Rectangle; 
/**
 *
 * @author Ryan Morales.
 */
public class MyButton {

    private int x, y, width, height;
    private String text;
    private Rectangle bounds; //Verfica si el mouse está dentro. 

    public MyButton(String tex, int x, int y, int width, int height) {
        this.text = text;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        
        
        
        initBounds();

    }
    
    private void initBounds(){
        this.bounds = new Rectangle(x, y, width, height);
    
    }
    
    public void draw(Graphics g){
    //Dibujar el botón: 
    
    //Cuerpo: 
    g.setColor(Color.WHITE);
    g.fillRect(x, y, width, height);
    
    //Borde: 
      g.setColor(Color.black);
      g.drawRect(x, y, width, height);
    
    //Texto: 
    g.drawString(text, x, y);
    
    
  
    
    }
    
    public Rectangle getBounds(){
        return bounds;
    
    }

}
