/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.game;

import java.awt.Component;
import java.awt.Font;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author 
 */

// Clase para la ventana de instrucciones
class InstructionsFrame extends JFrame {
    
    public InstructionsFrame() {
        // Configuración de la ventana
        setTitle("Instrucciones");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(400, 300);
        setResizable(false);
        setLocationRelativeTo(null);
        
        // Crear el panel de instrucciones
        JPanel instructionsPanel = new JPanel();
        instructionsPanel.setLayout(new BoxLayout(instructionsPanel, BoxLayout.PAGE_AXIS));
        instructionsPanel.setAlignmentX(Component.CENTER_ALIGNMENT); // Alineación horizontal en el centro
        
        // Agregar la información de las instrucciones al panel
        JLabel titleLabel = new JLabel("Instrucciones");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        instructionsPanel.add(titleLabel);
        
        JLabel instructionsLabel = new JLabel("<html><body><p align='justify'>Para jugar, coloca tropas en el camino para detener a los enemigos que intentan llegar a la base. </p></body></html>");
        instructionsLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        instructionsPanel.add(instructionsLabel);
        
        // Agregar el panel de instrucciones a la ventana
        add(instructionsPanel);
        
        // Hacer visible la ventana de instrucciones
        setVisible(true);
    }
}

