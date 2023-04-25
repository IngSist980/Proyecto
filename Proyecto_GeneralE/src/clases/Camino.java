/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Luis
 */

public class Camino {
    private Cola colaCPU;
    private Cola colaJugador;

    private int id;

    public Camino(Cola colaCPU, Cola colaJugador) {
        this.colaCPU = colaCPU;
        this.colaJugador = colaJugador;
    }
    public Cola getColaCPU() {
        return colaCPU;
    }

    public void setColaCPU(Cola colaCPU) {
        this.colaCPU = colaCPU;
    }

    public Cola getColaJugador() {
        return colaJugador;
    }

    public void setColaJugador(Cola colaJugador) {
        this.colaJugador = colaJugador;
    }

    public ResultadoEnfrentamiento enfrentarColas() {
        ResultadoEnfrentamiento resultado = new ResultadoEnfrentamiento(0.0, 0);
        System.out.println("Comezando enfrentamiento de las tropas del camino: ");
        Tropa tropaCpu;
        // Se creo este if else para manejar cuando la cola de CPU viene con solo 1 dato y la de jugador viene vacia
        if ( (colaCPU.getLargo() == 1 && colaJugador.getFrente() == null) ||  (colaCPU.getLargo() == 1 && colaJugador.getLargo() == 1) ) {
            tropaCpu = new Tropa("Vacio", 0, 0);
        } else {
            tropaCpu = colaCPU.atiende().getDato();
        }
        Tropa tropaJugador;
        //Se creo este if else para manejar cuando la cola del jugador viene vacia
        if(colaJugador.getFrente() != null) {
            tropaJugador = colaJugador.atiende().getDato();
        } else {
            tropaJugador = new Tropa("Vacio", 0.0, 0);
        }
        System.out.println("\n Iniciando el enfrentamiento de las colas del camino \n ");
        while((colaCPU.getLargo() > 0 && tropaCpu.getPuntos() >= 0.0) || (colaJugador.getLargo() > 0 && tropaJugador.getPuntos() >= 0.0)) {
            if (colaCPU.getFrente() != null && tropaCpu.getPuntos() == 0) {
                tropaCpu = colaCPU.atiende().getDato();
                System.out.println("Extrayendo nueva tropa del CPU : " + tropaCpu.getName());
            }
            if (colaJugador.getFrente() != null && tropaJugador.getPuntos() == 0) {
                tropaJugador = colaJugador.atiende().getDato();
                System.out.println("Extrayendo nueva tropa del Jugador : " + tropaJugador.getName());
            }
            //Castillo jugador siempre va a ser 1
            //Castillo CPU siempre va a ser 2

            //Un camino ya murio y causa dano al castillo
            if ((colaCPU.getLargo() == 0 && tropaCpu.getPuntos() == 0.0) || (colaJugador.getLargo() == 0 && tropaJugador.getPuntos() == 0.0)) {
                if (colaCPU.getLargo() == 0 && tropaJugador.getPuntos() != 0.0) {
                    System.out.println("\n La tropa de CPU fue derrotada");
                    //Se asigna el castillo que va a recibir el danno
                    resultado.setIdCastillo(2);
                    System.out.println("El danno causado por la tropa: " + tropaJugador.getName() + " es de "+ tropaJugador.getPuntos());
                    resultado.setDanno(resultado.getDanno() + tropaJugador.getPuntos());
                    tropaJugador.setPuntos(0.0);
                } else if (colaJugador.getLargo() == 0 && tropaCpu.getPuntos() != 0.0) {
                    System.out.println("\n La tropa del Jugador fue derrotada");
                    //Se asigna el castillo que va a recibir el danno
                    resultado.setIdCastillo(1);
                    System.out.println("El danno causado por la tropa: " + tropaCpu.getName() + " es de "+ tropaCpu.getPuntos());
                    resultado.setDanno(resultado.getDanno() + tropaCpu.getPuntos());
                    tropaCpu.setPuntos(0.0);
                }
            } else {
                // Todos los magos son de id 1
                // TOdos los caballeros son de id 2
                // Todos los Arqueros son de id 3
                if (tropaJugador.getId() == tropaCpu.getId()) {
                    System.out.println("\n Las tropas enfrentandose son iguales, ambas pierden");
                    tropaJugador.setPuntos(0.0);
                    tropaCpu.setPuntos(0.0);
                } else if (tropaJugador.getId() == 1 && tropaCpu.getId() == 2) {
                    System.out.println("\n La tropa del jugador es un Mago y la del CPU un Caballero, por ende gana Mago");
                    tropaCpu.setPuntos(0.0);
                } else if (tropaJugador.getId() == 1 && tropaCpu.getId() == 3) {
                    System.out.println("\n La tropa del jugador es un Mago y la del CPU un Arquero, por ende gana Arquero");
                    tropaJugador.setPuntos(0.0);
                } else if (tropaJugador.getId() == 2 && tropaCpu.getId() == 1) {
                    System.out.println("\n La tropa del jugador es un Caballero y la del CPU un Mago, por ende gana Mago");
                    tropaJugador.setPuntos(0.0);
                } else if (tropaJugador.getId() == 2 && tropaCpu.getId() == 3) {
                    System.out.println("\n La tropa del jugador es un Caballero y la del CPU un Arquero, por ende gana Caballero");
                    tropaCpu.setPuntos(0.0);
                } else if (tropaJugador.getId() == 3 && tropaCpu.getId() == 1) {
                    System.out.println("\n La tropa del jugador es un Arquero y la del CPU un Mago, por ende gana Arquero");
                    tropaCpu.setPuntos(0.0);
                } else if (tropaJugador.getId() == 3 && tropaCpu.getId() == 2) {
                    System.out.println("\n La tropa del jugador es un Arquero y la del CPU un Caballero, por ende gana Caballero");
                    tropaJugador.setPuntos(0.0);
                }
            }
        }
        System.out.println("El total a dannar el castillo con ID: " + resultado.getIdCastillo() + " , es de: " + resultado.getDanno() + " Puntos.");
        return resultado;
    }

    @Override
    public String toString() {
        return "Camino{" +
                "colaCPU=" + colaCPU +
                ", colaJugador=" + colaJugador +
                '}';
    }
}
