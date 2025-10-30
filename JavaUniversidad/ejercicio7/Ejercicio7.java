
package com.mycompany.ejercicio7;

import java.util.*;
public class Ejercicio7 {
    
    //MAIN
    public static void main(String[] args) {
        int contador = 0;
        Estudiante cualtos[]=new Estudiante [5];
        int opcion;
                Scanner leer=new Scanner(System.in);
        do{
        System.out.println("MENU!");
        System.out.println("1. Ingresar estudiante: ");
        System.out.println("2. Mostrar");
        System.out.println("3. Salir");
        System.out.println("Teclea tu opcion");
        opcion=leer.nextInt();
        
        switch(opcion){
            case 1: {
                if(contador<5){
                    
                cualtos[contador]=new Estudiante();
                leer.nextLine();
                System.out.println("Nombre");                
                cualtos[contador].setNombre(leer.nextLine());
                System.out.println("Codigo: ");
                cualtos[contador].setCodigo(leer.nextLine());
                System.out.println("Fecha de Nacimiento: ");
                cualtos[contador].setFechaNacimiento(leer.nextLine());
                System.out.println("Carrera: ");
                cualtos[contador].setCarrera(leer.nextLine());
                System.out.println("Semestre:");
                cualtos[contador].setSemestre(leer.nextInt());
                
                contador++;
                }
                else
                    System.out.println("El arreglo de argumentos esta completo");
            }
            case 2:
            {
                for(int i=0; i<contador;i++){
                    System.out.println("Nombre: " + 
                      cualtos[i].getNombre());
                    System.out.println("Codigo: " + 
                      cualtos[i].getCodigo());
                    System.out.println("Fecha de Nacimiento: " + 
                      cualtos[i].getFechaNacimiento());
                    System.out.println("Carrera: " + 
                      cualtos[i].getCarrera());
                    System.out.println("Semestre: " + 
                      cualtos[i].getSemestre());
                }
                
            }
            
                    
            
            
            
        }
        
        }while(opcion!=3);
                
       
    
        
            }//Llave del main


}//Llave final