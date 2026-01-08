public class Perro extends Animal {

    // Constructor vacío
    public Perro() {
        super(); // Llama al constructor vacío de Animal
    }

    // Constructor con parámetros
    public Perro(String nombre, int edad) {
        super(nombre, edad); // Llama al constructor con parámetros de Animal
    }

    //sobrescritura del metodo comunicarse
    @Override
    public String comunicarse() {
        return "Ladrando...";
    }

}
