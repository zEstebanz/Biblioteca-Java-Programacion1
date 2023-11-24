package main.java.com.project;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Creamos una biblioteca
        Biblioteca biblioteca = new Biblioteca("Biblioteca Pública de mi barrio", "Calle 123, Ciudad");

        // Agregamos libros al catálogo
        biblioteca.agregarLibro(new Libro("El Quijote de la Mancha", "Miguel de Cervantes", "Novela", 10));
        biblioteca.agregarLibro(new Libro("La Ilíada", "Homero", "Poema épico", 5));
        biblioteca.agregarLibro(new Libro("La Divina Comedia", "Dante Alighieri", "Poema épico", 3));

        // Buscamos un libro en el catálogo
        Libro libro = biblioteca.buscarLibro("El Quijote de la Mancha");

        // Imprimimos el libro
        System.out.println(libro);

        // Creamos un usuario
        Usuario usuario = new Usuario("Juan", "Pérez", 123456);

        // Creamos una reserva con el libro, el usuario y una fecha de vencimiento
        Date fechaVencimiento = new Date(); // En un caso real, se debería manejar de manera más precisa
        Reserva reserva = new Reserva(libro, usuario, fechaVencimiento);

        // Imprimimos la reserva
        System.out.println(reserva);
    }
}
