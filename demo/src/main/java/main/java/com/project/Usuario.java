package main.java.com.project;

public class Usuario {
    //Atributos
    private String nombre;
    private String apellido;
    private int numeroCuenta;

    //Constructor- se usa para inicializar y crear objetos de la clase usuario con los valores nombre, ap..
    public Usuario(String nombre, String apellido, int numeroCuenta) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroCuenta = numeroCuenta;
    }

    //Metodo que devuelve una cadena de textos en forma de objeto con nombre, ap, n, para usarla en
    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", numeroCuenta=" + numeroCuenta +
                '}';
    }
}
