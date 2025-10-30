/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio6;

/**
 *
 * @author Leonel
 */
public class Figura {

    
    //Constructor
    public Figura(String nombre, String color, int lado, float Rarea, float Rperimetro) {
        this.nombre = nombre;
        this.color = color;
        this.lado = lado;
        this.Rarea = Rarea;
        this.Rperimetro = Rperimetro;
    }

    //Getter y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public float getRarea() {
        return Rarea;
    }

    public void setRarea(float Rarea) {
        this.Rarea = Rarea;
    }

    public float getRperimetro() {
        return Rperimetro;
    }

    public void setRperimetro(float Rperimetro) {
        this.Rperimetro = Rperimetro;
    }
    
    protected String nombre;
    protected String color;
    protected int lado;
    protected float Rarea;
    protected float Rperimetro;
    
    void perimetro(){
        Rperimetro = lado*4;
    }
}
