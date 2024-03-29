package inputs;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener; 
import java.awt.event.MouseMotionListener;
import main.Game;

/**
 *
 * @author Ryan Morales. 
 */
public class MyMouseListener implements MouseListener, MouseMotionListener{
    
    private Game game; 
    
    public MyMouseListener(Game game){
        this.game = game;
    
    }

    public MyMouseListener() {
    }

     @Override
    public void mouseClicked(MouseEvent e) {
        
       if(e.getButton() == MouseEvent.BUTTON1){
           System.out.println("Mouse Pos: " +e.getX() + " :  " + e.getY());
       
       }
        
        
        
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }

    @Override
    public void mouseDragged(MouseEvent e) {
    
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    
    }
    
   
}
