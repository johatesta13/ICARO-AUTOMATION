import java.util.ArrayList;

public class Docente extends Persona {

    private ArrayList<Alumno>alumnos;

    public Docente(String nombre, String apellido){
        super(nombre,apellido);
        this.alumnos = new ArrayList<>();
    }

    // Getters y setters
    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    //
    public void agregarAlumno(Alumno alumno) {
        this.alumnos.add(alumno);
    }
}

