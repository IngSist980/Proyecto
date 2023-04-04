package clases;

public class Tropa {
    private String name;
    private int puntos;
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

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
