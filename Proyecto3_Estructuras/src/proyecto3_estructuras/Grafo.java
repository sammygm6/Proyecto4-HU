package proyecto3_estructuras;

import java.util.ArrayList;

public class Grafo {
    ArrayList<Arista> lista_arista = new ArrayList<>();  
    ArrayList<Nodo> lista_nodo = new ArrayList<>();
    
    public Grafo() {
    }

    public ArrayList<Arista> getLista_arista() {
        return lista_arista;
    }

    public void setLista_arista(ArrayList<Arista> lista_arista) {
        this.lista_arista = lista_arista;
    }
    
    public Arista getArista(int posicion){
        return lista_arista.get(posicion);
    }

    public ArrayList<Nodo> getLista_nodo() {
        return lista_nodo;
    }

    public void setLista_nodo(ArrayList<Nodo> lista_nodo) {
        this.lista_nodo = lista_nodo;
    } 
    
    public Nodo getNodo(int posicion){
        return lista_nodo.get(posicion);
    }

}
