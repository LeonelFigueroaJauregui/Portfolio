/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio7;

/**
 *
 * @author Leonel
 */
public class AgentesEscolares {

    
    //OONSTRUCTOR
    public AgentesEscolares(String nombre, String FechaNacimiento, String Codigo) {
        this.nombre = nombre;
        this.FechaNacimiento = FechaNacimiento;
        this.Codigo = Codigo;
    }
    
    
    
//GETTER AND SETTER
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(String FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }
    
    
//ATRiBUTOS
    
    String nombre;
    String FechaNacimiento;
    String Codigo;
    AgentesEscolares(){};

}





