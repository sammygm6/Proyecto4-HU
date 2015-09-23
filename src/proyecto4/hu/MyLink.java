/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyecto4.hu;

/**
 *
 * @author User
 */
public class MyLink {
    private String relacion;
    private double peso;
    private int id;
    private int edgeCount=0;
    private MyNode nodoanterior;
    private MyNode nodosiguiente;

    public MyLink() {
    }

    public MyLink(String relacion) {
        this.id = edgeCount++;
        this.peso = 1;
        this.relacion = relacion;
        
    }

    public int getEdgeCount() {
        return edgeCount;
    }

    public void setEdgeCount(int edgeCount) {
        this.edgeCount = edgeCount;
    }

    public MyNode getNodoanterior() {
        return nodoanterior;
    }

    public void setNodoanterior(MyNode nodoanterior) {
        this.nodoanterior = nodoanterior;
    }

    public MyNode getNodosiguiente() {
        return nodosiguiente;
    }

    public void setNodosiguiente(MyNode nodosiguiente) {
        this.nodosiguiente = nodosiguiente;
    }

    public String getRelacion() {
        return relacion;
    }

    public void setRelacion(String relacion) {
        this.relacion = relacion;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return relacion;
    }
    
    
}
