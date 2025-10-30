package com.leonel.equipofutbol;

// Herencia + Clase
public class Masajista extends PersonaEquipo {
    // Encapsulamiento
    private String titulacion;
    private int aniosExperiencia;

    // Constructor
    public Masajista(int id, String nombre, String apellido, int edad, String titulacion, int aniosExperiencia) {
        super(id, nombre, apellido, edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    @Override
    public void concentrarse() {   // Polimorfismo
        System.out.println(nombre + " " + apellido + " (Masajista) se concentra en preparar a los jugadores.");
    }

    @Override
    public void viajar() {   // Polimorfismo
        System.out.println(nombre + " viaja en coche de apoyo con el equipo.");
    }

    public void darMasaje() {   // Método específico
        System.out.println(nombre + " esta dando un masaje a un jugador.");
    }
}
