package model;

public class Persona {
    private String nombre;
    private String rut;
    private int edad;
    private Direccion direccion; //Composición de la clase Direccion

    public Persona(String nombre, String rut, int edad, Direccion direccion) {
        this.nombre = nombre;
        this.rut = rut;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre
                + " RUT/RUN " + rut
                + " Edad: " + edad
                + " Dirección: " + direccion;

    }
}