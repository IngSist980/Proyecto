package main;
import java.awt.Color;
import javax.swing.JPanel; 
import java.awt.Graphics; 
/**
 *
 * @author Ryan Morales. 
 */
public class GameScreen extends JPanel {
    
    public GameScreen(){
        
        
        
    
    }
    
    public void paintComponent(Graphics g){
         super.paintComponent(g);
         
         g.setColor(Color.red);
         g.drawRect(50, 50, 100, 100);
         g.fillRect(50,50, 100, 100);
    
    }
    
    
}
