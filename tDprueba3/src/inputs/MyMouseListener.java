package inputs;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener; 
import java.awt.event.MouseMotionListener;
/**
 *
 * @author Ryan Morales. 
 */
public class MyMouseListener implements MouseListener, MouseMotionListener{

     @Override
    public void mouseClicked(MouseEvent e) {
        
        if(e.getButton()== MouseEvent.BUTTON1)
         System.out.println("Botón izquierdo click");
         else if (e.getButton() == MouseEvent.BUTTON3)
             System.out.println("Botón derecho click");
       
        
        
        
        
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
