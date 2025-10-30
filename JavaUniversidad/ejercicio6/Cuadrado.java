/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio6;

/**
 *
 * @author Leonel
 */


public class Cuadrado extends Figura {

    public Cuadrado(String nombre, String color, int lado, float Rarea, float Rperimetro) {
        super(nombre, color, lado, Rarea, Rperimetro);
    }
    
    void area(){
        Rarea = (lado*lado)/2;
        System.out.println("Area " + Rarea);
        
        
    }
    
    
 
}
