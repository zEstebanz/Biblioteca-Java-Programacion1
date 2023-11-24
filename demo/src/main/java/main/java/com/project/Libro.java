package main.java.com.project;

public class Libro {
    private String titulo;
    private String autor;
    private String genero;
    private int ejemplares;

    public Libro(String titulo, String autor, String genero, int ejemplares) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.ejemplares = ejemplares;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getGenero() {
        return genero;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    // Otros métodos y setters según sea necesario

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", genero='" + genero + '\'' +
                ", ejemplares=" + ejemplares +
                '}';
    }
}
