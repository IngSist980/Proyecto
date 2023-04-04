package clases;

public class Castillo {
    private String name;
    private  int puntos;

    public Castillo(String name, int puntos) {
        this.name = name;
        this.puntos = puntos;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
}
