package clases;

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
        System.out.println("Comezando enfrentamiento de las tropas del camino: " + id);
        Tropa tropaCpu = null;
        Tropa tropaJugador = null;
        while(colaCPU.getLargo() > 0 || colaJugador.getLargo() > 0) {
            if (colaCPU.atiende() != null && tropaCpu.getPuntos() == 0) {
                tropaCpu = colaCPU.atiende().getDato();
            }
            if (colaJugador.atiende() != null && tropaJugador.getPuntos() == 0) {
                tropaJugador = colaJugador.atiende().getDato();
            }
            //Castillo jugador siempre va a ser 1
            //Castillo CPU siempre va a ser 2
            if (colaCPU.getLargo() == 0 || colaJugador.getLargo() == 0) {
                if (colaCPU.getLargo() == 0) {
                    //Se asigna el castillo que va a recibir el danno
                    resultado.setIdCastillo(2);
                    resultado.setDanno(resultado.getDanno() + tropaJugador.getPuntos());
                    tropaJugador.setPuntos(0.0);
                } else if (colaJugador.getLargo() == 0) {
                    //Se asigna el castillo que va a recibir el danno
                    resultado.setIdCastillo(1);
                    resultado.setDanno(resultado.getDanno() + tropaCpu.getPuntos());
                    tropaCpu.setPuntos(0.0);
                }
            } else {
                // Todos los magos son de id 1
                // TOdos los caballeros son de id 2
                // Todos los Arqueros son de id 3
                if (tropaJugador.getId() == tropaCpu.getId()) {
                    tropaJugador.setPuntos(0.0);
                    tropaCpu.setPuntos(0.0);
                } else if (tropaJugador.getId() == 1 && tropaCpu.getId() == 2) {
                    tropaCpu.setPuntos(0.0);
                } else if (tropaJugador.getId() == 1 && tropaCpu.getId() == 3) {
                    tropaJugador.setPuntos(0.0);
                } else if (tropaJugador.getId() == 2 && tropaCpu.getId() == 1) {
                    tropaJugador.setPuntos(0.0);
                } else if (tropaJugador.getId() == 2 && tropaCpu.getId() == 3) {
                    tropaCpu.setPuntos(0.0);
                } else if (tropaJugador.getId() == 3 && tropaCpu.getId() == 1) {
                    tropaCpu.setPuntos(0.0);
                } else if (tropaJugador.getId() == 3 && tropaCpu.getId() == 2) {
                    tropaJugador.setPuntos(0.0);
                }
            }
        }
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
