package proyecto4.hu;

public class Pelicula {
    String titulo;
    String año;
    String estudio;

    public Pelicula() {
    }

    public Pelicula(String titulo, String año, String estudio) {
        this.titulo = titulo;
        this.año = año;
        this.estudio = estudio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }
    //
}
