/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Luis
 */
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

