/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clases;

/**
 *
 * @author Luis
 */

import clases.*;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
Sonido s = new Sonido();
        //Creando los Castillos
        Castillo castilloJugador = new Castillo("Castillo Jugador", 10.0, 1);
        Castillo castilloCpu = new Castillo("Castillo CPU", 10.0, 2);

        //Contador de Oleadas/turnos
        int cont = 1;

        System.out.println("***Iniciando juego*** \n\n ");
        Sonido.play("inicio.wav");
        System.out.println("Castillo de jugador creado con " + castilloJugador.getPuntos() + "puntos. ");
        System.out.println("Castillo de CPU creado con " + castilloJugador.getPuntos() + "puntos. ");
        //Comienza el ciclo del juego
        do {

            System.out.println("\nPuntos actuales del castillo jugador: " + castilloJugador.getPuntos());
            System.out.println("Puntos actuales del castillo CPU: " + castilloCpu.getPuntos());
            //Creando las Colas camino 1
            Cola colaJugadorCamino1 = new Cola();
            Cola colaCpuCamino1 = new Cola();

            //Creando las Colas camino 2
            Cola colaJugadorCamino2 = new Cola();
            Cola colaCpuCamino2 = new Cola();

            //Creando caminos
            Camino camino1 = new Camino(colaCpuCamino1, colaJugadorCamino1);
            Camino camino2 = new Camino(colaCpuCamino2, colaJugadorCamino2);

            System.out.println("\n\n TURNO/OLEADA " + cont );
            System.out.println("\nLa cantidad de Tropas a elegir para esta oleada es: " + (cont + 4) );
            System.out.println("Las tropas del enemigo para esta oleada son: ");
            int limiteDeTropasCpu = (int) ((cont+3) * 0.75);
            // Se asignan las tropas del CPU
            for (int i = 0; i < cont+3; i++) {
                //Se seleccionan random los ID para tropas y caminos
                int idTropaEnemigo = ThreadLocalRandom.current().nextInt(1, 3 + 1);
                int idCaminoEnemigo = ThreadLocalRandom.current().nextInt(1, 2 + 1);
                switch (idTropaEnemigo) {
                    case 1:
                        if (idCaminoEnemigo == 1 && colaCpuCamino1.getLargo() < limiteDeTropasCpu ) {
                            System.out.println("Agregando Mago a camino 1");
                            colaCpuCamino1.insercion(new Nodo(new Tropa("Mago", 1.5, idTropaEnemigo)));
                        } else {
                            if (colaCpuCamino2.getLargo() < limiteDeTropasCpu ) {
                                System.out.println("Agregando Mago a camino 2");
                                colaCpuCamino2.insercion(new Nodo(new Tropa("Mago", 1.5, idTropaEnemigo)));
                            } else {
                                System.out.println("Agregando Mago a camino 1");
                                colaCpuCamino1.insercion(new Nodo(new Tropa("Mago", 1.5, idTropaEnemigo)));
                            }
                        }
                        break;
                    case 2:
                        if (idCaminoEnemigo == 1 && colaCpuCamino1.getLargo() < limiteDeTropasCpu ) {
                            System.out.println("Agregando Caballero a camino 1");
                            colaCpuCamino1.insercion(new Nodo(new Tropa("Caballero", 2, idTropaEnemigo)));
                        } else {
                            if (colaCpuCamino2.getLargo() < limiteDeTropasCpu ) {
                                System.out.println("Agregando Caballero a camino 2");
                                colaCpuCamino2.insercion(new Nodo(new Tropa("Caballero", 2, idTropaEnemigo)));
                            } else {
                                System.out.println("Agregando Caballero a camino 1");
                                colaCpuCamino1.insercion(new Nodo(new Tropa("Caballero", 2, idTropaEnemigo)));
                            }
                        }
                        break;
                    case 3:
                        if (idCaminoEnemigo == 1 && colaCpuCamino1.getLargo() < limiteDeTropasCpu ) {
                            System.out.println("Agregando Arquero a camino 1");
                            colaCpuCamino1.insercion(new Nodo(new Tropa("Arquero", 1, idTropaEnemigo)));
                        } else {
                            if (colaCpuCamino2.getLargo() < limiteDeTropasCpu ) {
                                System.out.println("Agregando Arquero a camino 2");
                                colaCpuCamino2.insercion(new Nodo(new Tropa("Arquero", 1, idTropaEnemigo)));
                            } else {
                                System.out.println("Agregando Arquero a camino 1");
                                colaCpuCamino1.insercion(new Nodo(new Tropa("Arquero", 1, idTropaEnemigo)));
                            }
                        }
                        break;
                }

            }

            for (int i = 0; i < cont+4 ; i++) {
                System.out.println("Elija su " + (i + 1) + " tropa: \n 1. Para Mago digite 1 \n 2. Para Caballero digite 2 \n 3. Para Arquero digite 3");
                int codigoTropa = input.nextInt();
                System.out.println("Digite en que camino va a ir esta Tropa 1 o 2: ");
                int codigoCamino = input.nextInt();
                switch (codigoTropa) {
                    case 1:
                        if (codigoCamino == 1 ) {
                            System.out.println("Agregando Mago a camino 1");
                            colaJugadorCamino1.insercion(new Nodo(new Tropa("Mago", 1.5, codigoTropa)));
                        } else if (codigoCamino == 2) {
                            System.out.println("Agregando Mago a camino 2");
                            colaJugadorCamino2.insercion(new Nodo(new Tropa("Mago", 1.5, codigoTropa)));
                        }
                        break;
                    case 2:
                        if (codigoCamino == 1 ) {
                            System.out.println("Agregando Caballero a camino 1");
                            colaJugadorCamino1.insercion(new Nodo(new Tropa("Caballero", 2, codigoTropa)));
                        } else if (codigoCamino == 2) {
                            System.out.println("Agregando Caballero a camino 2");
                            colaJugadorCamino2.insercion(new Nodo(new Tropa("Caballero", 2, codigoTropa)));
                        }
                        break;
                    case 3:
                        if (codigoCamino == 1 ) {
                            System.out.println("Agregando Arquero a camino 1");
                            colaJugadorCamino1.insercion(new Nodo(new Tropa("Arquero", 1, codigoTropa)));
                        } else if (codigoCamino == 2) {
                            System.out.println("Agregando Arquero a camino 2");
                            colaJugadorCamino2.insercion(new Nodo(new Tropa("Arquero", 1, codigoTropa)));
                        }
                        break;
                }
            }
            System.out.println("\nEnfrentando tropas del camino 1: ");
            ResultadoEnfrentamiento resultadoEnfrentamiento1 = camino1.enfrentarColas();
            System.out.println("\nEnfrentando tropas del camino 2: ");
            ResultadoEnfrentamiento resultadoEnfrentamiento2 = camino2.enfrentarColas();

            if (resultadoEnfrentamiento1.getIdCastillo() == 1){
                castilloJugador.setPuntos(castilloJugador.getPuntos() - resultadoEnfrentamiento1.getDanno());
            } else {
                castilloCpu.setPuntos(castilloCpu.getPuntos() - resultadoEnfrentamiento1.getDanno());
            }
            if (resultadoEnfrentamiento2.getIdCastillo() == 1){
                castilloJugador.setPuntos(castilloJugador.getPuntos() - resultadoEnfrentamiento2.getDanno());
            } else {
                castilloCpu.setPuntos(castilloCpu.getPuntos() - resultadoEnfrentamiento2.getDanno());
            }
            cont++;

        } while (castilloCpu.getPuntos() > 0 && castilloJugador.getPuntos() > 0);

        if (castilloJugador.getPuntos() > 0 && castilloCpu.getPuntos() <= 0) {
            System.out.println("\nEl jugador es el ganador");
        } else if (castilloJugador.getPuntos() <= 0 && castilloCpu.getPuntos() > 0) {
            System.out.println("\nEl CPU es el ganador");
        } else if (castilloJugador.getPuntos() <= 0 && castilloCpu.getPuntos() <= 0) {
            System.out.println("\nEl resultado es EMPATE");
        }
    }

}