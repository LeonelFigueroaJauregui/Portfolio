/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio8;

/**
 *
 * @author Leonel
 */




public class Circulo extends FigurasGeometricas{

    public Circulo(double medidaInicial) {
        super(medidaInicial);
    }

    @Override
    double calcularArea() {
        System.out.println("Circulo");
        return Math.PI*(medidaInicial*medidaInicial);
        
    }

    @Override
    double calcularPerimetros() {
        System.out.println("Circulo");
        return 2*Math.PI* medidaInicial;
    }
    
    
}

