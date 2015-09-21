/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyecto4.hu;

import java.util.ArrayList;
//

public class Actor {
    String nombre;
    String edad;
    String nacionalidad;
    ArrayList<Pelicula> lista_peliculas;

    public Actor() {
    }

    public Actor(String nombre, String edad, String nacionalidad) {
        this.nombre = nombre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
    }
    
    public Actor(String nombre, String edad, String nacionalidad, ArrayList<Pelicula> lista_peliculas) {
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

    public ArrayList<Pelicula> getLista_peliculas() {
        return lista_peliculas;
    }

    public void setLista_peliculas(ArrayList<Pelicula> lista_peliculas) {
        this.lista_peliculas = lista_peliculas;
    } 
}
