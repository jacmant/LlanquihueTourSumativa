package model;

// Un guía turístico.
// "extends Persona" = un Guia ES una Persona, así que ya trae nombre, rut, edad y dirección.
// Acá solo agregamos lo que es propio del guía.
public class Guia extends Persona {

    private String idioma;
    private double tarifaPorHora;

    // super(...) manda los datos comunes al constructor de Persona
    public Guia(String nombre, String rut, int edad, Direccion direccion,
                String idioma, double tarifaPorHora) {
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

    // Reusamos el texto de Persona (super.toString()) y le sumamos lo del guía
    @Override
    public String toString() {
        return super.toString()
                + " | Idioma: " + idioma
                + " | Tarifa por hora: $" + (long) tarifaPorHora;
    }
}