package arbolclase;

/**
 *
 * @author Ryan Morales. 
 */
public class Nodo {
    
    private int id; //La informació concreta del árbol. 
    private Nodo hijoIzq; // referencia al subárbol izquierdo. 
    private Nodo hijoDer; // referencia al subárbol derecho.

    public Nodo(int id, Nodo hijoIzq, Nodo hijoDer) {
        this.id = id;
        this.hijoIzq = hijoIzq;
        this.hijoDer = hijoDer;
    }

    Nodo(int x) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Nodo getHijoIzq() {
        return hijoIzq;
    }

    public void setHijoIzq(Nodo hijoIzq) {
        this.hijoIzq = hijoIzq;
    }

    public Nodo getHijoDer() {
        return hijoDer;
    }

    public void setHijoDer(Nodo hijoDer) {
        this.hijoDer = hijoDer;
    }
    
    
    
}
