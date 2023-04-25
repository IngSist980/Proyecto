/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Luis
 */
public class Cola {
    private Nodo frente;
    private Nodo ultimo;
    private int largo;

    public Cola() {
        this.frente = null;
        this.ultimo = null;
        this.largo = 0;
    }

    public void insercion(Nodo nuevoNodo) {
        if (frente == null) {
            frente = nuevoNodo;
            ultimo = nuevoNodo;
            //System.out.println("Agregando primera Tropa " + nuevoNodo.getDato().getName()+ " " + nuevoNodo.getDato().getId());
        } else {
            ultimo.setAtras(nuevoNodo);
            ultimo = nuevoNodo;
            //System.out.println("Agregando Tropa a la cola " + nuevoNodo.getDato().getName()+ " " + nuevoNodo.getDato().getId());
        }
        largo++;
    }

    public Nodo atiende() {
        Nodo aux = frente;
        if (frente != null) {
            System.out.println("Extrayendo tropa " + frente.getDato().getId()+ " " + frente.getDato().getName());
            frente = frente.getAtras();
            aux.setAtras(null);
            largo--;
        }
        return aux;
    }

    public Nodo getFrente() {
        return frente;
    }
    public boolean encuentra(Integer x) {
        if (frente != null) {
            if (ultimo.getDato().getId().equals(x)) {
                return true;
            } else {
                Nodo aux = frente;
                while (aux != null) {
                    if (aux.getDato().getId().equals(x)) {
                        return true;
                    }
                    aux = aux.getAtras();
                }
            }
        }
        return false;
    }

    public int getLargo() {
        return largo;
    }

    public String imprimir() {
        String s = "";
        Nodo aux = frente;
        while (aux != null) {
            s += aux.getDato().getId() + " " + aux.getDato().getName() + "\n";
            aux =aux.getAtras();
        }
        return s;
    }
}
