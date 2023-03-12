package Main;

import javax.swing.JFrame;

/**
 *
 * @author Ryan Morales 
 */ //Al hacer esto nos da acceso a todas las clases y métodos de esta librería
public class Main extends JFrame {

    //Creamos la pantalla del juego: 
    private pantallaJuego PantallaJuego;

    public Main() {
        //Declaramos el tamaño que va a tener la ventana (Ancho y largo). 
        setSize(660, 660);
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

    public static void main(String[] args) {

        Main play = new Main();

    }

}
