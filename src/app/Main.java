package app;

import model.Direccion;
import model.Guia;
import model.Persona;

// Aquí se prueba todo: creamos los objetos y los mostramos por consola.
public class Main {
    public static void main(String[] args) {

        // Las direcciones (cada persona tiene la suya)
        Direccion dirCliente = new Direccion("Av. Vicente Pérez Rosales 450", "Llanquihue", "Los Lagos");
        Direccion dirGuia1 = new Direccion("Calle Errázuriz 123", "Puerto Varas", "Los Lagos");
        Direccion dirGuia2 = new Direccion("Av. Philippi 880", "Frutillar", "Los Lagos");

        // Una persona (cliente) y dos guías
        Persona cliente = new Persona("Camila Vargas", "12.345.678-5", 34, dirCliente);
        Guia guia1 = new Guia("Luis Soto", "15.432.109-8", 41, dirGuia1, "Inglés", 15000);
        Guia guia2 = new Guia("Marta Rojas", "18.765.432-7", 29, dirGuia2, "Alemán", 18000);

        // println usa automáticamente el toString() de cada objeto
        System.out.println("=== Llanquihue Tour ===");
        System.out.println("Cliente: " + cliente);
        System.out.println("Guía 1: " + guia1);
        System.out.println("Guía 2: " + guia2);

        // Probamos la validación de RUT
        System.out.println();
        System.out.println("12.345.678-5 es válido: " + Persona.validarRut("12.345.678-5"));
        System.out.println("12.345.678-9 es válido: " + Persona.validarRut("12.345.678-9"));
    }
}