package main;

/**
 *
 * @author Ryan Morales.
 */
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.swing.JFrame;
import java.io.InputStream;
//import java.util.logging.Level;
//import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class Game extends JFrame implements Runnable {

    private GameScreen gameScreen;
    private BufferedImage img;
    private int updates;
    private long lastTimeUps;
    private Thread gameThread;
    private final double FPS_SET = 120.0; 
    private final double UPS_SET =60.0; 

    public Game() {

        

        importImg();

        setSize(640, 640);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        gameScreen = new GameScreen(img);
        add(gameScreen);
        setVisible(true);

    }

    private void importImg() {

        try {
            InputStream is = getClass().getResourceAsStream("/spriteatlas.png");
            if (is != null) { // verificar que el InputStream no sea nulo
                img = ImageIO.read(is);
            } else {
                System.err.println("Error al cargar la imagen: InputStream nulo.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void start() {
        gameThread = new Thread(this) {
        };

        gameThread.start();

    }

    //Imprime las actualizaciones por segundo que realiza el juego cada segundo. 
    private void callUPS() {
        if (System.currentTimeMillis() - lastTimeUps >= 1000) {
            System.out.println("UPS : " + updates);
            updates = 0;
            lastTimeUps = System.currentTimeMillis();

        }

    }

    //Actualización de la pantalla: 
    private void updateGame() {

       
        // System.out.println("Game Update");

    }

    public static void main(String[] args) {

        Game game = new Game();
        game.start();

    }

    @Override
    public void run() {

        double timePerFrame = 1000000000.0 / FPS_SET; //Controla la velocidad de las imagenes;
        double timePerUpdate = 1000000000.0 / UPS_SET;
        long lastFrame = System.nanoTime();
       long lastUpdate = System.nanoTime();
        long lastTimeCheck = System.currentTimeMillis();
        
        int frames = 0;
        int updates = 0;

        while (true) {
            //Hacer: 
            if (System.nanoTime() - lastFrame >= timePerFrame) { // Establece bucle de
                             //tiempo  
                repaint();//Establece la dinámica de la imagen. 
                lastFrame = System.nanoTime();  
                frames++;
            }
            //Actualizar: 
            if (System.nanoTime() - lastUpdate >= timePerUpdate) {
                updateGame();
                lastUpdate = System.nanoTime();
                updates++;

            }

            if (System.currentTimeMillis() - lastTimeCheck >= 1000) {
                System.out.println("FPS: " + frames + " | UPS: " +updates);
                frames = 0; 
                updates = 0; 
                lastTimeCheck = System.currentTimeMillis();

            }

        }

        //Actualizar
        //Revisar  FPS Y UPS
    }

}
