package clases;

public class Tropa {
    private String name;
    private double puntos;
    private Integer id;

    public Tropa(String name, int puntos, int id) {
        this.name = name;
        this.puntos = puntos;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPuntos() {
        return puntos;
    }

    public void setPuntos(double puntos) {
        this.puntos = puntos;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
