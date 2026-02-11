package ExepecionesPersonalizadas;

public class Persona {
    private String nombre;
    private int edad;

    // Constructor que valida la edad
    public Persona(String nombre, int edad) throws EdadInvalidaException {
        this.nombre = nombre;
        setEdad(edad); // Usa el setter para validar
    }

   public void setEdad(int edad) throws EdadInvalidaException{
        if(edad < 0){
            throw new EdadInvalidaException("La edad no puede ser menor a 0 o negativa");

        }

       if(edad > 120){
           throw new EdadInvalidaException("La edad no puede ser mayor que 120");

       }
       this.edad= edad;
   }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "Persona{nombre='" + nombre + "', edad=" + edad + "}";
    }
}