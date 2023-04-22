package ui;

import java.awt.Color;
import java.awt.Graphics; 
import java.awt.Rectangle;

public class MyButton {

    private int x, y, width, height;
    private String text;
    private Rectangle bounds;

    public MyButton(String text, int x, int y, int width, int height) {
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
        g.setColor(Color.WHITE);
        g.fillRect(x, y, width, height);
    
        g.setColor(Color.BLACK);
        g.drawRect(x, y, width, height);
    
        g.drawString(text, x+5, y+15);
    }
    
    public Rectangle getBounds(){
        return bounds;
    }
}
