//LEONEL FIGUEROA JAUREGUI                                 19/01/2026
//PRACTICA 1
package com.mycompany.tres_en_raya;

public class Jugadores {

    private String Nombre;
    private String turno;   // "X" o "O"
    private int puntos;     // puntos de la partida actual
    private int victorias;  // victorias históricas (ranking)

    // Constructor
    public Jugadores(String Nombre, String turno, int puntos) {
        this.Nombre = Nombre;
        this.turno = turno;
        this.puntos = puntos;
        this.victorias = 0; // inicializamos en 0
    }

    // Getters y Setters
    public String getNombre() { return Nombre; }
    public void setNombre(String nombre) { this.Nombre = nombre; }

    public String getTurno() { return turno; }
    public void setTurno(String turno) { this.turno = turno; }

    public int getPuntos() { return puntos; }
    public void setPuntos(int puntos) { this.puntos = puntos; }

    public int getVictorias() { return victorias; }
    public void setVictorias(int victorias) { this.victorias = victorias; }

    // Métodos 
    public void sumarPunto() { this.puntos++; }      // puntos de la partida
    public void sumarVictoria() { this.victorias++; } // victorias para ranking
}




