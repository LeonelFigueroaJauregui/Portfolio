package com.mycompany.practica_6_control_de_imagen;

import javax.swing.ImageIcon;

//ATRIBUTOS
public class Nodo {

    String nombre;
    String fecha;
    String descripcion;

    ImageIcon foto;

    Nodo siguiente;
    Nodo anterior;

    public Nodo(String nombre, String fecha, String descripcion, ImageIcon foto) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.foto = foto;
    }
}
