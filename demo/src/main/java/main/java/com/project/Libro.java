package main.java.com.project;

public class Libro {
    //Atributos
    private String titulo;
    private String autor;
    private String genero;
    private int ejemplares;

    //Constructor 
    public Libro(String titulo, String autor, String genero, int ejemplares) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.ejemplares = ejemplares;
    }

    //Metodos getters permitiendo que se pueda obtener informacion de forma especifica sin necesidad de acceder directamente al atributo

    //para acceder a la información de un libro desde otras partes del programa, manteniendo la encapsulación y facilitando el uso correcto de la clase
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

    //Metodo toString, retorna un cadena de texto.
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
