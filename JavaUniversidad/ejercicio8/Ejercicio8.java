/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio8;

/**
 *
 * @author Leonel
 */
public class Ejercicio8 {

    public static void main(String[] args) {
        
        FigurasGeometricas[] misFiguras = new FigurasGeometricas[3];
        misFiguras[0] = new Circulo(5);
        misFiguras[1] = new Cuadrado(5);
        misFiguras[2] = new Triangulo(5, 8, 6); 
      
        for (FigurasGeometricas variableTemporal: misFiguras){
            
            System.out.println("Perimetro: " + variableTemporal.calcularPerimetros());
            System.out.println("Area: " + variableTemporal.calcularArea());
            System.out.println("_________");
        }
        
        
    }
}
