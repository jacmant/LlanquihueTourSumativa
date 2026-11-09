package model;

public class Cliente extends Persona {

    //Atributos únicos del cliente
    private String nacionalidad;
    private String tourContratado;
    private String pasaporte;

    public Cliente (String nombre, String rut,String pasaporte, int edad, Direccion direccion, String nacionalidad, String tourContratado) {
        super(nombre, rut, edad, direccion);
        this.nacionalidad = nacionalidad;
        this.tourContratado = tourContratado;
        this.pasaporte = pasaporte;
    }
    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getTourContratado() {
        return tourContratado;
    }

    public void setTourContratado(String tourContratado) {
        this.tourContratado = tourContratado;
    }

    public String getPasaporte(){
        return pasaporte;
    }

    public void setPasaporte(String pasaporte){
        this.pasaporte = pasaporte;
    }
    @Override
    public String toString() {
        return "Cliente -> " + super.toString()
                + " | Nacionalidad: " + nacionalidad
                + " | Tour: " + tourContratado;
    }
}

