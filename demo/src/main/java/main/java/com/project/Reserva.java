package main.java.com.project;

import java.util.Date;

public class Reserva {
    //Atributos
    private Libro libroReservado;
    private Usuario usuarioReserva;
    private Date fechaVencimiento;

    //Constructor
    public Reserva(Libro libro, Usuario usuario, Date fechaVencimiento) {
        this.libroReservado = libro;
        this.usuarioReserva = usuario;
        this.fechaVencimiento = fechaVencimiento;
    }

    //Metodo toString, retorna una cadena de texto.
    @Override
    public String toString() {
        return "Reserva{" +
                "libroReservado=" + libroReservado +
                ", usuarioReserva=" + usuarioReserva +
                ", fechaVencimiento=" + fechaVencimiento +
                '}';
    }
}

