package com.mycompany.practica5_historial_de_navegacion;


//CLASE NODO
public class NodoHistorial {
    String url;
    NodoHistorial siguiente;
    NodoHistorial anterior;

    public NodoHistorial(String url) {
        this.url = url;
    }
}

