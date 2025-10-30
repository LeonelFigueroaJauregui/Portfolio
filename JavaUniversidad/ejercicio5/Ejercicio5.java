/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio5;

/**
 *
 * @author Leonel
 */
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Persona persona = null; // inicialmente no hay persona registrada
        int opcion;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Insertar datos");
            System.out.println("2. Mostrar datos");
            System.out.println("3. Definir mayoria de edad");
            System.out.println("4. Salir");
            System.out.print("Elige una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    // Insertar datos de la persona
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();

                    System.out.print("Apellido Paterno: ");
                    String apellidoP = sc.nextLine();

                    System.out.print("Apellido Materno: ");
                    String apellidoM = sc.nextLine();

                    System.out.print("Fecha de nacimiento (AAAA-MM-DD): ");
                    String fechaNacimiento = sc.nextLine();

                    System.out.print("Genero: ");
                    String genero = sc.nextLine();

                    System.out.print("Edad: ");
                    int edad = sc.nextInt();
                    sc.nextLine(); // limpiar buffer

                    persona = new Persona(nombre, apellidoP, apellidoM, fechaNacimiento, genero, edad);
                    System.out.println("✅ Datos insertados correctamente.");
                    break;

                case 2:
                    // Mostrar datos
                    if (persona != null) {
                        System.out.println("\n--- DATOS DE LA PERSONA ---");
                        System.out.println("Nombre: " + persona.getNombre());
                        System.out.println("Apellido Paterno: " + persona.getApellidoP());
                        System.out.println("Apellido Materno: " + persona.getApellidoM());
                        System.out.println("Fecha de nacimiento: " + persona.getFechaNacimiento());
                        System.out.println("Género: " + persona.getGenero());
                        System.out.println("Edad: " + persona.getEdad());
                    } else {
                        System.out.println("⚠️ No hay datos registrados.");
                    }
                    break;

                case 3:
                    // Definir mayoría de edad
                    if (persona != null) {
                        System.out.print(persona.getNombre() + ": ");
                        persona.mayorEdad();
                    } else {
                        System.out.println("⚠️ No hay datos registrados.");
                    }
                    break;

                case 4:
                    System.out.println("👋 Saliendo del programa...");
                    break;

                default:
                    System.out.println("❌ Opción no válida, intenta de nuevo.");
            }
        } while (opcion != 4);

        sc.close();
    }
}
