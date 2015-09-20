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
    private double capacidad;
    private double peso;
    private int id;
    private int edgeCount=0;

    public MyLink() {
    }

    public MyLink(double capacidad, double peso) {
        this.id = edgeCount++;
        this.peso = peso;
        this.capacidad = capacidad;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
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
        return "E "+id;
    }
    
    
}
