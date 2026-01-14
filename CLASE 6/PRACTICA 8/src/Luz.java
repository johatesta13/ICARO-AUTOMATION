public class Luz implements Encendible{

    private String ubicacion;
    private boolean encendida;

    public Luz(String ubicacion){
         this.ubicacion= ubicacion;
         this.encendida= false;

    }

    @Override
    public void Encender(){
        this.encendida= true;
        System.out.println("La luz de" + ubicacion +"está encendida");
    }

    @Override
    public void Apagar(){
        this.encendida= false;
        System.out.println("La luz de" + ubicacion +"está apagada");
    }


    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public boolean isEncendida() {
        return encendida;
    }

    public void setEncendida(boolean encendida) {
        this.encendida = encendida;
    }
}
