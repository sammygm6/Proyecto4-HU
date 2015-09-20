package proyecto3_estructuras;

public class Arista {
    int value;
    Nodo nodo_der;
    Nodo nodo_izq;
    boolean visitado = false;

    public Arista() {
    }

    public Arista(int value, Nodo nodo_der, Nodo nodo_izq) {
        this.value = value;
        this.nodo_der = nodo_der;
        this.nodo_izq = nodo_izq;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Nodo getNodo_der() {
        return nodo_der;
    }

    public void setNodo_der(Nodo nodo_der) {
        this.nodo_der = nodo_der;
    }

    public Nodo getNodo_izq() {
        return nodo_izq;
    }

    public void setNodo_izq(Nodo nodo_izq) {
        this.nodo_izq = nodo_izq;
    }

    public boolean isVisitado() {
        return visitado;
    }

    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }  
}
