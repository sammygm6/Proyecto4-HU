/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyecto4.hu;

import java.util.ArrayList;

public class Actores {
    String nombre;
    String edad;
    String nacionalidad;
    ArrayList<Peliculas> lista_peliculas;

    public Actores() {
    }

    public Actores(String nombre, String edad, String nacionalidad, ArrayList<Peliculas> lista_peliculas) {
        this.nombre = nombre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.lista_peliculas = lista_peliculas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public ArrayList<Peliculas> getLista_peliculas() {
        return lista_peliculas;
    }

    public void setLista_peliculas(ArrayList<Peliculas> lista_peliculas) {
        this.lista_peliculas = lista_peliculas;
    } 
}
