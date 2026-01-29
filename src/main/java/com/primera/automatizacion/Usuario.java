package com.primera.automatizacion;

import java.util.Objects;

public class Usuario {

    public String getUsername() {
        return username;
    }

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

   public boolean login(String passwordIngresada){
       if (Objects.equals(passwordIngresada, this.password)) {
           this.estaLogueado= true;
           return true;
       }
       return false;
   }

   public boolean logout(){

        this.estaLogueado=false;
        return true;
   }

   public boolean esValido(){
        return username != null && !username.isEmpty() && password!=null && password.length()>=4;

   }
   public boolean estalogueado(){
        return estaLogueado;
   }




}

