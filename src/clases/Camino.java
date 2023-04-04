package clases;

public class Camino {
    private Cola colaCPU;
    private Cola colaJugador;

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

    @Override
    public String toString() {
        return "Camino{" +
                "colaCPU=" + colaCPU +
                ", colaJugador=" + colaJugador +
                '}';
    }
}
