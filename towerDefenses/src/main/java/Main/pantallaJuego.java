package Main;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;
import javax.swing.JFrame;


/**
 *
 * @author Ryan Morales
 *///JPanel me permite dibujar, crear botones, etc. 
public class pantallaJuego extends JPanel {
    //Para generar colores aleatorios
    private Random aleatorio;
        
    
    

    //Contructor de la pantalla para poder trabajar en ella. 
    public pantallaJuego() {
        aleatorio= new Random();
       

    }

    //Creo un método para poder generar colores en la pantalla. 
    public void Color(Graphics g) {
        super.paintComponent(g);/*Llamo a la súper clase jpanel para 
        crear gráficos y dibujos*/
 /*Necesitamos un cuadro para pintar: este recibe parametros 
        para especificar el cuadrado y sus dimensiones: */
        for(int y=0; y<20; y++){
            for(int x=0; x<20; x++){
        g.setColor(colorAleatorio());
        //g.fillRect(40, 90, 90); 
        g.fillRect(x*32, y*32, 32,32);
         //g.fillRect(60, 60, 90, 90);
         //g.fillRect(0, 0,32,32);
         
             
            
         }
                  
        }//Arriba para x y este para y: 
       


    }
    //Este método nos genera los colores aleatorios de 0 a 256: 
    private Color colorAleatorio(){
        int r= aleatorio.nextInt(256);
        int g= aleatorio.nextInt(256);
        int b=aleatorio.nextInt(256);
        
        return new Color(r,g,b);
    
    }

}