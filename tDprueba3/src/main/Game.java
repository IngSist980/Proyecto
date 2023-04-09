package main;

/**
 *
 * @author Ryan Morales.
 */
import inputs.KeyboardListener;
import inputs.MyMouseListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.swing.JFrame;
import java.io.InputStream;
//import java.util.logging.Level;
//import java.util.logging.Logger;
import javax.imageio.ImageIO;
import scenes.Menu;
import scenes.Playing;
import scenes.Settings;

public class Game extends JFrame implements Runnable {

    private GameScreen gameScreen;
    private int updates;
    private long lastTimeUps;
    private Thread gameThread;

    private final double FPS_SET = 120.0;
    private final double UPS_SET = 60.0;

    private MyMouseListener myMouseListener;
    private KeyboardListener keyboardListener;

    //Clases: 
    private Render render;
    private Menu menu;
    private Playing playing;
    private Settings settings;

    public Game() {
        
        initClasses();
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);//Impide cambiar el  tamaño de la pantalla. 
        add(gameScreen);
        pack();
        setVisible(true);

    }

    private void initClasses() {
        render = new Render(this);
        gameScreen = new GameScreen(this);
        menu = new Menu(this);
        playing = new Playing(this);
        settings = new Settings(this);

    }

    private void initIputs() {
        myMouseListener = new MyMouseListener();
        keyboardListener = new KeyboardListener();

        addMouseListener(myMouseListener);
        addMouseMotionListener(myMouseListener);
        addKeyListener(keyboardListener);

        //Dirige la interacción del jugador con la pantalla: 
        requestFocus();

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
        game.initIputs();
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

        long now;

        while (true) {

            now = System.nanoTime();
            //Hacer: 
            if (now - lastFrame >= timePerFrame) { // Establece bucle de
                //tiempo  
                repaint();//Establece la dinámica de la imagen. 
                lastFrame = System.nanoTime();
                frames++;
            }
            //Actualizar: 
            if (now - lastUpdate >= timePerUpdate) {
                updateGame();
                lastUpdate = System.nanoTime();
                updates++;

            }

            if (System.currentTimeMillis() - lastTimeCheck >= 1000) {
                System.out.println("FPS: " + frames + " | UPS: " + updates);
                frames = 0;
                updates = 0;
                lastTimeCheck = System.currentTimeMillis();

            }

        }

        //Actualizar
        //Revisar  FPS Y UPS
    }
//Getter and Setters

    public Render getRender() {
        return render;

    }

    public Menu getMenu() {
        return menu;
    }

    public Playing getPlaying() {
        return playing;
    }

    public Settings getSettings() {
        return settings;
    }

}
