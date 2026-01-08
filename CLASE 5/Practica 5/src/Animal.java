public class Animal {
    protected String nombre;
    protected int edad;

    // Constructor vacío
    public Animal() {
    }

    // Constructor con parámetros
    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    //Método que será sobrescrito
    public String comunicarse() {
        return "El animal hace un sonido...";
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}