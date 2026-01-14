public class Ventilador implements Encendible{

    private String ubicacion;
    private boolean encendido;

    public Ventilador(String ubicacion){
        this.ubicacion= ubicacion;
        this.encendido= false;

    }

    @Override
    public void Encender(){
        this.encendido= true;
        System.out.println("El ventilador de" + ubicacion +"está encendido");
    }

    @Override
    public void Apagar(){
        this.encendido= false;
        System.out.println("El ventilador de" + ubicacion +"está apagado");
    }


    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }
}
