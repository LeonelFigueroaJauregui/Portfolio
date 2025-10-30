/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio6;

/**
 *
 * @author Leonel
 */
public class Rectangulo extends Figura{
    

    public Rectangulo(String nombre, String color, int lado, float Rarea, float Rperimetro) {
        super(nombre, color, lado, Rarea, Rperimetro);
        this.lado2=lado2;
    }
    
    private int lado2;
    void perimetro(){
        Rperimetro=(lado*2) +(lado2*2);
        System.out.println("Perimetro" + Rperimetro);
    }   
                
                
                
        void area(){
        Rarea=(lado*lado2)/2;
            System.out.println("Area" + Rarea);
    }
    
    
    
}
