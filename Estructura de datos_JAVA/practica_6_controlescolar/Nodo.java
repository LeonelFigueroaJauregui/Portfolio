package com.mycompany.practica_6_controlescolar;

import javax.swing.ImageIcon;

//ATRIBUTOS
public class Nodo {

    String nombre;
    String apPaterno;
    String apMaterno;
    String carrera;
    String correo;
    ImageIcon foto;

    Nodo siguiente;
    Nodo anterior;

    //CONSTRUCTOR
    public Nodo(String nombre, String apPaterno, String apMaterno,
                String carrera, String correo, ImageIcon foto) {
        this.nombre = nombre;
        this.apPaterno = apPaterno;
        this.apMaterno = apMaterno;
        this.carrera = carrera;
        this.correo = correo;
        this.foto = foto;
        this.siguiente = null;
        this.anterior = null;
    }
}
