package main;

/**
 *
 * @author Ryan Morales. 
 */

    
import javax.swing.JFrame;

public class Game extends JFrame {
    
    private GameScreen gameScreen; 

    public Game() {
        setSize(640, 640);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        gameScreen = new GameScreen(); 
        add(gameScreen);
        
    }

    public static void main(String[] args) {
        Game game = new Game();
    }
}


    

