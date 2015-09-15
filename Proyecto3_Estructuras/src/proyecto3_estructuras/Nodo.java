package proyecto3_estructuras;

import java.util.ArrayList;

public class Nodo {
    String nombre;
    ArrayList<Arista> aristas_nodo = new ArrayList<>();
    
    public Nodo() {
    }

    public Nodo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Arista> getAristas_nodo() {
        return aristas_nodo;
    }

    public void setAristas_nodo(ArrayList<Arista> aristas_nodo) {
        this.aristas_nodo = aristas_nodo;
    }
    
    public Arista getAristadelNodo(int posicion){
        return aristas_nodo.get(posicion);
    }
}