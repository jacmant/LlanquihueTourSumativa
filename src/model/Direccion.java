package model;

// La dirección de una persona.
// Una Persona "tiene una" Direccion como atributo: eso es composición.
public class Direccion {

    // Todo private: desde afuera solo se toca con getters y setters (encapsulamiento)
    private String calle;
    private String ciudad;
    private String region;

    public Direccion(String calle, String ciudad, String region) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.region = region;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    // Muestra la dirección en una sola línea
    @Override
    public String toString() {
        return calle + ", " + ciudad + ", " + region;
    }
}