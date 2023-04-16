package clases;

public class ResultadoEnfrentamiento {

    private double danno;
    private int idCastillo;

    public ResultadoEnfrentamiento(double danno, int idCastillo) {
        this.danno = danno;
        this.idCastillo = idCastillo;
    }

    public double getDanno() {
        return danno;
    }

    public void setDanno(double danno) {
        this.danno = danno;
    }

    public int getIdCastillo() {
        return idCastillo;
    }

    public void setIdCastillo(int idCastillo) {
        this.idCastillo = idCastillo;
    }
}
