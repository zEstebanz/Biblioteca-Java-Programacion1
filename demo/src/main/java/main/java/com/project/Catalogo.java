package main.java.com.project;

import java.util.ArrayList;
import java.util.List;

public class Catalogo {
    //Atributo
    private List<Libro> libros;

    //Constructor
    public Catalogo() {
        // Inicializa la lista de libros al crear un objeto Catalogo
        this.libros = new ArrayList<>();
    }

    // Método para agregar un libro al catálogo
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    // Método para obtener un libro por su índice en la lista
    public Libro getLibro(int indice) {
        if (indice >= 0 && indice < libros.size()) {
            return libros.get(indice);
        } else {
            return null; // Índice fuera de rango
        }
    }

    // Método para buscar un libro por su título
    public Libro buscarLibro(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                return libro; // Devuelve el libro si encuentra el título
            }
        }
        return null; // Libro no encontrado
    }

    //Metodo toString, retorna una cadena de texto
    @Override
    public String toString() {
        return "Catalogo{" +
                "libros=" + libros +
                '}';
    }
}
