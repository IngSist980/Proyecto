package Main;
import java.awt.image.BufferedImage;
import java.io.IOException;
  import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.imageio.ImageIO; 

/**
 *
 *  @author Ryan Morales
 * 
 */
//Al hacer esto nos da acceso a todas las clases y métodos de esta librería

public class Juego extends JFrame {
//Creamos la pantalla del juego: 
 private pantallaJuego PantallaJuego;
 private BufferedImage img;
       
        public Juego() {    
            
        importimg();//
        //Declaramos el tamaño que va a tener la ventana (Ancho y largo). 
        setSize(630, 630);
        setVisible(true);//Se establece la vizibilidad 
        /*En este punto podemos generar una ventana simple, 
        pero debemos decirle que cierre a la hora de salir de la ejecución*/
        setDefaultCloseOperation(EXIT_ON_CLOSE);//Acá lo hacemos. 
        /*Ahora estblacemos la ubicación de la ventana, al decirle "null": 
        el porgrama por defecto lo va a colocar en el centro de la pantalla*/
        setLocationRelativeTo(null);
        PantallaJuego = new pantallaJuego();
        //Acá agregamos la pantalla: 
        add(PantallaJuego);
        // setVisible(true);

    }
        
        private void impotimg(){
            //Nos permite leer una imagen: 
            InputStream is =getClass().getResourceAsStream
        ("/png-clipart-tower-defense-sprite-hand-painted-leaning-tower-of-pisa-fictional-character-cartoon-thumbnail");
     try {
         img=ImageIO.read(is);
     } catch (IOException e) {
         e.printStackTrace();
     }
        
        }

    public static void main(String[] args) {

        Juego play = new Juego();

    }

    private void importimg() {
        InputStream is = getClass().getResourceAsStream//Leer imagen 
        ("/spritetowerdefense.png");
    }

}
    

