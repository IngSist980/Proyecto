/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.game;

/**
 *
 * @author 
 */
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class GamePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        // Obtener el ancho y alto del panel
        int width = getWidth();
        int height = getHeight();
        
        // Tamaños de los castillos
        int castleWidth = width / 6;
        int castleHeight = height / 6;
        
         // Dibujar el castillo del jugador 1 en la parte superior
        g.setColor(Color.BLUE);
        g.fillRect(width/2 - castleWidth/2, height/10 - castleHeight/2, castleWidth, castleHeight);
        
        // Dibujar el castillo del jugador 2 en la parte inferior
        g.setColor(Color.RED);
        g.fillRect(width/2 - castleWidth/2, height*9/10 - castleHeight/2, castleWidth, castleHeight);
        
        // Dibujar los caminos
        g.setColor(Color.BLACK);
        g.drawLine(width / 4, height / 4, width / 4, height / 2 - castleHeight / 2); // camino 1
        g.drawLine(width / 4, height / 2 + castleHeight / 2, width / 4, height * 3 / 4); // camino 2
        g.drawLine(width * 3 / 4, height / 4, width * 3 / 4, height / 2 - castleHeight / 2); // camino 3
        g.drawLine(width * 3 / 4, height / 2 + castleHeight / 2, width * 3 / 4, height * 3 / 4); // camino 4
        g.drawLine(width / 4, height / 2, width * 3 / 4, height / 2); // camino horizontal
    }
}



