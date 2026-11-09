package model;

// La clase base: los datos que tiene cualquier persona de la agencia.
// Guia la usa como base con "extends" (herencia).
public class Persona {

    private String nombre;
    private String rut;
    private int edad;
    private Direccion direccion; // composición: la Persona lleva una Direccion adentro

    public Persona(String nombre, String rut, int edad, Direccion direccion) {
        this.nombre = nombre;
        setRut(rut); // pasa por el setter para que se valide el RUT
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

    // Solo guarda el RUT si es válido; si no, avisa con un error
    public void setRut(String rut) {
        if (!validarRut(rut)) {
            throw new IllegalArgumentException("RUT no válido: " + rut);
        }
        this.rut = rut;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    // Valida un RUT con el algoritmo módulo 11 (el que usan los validadores que hay en internet).
    // Acepta "12.345.678-5" o "12345678-5". Devuelve true si el dígito verificador calza.
    public static boolean validarRut(String rut) {
        if (rut == null) {
            return false;
        }

        // Sacamos puntos y espacios, y dejamos la K en mayúscula
        String limpio = rut.replace(".", "").replace(" ", "").toUpperCase();

        // Tiene que ser: 7 u 8 números, un guion y un dígito (o K)
        if (!limpio.matches("[0-9]{7,8}-[0-9K]")) {
            return false;
        }

        String numeros = limpio.substring(0, limpio.length() - 2);
        char dv = limpio.charAt(limpio.length() - 1);

        // De derecha a izquierda, multiplicamos cada número por 2, 3, 4, 5, 6, 7, 2, 3...
        int suma = 0;
        int multiplicador = 2;
        for (int i = numeros.length() - 1; i >= 0; i--) {
            suma += (numeros.charAt(i) - '0') * multiplicador;
            multiplicador++;
            if (multiplicador > 7) {
                multiplicador = 2;
            }
        }

        // El dígito verificador esperado sale de 11 menos el resto de dividir por 11
        int resultado = 11 - (suma % 11);
        char esperado;
        if (resultado == 11) {
            esperado = '0';
        } else if (resultado == 10) {
            esperado = 'K';
        } else {
            esperado = (char) ('0' + resultado);
        }

        return dv == esperado;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre
                + " | RUT: " + rut
                + " | Edad: " + edad
                + " | Dirección: " + direccion;
    }
}