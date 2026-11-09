![Duoc UC](https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png)
# 🏔️ Llanquihue Tour – Modelo de personas (Semana 3)

## 👤 Autor del proyecto
- **Nombre completo:** José Amaro Cárdenas Manterola
- **Sección:** [Escribe aquí tu sección]
- **Carrera:** Analista Programador Computacional
- **Sede:** Online

---

## 📘 Descripción general del sistema
Prototipo en Java para **Llanquihue Tour**, agencia de turismo ubicada en Llanquihue (Región de Los Lagos). La agencia gestiona hoy a sus clientes, guías y proveedores de forma manual y desordenada; este proyecto propone un **modelo de clases** que representa a esas personas de forma estructurada, validada y reutilizable, como base para futuras fases del sistema.

Se aplican los principios de **encapsulamiento**, **herencia** y **composición**, con el código organizado en paquetes.

---

## 🧱 Estructura del proyecto

```plaintext
📁 src/
├── app/
│   └── Main.java                  # Clase principal: crea objetos y los muestra por consola
├── model/
│   ├── Persona.java               # Clase base: nombre, edad, rut y dirección
│   ├── Direccion.java             # Composición: calle, ciudad y región
│   ├── Rut.java                   # Composición: RUT con validación de dígito verificador
│   ├── Cliente.java               # Hereda de Persona: nacionalidad y tour contratado
│   ├── Guia.java                  # Hereda de Persona: idioma y tarifa por hora
│   └── Proveedor.java             # Hereda de Persona: empresa y tipo de servicio
└── util/
    └── RutInvalidoException.java  # Excepción propia para RUT inválidos
```

---

## ⚙️ Instrucciones para clonar y ejecutar el proyecto

1. Clona el repositorio desde GitHub:

```bash
git clone https://github.com/jacmant/LlanquihueTourSumativa.git
```

2. Abre el proyecto en IntelliJ IDEA (JDK 17 o superior).

3. Ejecuta `Main.java` desde el paquete `app` (clic derecho → *Run 'Main.main()'*).

**Por terminal** (desde la raíz del proyecto):

```bash
javac -encoding UTF-8 -d out src/util/*.java src/model/*.java src/app/Main.java
java -cp out app.Main
```

---

## 🖥️ Salida esperada por consola

```plaintext
=== Llanquihue Tour: registro de personas ===
[Cliente] Camila Vargas | RUT: 12.345.678-5 | Edad: 34 | Dirección: Av. Vicente Pérez Rosales 450, Llanquihue, Los Lagos | Nacionalidad: Chilena | Tour: Paseo lacustre por el Lago Llanquihue
[Guía] Luis Soto | RUT: 11.111.111-1 | Edad: 41 | Dirección: Calle Errázuriz 123, Puerto Varas, Los Lagos | Idioma: Inglés | Tarifa por hora: $15000
[Guía] Marta Rojas | RUT: 22.222.222-2 | Edad: 29 | Dirección: Av. Philippi 880, Frutillar, Los Lagos | Idioma: Alemán | Tarifa por hora: $18000
[Proveedor] Pedro Muñoz | RUT: 15.432.109-8 | Edad: 52 | Dirección: Camino a Ensenada km 2, Puerto Varas, Los Lagos | Empresa: Transportes Lago Sur | Servicio: Transporte

--- Probando un setter ---
Nueva tarifa de Luis Soto: $16500
Ciudad del cliente: Llanquihue

--- Solo los guías ---
Luis Soto habla Inglés
Marta Rojas habla Alemán

--- Probando validaciones ---
Error de RUT: El dígito verificador no corresponde: 12.345.678-9
Error de edad: La edad debe estar entre 0 y 120
```

---


**Repositorio GitHub:** https://github.com/jacmant/LlanquihueTourSumativa

**Fecha de entrega:** [09/11/2026]

---

© Duoc UC | Escuela de Informática y Telecomunicaciones | Desarrollo Orientado a Objetos I