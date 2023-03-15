package com.mycompany.towerdefenses;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public  class Juego extends JFrame implements ActionListener{
    private JPanel panelJugador;
    private JPanel panelEnemigo;
    private JButton botonEnviarSoldado;
    private JLabel labelJugador;
    private JLabel labelEnemigo;
    private JLabel labelMensaje;
    private int vidaJugador=100;
    private int vidaEnemigo=100;
    private int turno=1;
    
    
    public Juego(){
        super("Tower Defenses");
        panelJugador = new JPanel();
        panelJugador.setLayout(new GridLayout(2,1));
        panelJugador.setBorder(BorderFactory.createTitledBorder("Castillo"));
        labelEnemigo=new JLabel ("Vida: "+ vidaEnemigo);
        panelEnemigo.add(labelEnemigo);
        botonEnviarSoldado= new JButton("Enviar soldado");
        botonEnviarSoldado.addActionListener(this);
        
        labelMensaje =new JLabel("Turno del jugador");
        
        Container contenedor = getContentPane();
        contenedor.setLayout(new BorderLayout());
        contenedor.add(panelJugador, BorderLayout.WEST);
        contenedor.add(panelEnemigo,BorderLayout.EAST);
        contenedor.add(botonEnviarSoldado, BorderLayout.SOUTH);
        contenedor.add(labelMensaje,BorderLayout.NORTH);
        setSize(500,500);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
    }
    
    
}
