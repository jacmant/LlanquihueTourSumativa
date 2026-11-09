package model;

public class Guia extends Persona {
    private String idioma;
    private double tarifaPorHora;

    public Guia(String nombre, String rut, int edad, Direccion direccion, String idioma, double tarifaPorHora) {
        super(nombre, rut, edad, direccion);
        this.idioma = idioma;
        this.tarifaPorHora = tarifaPorHora;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public double getTarifaPorHora() {
        return tarifaPorHora;
    }

    public void setTarifaPorHora(double tarifaPorHora) {
        this.tarifaPorHora = tarifaPorHora;
    }

    @Override
    public String toString() {
        return "Guia: " + super.toString()
                + " Idioma: " + idioma
                + " Tarifa por hora: " + tarifaPorHora;
    }
}
