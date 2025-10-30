/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio3;

/**
 *
 * @author Leonel
 */

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Instanciamos la clase Login
        Login login = new Login();

        boolean salir = false;

        // ===== MENÚ PRINCIPAL =====
        while (!salir) {
            System.out.println("---- MENÚ PRINCIPAL ----");
            System.out.println("1. Crear usuario");
            System.out.println("2. Iniciar sesión");
            System.out.println("3. Recuperar contraseña");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");

            int opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer del scanner

            // Dependiendo de la opción, llamamos al método correspondiente
            switch (opcion) {
                case 1:
                    login.CrearUsuario();          // Llama al método crear usuario
                    break;
                case 2:
                    login.Inicio_Sesion();         // Llama al método iniciar sesión
                    break;
                case 3:
                    login.recuperar_contraseña();   // Llama al método recuperar contraseña
                    break;
                case 4:
                    System.out.println("Saliendo del sistema...");
                    salir = true;                  // Sale del bucle
                    break;
                default:
                    System.out.println("Opción inválida, intenta nuevamente.");
            }
            System.out.println(); // Salto de línea para que se vea más limpio
        }

        sc.close();
    }
}
