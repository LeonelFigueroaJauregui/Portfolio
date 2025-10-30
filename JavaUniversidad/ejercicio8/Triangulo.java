/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio8;

/**
 *
 * @author Leonel
 */



public class Triangulo extends FigurasGeometricas{
double base, altura;
    public Triangulo(double medidaInicial, double Base, double Altura) {
        super(medidaInicial);
        this.base=Base;
        this.altura=Altura;
    }

    @Override
    double calcularArea() {
        System.out.println("Triangulo");
        return (base*altura)/2;
    }

    @Override
    double calcularPerimetros() {
        return medidaInicial*2 + base;
    }
    
    
}

