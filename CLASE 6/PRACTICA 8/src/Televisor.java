public class Televisor implements Encendible{

    private String marca;
    private boolean encendido;


    public Televisor(String marca){
        this.marca= marca;
        this.encendido= false;

    }


    @Override
    public void Encender(){
        this.encendido= true;
        System.out.println("El televisor de" + marca +"está encendido");
    }

    @Override
    public void Apagar(){
        this.encendido= false;
        System.out.println("El televisor de" + marca +"está apagado");
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }
}
