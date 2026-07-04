# 🌄 LlanquihueTourPolimorfismo

Aplicación desarrollada en **Java** para la agencia de turismo **Llanquihue Tour**, aplicando los conceptos de **Programación Orientada a Objetos**, **herencia**, **polimorfismo** y **colecciones genéricas**.

---

# 📖 Descripción

Este proyecto corresponde a la actividad de la **Semana 7**, donde se amplía la jerarquía de clases creada anteriormente incorporando polimorfismo y una colección genérica para administrar distintos servicios turísticos.

El sistema permite almacenar diferentes tipos de servicios turísticos en una misma colección y recorrerlos utilizando referencias de la superclase `ServicioTuristico`.

---

# 🎯 Objetivo de esta semana

Implementar una solución orientada a objetos que permita:

- Aplicar herencia entre clases.
- Implementar polimorfismo mediante una superclase.
- Utilizar una colección `List<ServicioTuristico>`.
- Recorrer los objetos utilizando un ciclo `for-each`.
- Sobrescribir el método `mostrarInformacion()` en cada subclase.
- Organizar el proyecto utilizando paquetes.

---

# 📂 Estructura del proyecto

```
src
│
├── model
│   ├── ServicioTuristico.java
│   ├── RutaGastronomica.java
│   ├── PaseoLacustre.java
│   └── ExcursionCultural.java
│
├── data
│   └── GestorServicios.java
│
└── ui
    └── Main.java
```

---

# 🧩 Clases desarrolladas

### ServicioTuristico
Superclase que contiene la información común de todos los servicios turísticos.

Atributos:

- Nombre
- Duración (horas)

Método principal:

- `mostrarInformacion()`

---

### RutaGastronomica

Hereda de ServicioTuristico.

Atributo adicional:

- Número de paradas.

---

### PaseoLacustre

Hereda de ServicioTuristico.

Atributo adicional:

- Tipo de embarcación.

---

### ExcursionCultural

Hereda de ServicioTuristico.

Atributo adicional:

- Lugar histórico.

---

### GestorServicios

Clase encargada de administrar la colección de servicios turísticos utilizando una lista genérica (`List<ServicioTuristico>`).

---

### Main

Punto de entrada del sistema.

Obtiene la colección de servicios y muestra la información por consola aplicando polimorfismo.

---

# 💻 Tecnologías utilizadas

- Java
- IntelliJ IDEA
- Programación Orientada a Objetos (POO)
- Herencia
- Polimorfismo
- Colecciones Genéricas (List)
- Sobrescritura de métodos (@Override)

---

# ▶️ Instrucciones para ejecutar

1. Abrir el proyecto en IntelliJ IDEA.
2. Esperar a que el proyecto cargue completamente.
3. Ejecutar la clase:

```
ui.Main
```

4. El programa mostrará por consola todos los servicios turísticos registrados utilizando polimorfismo.

---

# 👨‍💻 Autor

Sebastián Estrada

Proyecto académico desarrollado para la asignatura de Programación Orientada a Objetos.
