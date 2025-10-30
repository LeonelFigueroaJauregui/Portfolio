package com.leonel.equipofutbol;

// Clase + Abstracción
public abstract class PersonaEquipo {
    // Encapsulamiento
    protected int id;
    protected String nombre;
    protected String apellido;
    protected int edad;

    // Constructor
    public PersonaEquipo(int id, String nombre, String apellido, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    // Métodos abstractos
    public abstract void concentrarse();
    public abstract void viajar();
}
