package main.java.com.project;

import java.util.Date;

public class Reserva {
    private Libro libroReservado;
    private Usuario usuarioReserva;
    private Date fechaVencimiento;

    public Reserva(Libro libro, Usuario usuario, Date fechaVencimiento) {
        this.libroReservado = libro;
        this.usuarioReserva = usuario;
        this.fechaVencimiento = fechaVencimiento;
    }

    // Otros métodos y getters según sea necesario

    @Override
    public String toString() {
        return "Reserva{" +
                "libroReservado=" + libroReservado +
                ", usuarioReserva=" + usuarioReserva +
                ", fechaVencimiento=" + fechaVencimiento +
                '}';
    }
}

