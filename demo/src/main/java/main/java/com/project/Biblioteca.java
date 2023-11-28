package main.java.com.project;

public class Biblioteca {

    //Atributos
    private String nombre;
    private String direccion;
    //Representa el catálogo de libros de la biblioteca. La clase Catalogo se asocia a la biblioteca mediante esta instancia.
    private Catalogo catalogo;

    //Constructor
    //Constructor es un metodo especial, que se llama cuando se crea un objeto de la clase
    //tiene los parametros nombre, direccion
    //uso el constructor inicializar los atributos de la clase cuando se crea un objeto de tipo Biblioteca
    
    public Biblioteca(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        // Esto establece una relación de composición entre la clase Biblioteca y la clase Catalogo
        this.catalogo = new Catalogo();
    }

    //Metodo agregar libro
    //toma el parametro libro, suponiendo que catalogo es una instancia de la clase Catalogo, asociada a la biblioteca, se llama al metodo agrfegar libro del catalogo, pasando el libro como argumento
    //void no devuelve ningun valor
    public void agregarLibro(Libro libro) {
        catalogo.agregarLibro(libro);
    }

    //Metodo buscar libro
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
