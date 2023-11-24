package main.java.com.project;

public class Biblioteca {
    private String nombre;
    private String direccion;
    private Catalogo catalogo;

    public Biblioteca(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.catalogo = new Catalogo();
    }

    public void agregarLibro(Libro libro) {
        catalogo.agregarLibro(libro);
    }

    public Libro buscarLibro(String titulo) {
        return catalogo.buscarLibro(titulo);
    }

    // Otros métodos y getters según sea necesario

    @Override
    public String toString() {
        return "Biblioteca{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", catalogo=" + catalogo +
                '}';
    }
}
