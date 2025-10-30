/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio8;

/**
 *
 * @author Leonel
 */




public abstract class FigurasGeometricas {
    
    protected double medidaInicial; 
    abstract double calcularArea();
    abstract double calcularPerimetros();

    public FigurasGeometricas(double medidaInicial) {
        this.medidaInicial = medidaInicial;
    }
    
    
   
}
