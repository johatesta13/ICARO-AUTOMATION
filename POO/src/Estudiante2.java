public class Estudiante2 {

    private Integer id;
    private String nombreCompleto;
    private Float promedio;

    // constructor vacio
    public Estudiante2() {
    }

    //constructor con los atributos
    public Estudiante2(Integer id, String nombreCompleto, Float promedio ){

        this.id= id;
        this.nombreCompleto= nombreCompleto;
        this.promedio= promedio;

    }
// getters y setters

    private Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public Float getPromedio() {
        return promedio;
    }

    public void setPromedio(Float promedio) {

        if(promedio>=0 && promedio<=10){
            this.promedio = promedio;
        }
        else{
           System.out.println("El promedio debe estar entre el 0 y el 10");
        }
    }
}
