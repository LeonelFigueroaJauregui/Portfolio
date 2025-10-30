
package com.mycompany.ejercicio11_login;

public class Usuario {
    private String id;
    private String contraseña;

    // Constructor
    public Usuario(String id, String contraseña) {
        this.id = id;
        this.contraseña = contraseña;
    }

    // Getters y Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}
