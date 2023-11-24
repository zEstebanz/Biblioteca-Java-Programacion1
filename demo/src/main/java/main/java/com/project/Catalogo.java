package main.java.com.project;

import java.util.ArrayList;
import java.util.List;

public class Catalogo {
    private List<Libro> libros;

    public Catalogo() {
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public Libro getLibro(int indice) {
        if (indice >= 0 && indice < libros.size()) {
            return libros.get(indice);
        } else {
            return null; // Índice fuera de rango
        }
    }

    public Libro buscarLibro(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                return libro;
            }
        }
        return null; // Libro no encontrado
    }

    // Otros métodos según sea necesario

    @Override
    public String toString() {
        return "Catalogo{" +
                "libros=" + libros +
                '}';
    }
}
