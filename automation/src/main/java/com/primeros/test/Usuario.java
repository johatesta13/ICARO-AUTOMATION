package com.primeros.test;

import java.util.Objects;

public class Usuario {

    private String username;
    private String password;
    private boolean estaLogueado;

    // Constructor sin parámetros
    public Usuario() {
    }

    // Constructor con parámetros - USERNAME PRIMERO
    public Usuario(String username, String password) {
        this.username = username;
        this.password = password;
        this.estaLogueado = false;
    }

    public boolean login(String passwordLogin) {
        if (Objects.equals(passwordLogin, this.password)) {
            this.estaLogueado = true;
            return true;
        }
        return false;
    }

    public boolean logout() {
        this.estaLogueado = false;
        return true;
    }

    public boolean esValido() {
        return username != null && !username.isEmpty() &&  // ✅ Valida username vacío
                password != null && password.length() >= 4;
    }

    public boolean estaLogueado() {
        return estaLogueado;
    }

    public String getUsername() {
        return username;
    }


}

