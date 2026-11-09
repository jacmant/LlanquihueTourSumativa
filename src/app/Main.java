package app;

//Importamos las clases que creamos anteriormente

import model.Direccion;
import model.Persona;
import model.Guia;

public class Main{
    public static void main (String [] args){
        Direccion dir1 = new Direccion("Los Naranjos 7720","Temuco", "Araucanía");
        Direccion dir2 = new Direccion("Puente Viejo 6644", "Pucón", "Araucanía");

        Persona cliente = new Persona("Sebastian Piñera", "9.111.973-K", 67,dir1);
            Guia guia1 = new Guia("Luis Soto", "11111111-1", 41, dir2, "Inglés", 15000.0);
            Guia guia2 = new Guia("Marta Rojas", "22222222-2", 29, dir1, "Alemán", 18000.0);

     System.out.println("=== Llanquihue Tour: registro de personas ===");
        System.out.println();
        System.out.println("--- Cliente ---");
        System.out.println(cliente);
        System.out.println();
        System.out.println("--- Guías ---");
        System.out.println(guia1);
        System.out.println(guia2);
        System.out.println();
        System.out.println("--- Probando un setter ---");
        guia1.setTarifaPorHora(16500.0);
        System.out.println("Nueva tarifa de " + guia1.getNombre() + ": $" + guia1.getTarifaPorHora());
    }
}