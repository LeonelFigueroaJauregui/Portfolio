package com.leonel.equipofutbol;

// Herencia + Clase
public class Entrenador extends PersonaEquipo {
    // Encapsulamiento
    private String idFederacion;

    // Constructor
    public Entrenador(int id, String nombre, String apellido, int edad, String idFederacion) {
        super(id, nombre, apellido, edad);
        this.idFederacion = idFederacion;
    }

    @Override
    public void concentrarse() {   // Polimorfismo
        System.out.println(nombre + " " + apellido + " (Entrenador) prepara la tactica.");
    }

    @Override
    public void viajar() {   // Polimorfismo
        System.out.println(nombre + " viaja en avion con el equipo.");
    }

    public void dirigirPartido() {   // Método específico
        System.out.println(nombre + " esta dirigiendo el partido.");
    }

    public void dirigirEntrenamiento() {   // Método específico
        System.out.println(nombre + " esta dirigiendo el entrenamiento.");
    }
}
