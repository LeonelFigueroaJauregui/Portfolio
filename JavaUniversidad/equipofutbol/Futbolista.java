package com.leonel.equipofutbol;

// Herencia + Clase
public class Futbolista extends PersonaEquipo {
    // Encapsulamiento
    private int dorsal;
    private String demarcacion;

    // Constructor
    public Futbolista(int id, String nombre, String apellido, int edad, int dorsal, String demarcacion) {
        super(id, nombre, apellido, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    @Override
    public void concentrarse() {   // Polimorfismo
        System.out.println(nombre + " " + apellido + " (Futbolista) se concentra en la estrategia del partido.");
    }

    @Override
    public void viajar() {   // Polimorfismo
        System.out.println(nombre + " viaja en autobus con el equipo.");
    }

    public void jugarPartido() {   // Método específico
        System.out.println(nombre + " esta jugando en la posicion " + demarcacion + " con el dorsal " + dorsal + ".");
    }

    public void entrenar() {   // Método específico
        System.out.println(nombre + " esta entrenando en el campo.");
    }
}
