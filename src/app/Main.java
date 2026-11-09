package app;

import model.Cliente;
import model.Direccion;
import model.Guia;
import model.Proveedor;
import model.RegistroPersonas;
import model.Rut;
import util.RutInvalidoException;

// Punto de entrada del programa: acá se crean los objetos y se muestran por consola.
public class Main {
    public static void main(String[] args) {

        // Paso 1: el registro donde vamos a guardar a todas las personas (máx. 10)
        RegistroPersonas registro = new RegistroPersonas(10);

        // Paso 2: las direcciones (cada persona tiene la suya)
        Direccion dirCliente = new Direccion("Av. Vicente Pérez Rosales 450", "Llanquihue", "Los Lagos");
        Direccion dirGuia1 = new Direccion("Calle Errázuriz 123", "Puerto Varas", "Los Lagos");
        Direccion dirGuia2 = new Direccion("Av. Philippi 880", "Frutillar", "Los Lagos");
        Direccion dirProveedor = new Direccion("Camino a Ensenada km 2", "Puerto Varas", "Los Lagos");

        // Paso 3: las personas. Cada una tiene un rol distinto, pero todas son "Persona"
        Cliente cliente = new Cliente("Camila Vargas", new Rut("12.345.678-5"), 34, dirCliente,
                "Chilena", "Paseo lacustre por el Lago Llanquihue");
        Guia guia1 = new Guia("Luis Soto", new Rut("11.111.111-1"), 41, dirGuia1, "Inglés", 15000);
        Guia guia2 = new Guia("Marta Rojas", new Rut("22.222.222-2"), 29, dirGuia2, "Alemán", 18000);
        Proveedor proveedor = new Proveedor("Pedro Muñoz", new Rut("15.432.109-8"), 52, dirProveedor,
                "Transportes Lago Sur", "Transporte");

        // Paso 4: las guardamos en el registro
        registro.registrar(cliente);
        registro.registrar(guia1);
        registro.registrar(guia2);
        registro.registrar(proveedor);

        // Paso 5: mostramos todo (println usa el toString() de cada objeto)
        System.out.println("=== Llanquihue Tour: registro de personas ===");
        System.out.println(registro);
        System.out.println();
        System.out.println("Total: " + registro.getCantidad() + " personas ("
                + registro.contarPorRol("Cliente") + " cliente, "
                + registro.contarPorRol("Guía") + " guías, "
                + registro.contarPorRol("Proveedor") + " proveedor)");

        // Paso 6: probamos que el sistema rechaza datos malos
        System.out.println();
        System.out.println("=== Control de datos ===");

        // Mismo RUT que Camila (que ya es cliente), pero ahora como guía: debe fallar
        try {
            registro.registrar(new Guia("Camila Vargas", new Rut("12345678-5"), 34, dirCliente,
                    "Francés", 17000));
        } catch (IllegalArgumentException e) {
            System.out.println("Rechazado: " + e.getMessage());
        }

        // RUT con el dígito verificador malo (el correcto sería 5): debe fallar
        try {
            new Rut("12.345.678-9");
        } catch (RutInvalidoException e) {
            System.out.println("Rechazado: " + e.getMessage());
        }
    }
}
