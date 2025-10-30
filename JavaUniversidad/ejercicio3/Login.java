/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio3;

/**
 *
 * @author Leonel
 */

   
import java.util.Scanner;

public class Login {
    // ===== ATRIBUTOS =====
    private String usuario;
    private String contrasena;
    private Scanner sc = new Scanner(System.in);

    // ===== CONSTRUCTORES =====
    public Login() {
        this.usuario = null;
        this.contrasena = null;
    }

    public Login(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    // ===== MÉTODOS =====

    // Crear usuario
    public void crearUsuario() {
        System.out.print("Ingrese un nombre de usuario: ");
        usuario = sc.nextLine();
        System.out.print("Ingrese una contraseña: ");
        contrasena = sc.nextLine();
        System.out.println("✅ Usuario creado con éxito.\n");
    }

    // Iniciar sesión
    public void iniciarSesion() {
        if (usuario == null || contrasena == null) {
            System.out.println("⚠ No hay usuarios registrados. Cree un usuario primero.\n");
            return;
        }      

        System.out.print("Ingrese usuario: ");
        String user = sc.nextLine();
        System.out.print("Ingrese contraseña: ");
        String pass = sc.nextLine();

        if (user.equals(usuario) && pass.equals(contrasena)) {
            System.out.println("✅ Inicio de sesión exitoso.\n");
        } else {
            System.out.println("❌ Usuario o contraseña incorrectos.\n");
        }
    }

    // Recuperar contraseña
    public void recuperarContrasena() {
        if (usuario == null) {
            System.out.println("⚠ No hay usuarios registrados.\n");
            return;
        }

        System.out.print("Ingrese su usuario: ");
        String user = sc.nextLine();

        if (user.equals(usuario)) {
            System.out.println("🔑 Su contraseña es: " + contrasena + "\n");
        } else {
            System.out.println("❌ Usuario no encontrado.\n");
        }
    }
}
