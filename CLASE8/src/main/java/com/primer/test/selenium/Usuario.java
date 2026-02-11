package com.primer.test.selenium;

public class Usuario {
    private final String username;
    private final String password;
    private boolean estaLogueado;

    public Usuario(String username, String password){
        this.username=username;
        this.password=password;
        this.estaLogueado=false;
    }


    /**
     * Intenta hacer login con el password proporcionado.
     * @param passwordIngresado el password a verificar
     * @return true si el login es exitoso, false si no
     */

    public boolean login(String passwordIngresado){
        if(this.password.equals(passwordIngresado)){
            this.estaLogueado=true;
            return true;
        }
        return false;
    }

    /**
     * Cierra la sesión del usuario.
     */
    public void logout(){
        this.estaLogueado=false;
    }


    /**
     * Verifica si las credenciales son válidas.
     * Username no vacío y password de al menos 4 caracteres.
     * @return true si las credenciales son válidas
     */
    public boolean esValido(){
            return username != null && password != null && password.length() > 4;
    }

    /**
     * @return true si el usuario está logueado
     */
    public boolean estaLogueado(){
        return this.estaLogueado;
    }

    /**
     * @return el username
     */
    public String getUsername() {
        return username;
    }
}
