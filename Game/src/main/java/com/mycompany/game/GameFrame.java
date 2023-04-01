/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.game;

/**
 *
 * @author
 */
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GameFrame extends JFrame {

    private int tiempoTranscurrido = 0;
    private JLabel tiempoLabel;
    private Timer timer;

    public GameFrame() {
        // Configuración de la ventana
        setTitle("Tower Defense Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setResizable(false);
        setLocationRelativeTo(null);

        // Crear el menú
        JMenuBar menuBar = new JMenuBar();

        // Crear las opciones del menú
        JMenu juegoMenu = new JMenu("Jugar");
        JMenu comoJugarMenu = new JMenu("¿Cómo jugar?");
        JMenu creditosMenu = new JMenu("Créditos");

        // Agregar las opciones al menú
        menuBar.add(juegoMenu);
        menuBar.add(comoJugarMenu);
        menuBar.add(creditosMenu);

        // Crear las opciones dentro de cada menú
        JMenuItem nuevaPartidaItem = new JMenuItem("Nueva partida");
        JMenuItem cargarPartidaItem = new JMenuItem("Cargar partida");
        JMenuItem instruccionesItem = new JMenuItem("Instrucciones");
        JMenuItem autorItem = new JMenuItem("Autor");

        // Agregar el menú a la ventana
        setJMenuBar(menuBar);

        // Agregar el panel de juego
        GamePanel gamePanel = new GamePanel();
        add(gamePanel);

        // Agregar las opciones dentro de cada menú
        juegoMenu.add(nuevaPartidaItem);
        juegoMenu.add(cargarPartidaItem);
        comoJugarMenu.add(instruccionesItem);
        creditosMenu.add(autorItem);

        // Inicializar el contador de tiempo
        tiempoLabel = new JLabel("Tiempo: " + tiempoTranscurrido);
        juegoMenu.add(tiempoLabel);
        ActionListener actualizarTiempo = new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                tiempoTranscurrido++;
                tiempoLabel.setText("Tiempo: " + tiempoTranscurrido);
            }
        };
        timer = new Timer(1000, actualizarTiempo);

        // Configurar la acción de la opción "Nueva partida"
        nuevaPartidaItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                tiempoTranscurrido = 0;
                tiempoLabel.setText("Tiempo: " + tiempoTranscurrido);
                timer.start();
            }
        });

        // Configurar la acción de la opción "Cómo jugar"
        instruccionesItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                // Crear la ventana de instrucciones
                InstructionsFrame instructionsFrame = new InstructionsFrame();
            }
        });

        // Hacer visible la ventana
        setVisible(true);
    }

    public static void main(String[] args) {
        // Crear la ventana del juego
        GameFrame gameFrame = new GameFrame();
    }

}
