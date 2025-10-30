/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio8;

/**
 *
 * @author Leonel
 */



public class Cuadrado extends FigurasGeometricas {

    public Cuadrado(double medidaInicial) {
        super(medidaInicial);
    }

    

    @Override
    double calcularArea() {
        System.out.println("Cuadrado"); 
        return medidaInicial*medidaInicial;
    }

    @Override
    double calcularPerimetros() {
        System.out.println("Cuadrado");
        return medidaInicial*4;
    }
    
}

