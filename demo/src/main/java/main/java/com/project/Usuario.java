package main.java.com.project;

public class Usuario {
    private String nombre;
    private String apellido;
    private int numeroCuenta;

    public Usuario(String nombre, String apellido, int numeroCuenta) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroCuenta = numeroCuenta;
    }

    // Otros métodos y getters según sea necesario

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", numeroCuenta=" + numeroCuenta +
                '}';
    }
}
