package model;

// Un proveedor de servicios (transporte, alojamiento, etc.).
// Es la persona de contacto del proveedor, por eso también HEREDA de Persona.
public class Proveedor extends Persona {

    private String empresa;
    private String tipoServicio;

    public Proveedor(String nombre, Rut rut, int edad, Direccion direccion,
                     String empresa, String tipoServicio) {
        super(nombre, rut, edad, direccion);
        this.empresa = empresa;
        this.tipoServicio = tipoServicio;
    }

    @Override
    public String getRol() {
        return "Proveedor";
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    @Override
    public String toString() {
        return super.toString()
                + " | Empresa: " + empresa
                + " | Servicio: " + tipoServicio;
    }
}