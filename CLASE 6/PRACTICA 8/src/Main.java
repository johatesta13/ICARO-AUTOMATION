//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

     //Creacion de dispositivos

     Luz luzcocina= new Luz("COCINA");
     Luz luzliving = new Luz("LIVING");
     Ventilador ventihabitacion = new Ventilador("HABITACION");
     Televisor tvsamsung = new Televisor("SAMSUNG");
     Televisor tvphilips = new Televisor("PHILIPS");

     List<Encendible> dispositivos = new ArrayList<>();

     dispositivos.add(luzcocina);
    dispositivos.add(luzliving);
    dispositivos.add(ventihabitacion);
    dispositivos.add(tvsamsung);
    dispositivos.add(tvphilips);

    System.out.println("ENCENDIENDO TODOS LOS DISPOSITIVOS");
    for(Encendible dispositivo : dispositivos){
        dispositivo.Encender();

    }
    System.out.println();


    System.out.println("APAGAR TODOS LOS DISPOSITIVOS");
    for(Encendible dispositivo : dispositivos){
        dispositivo.Apagar();

    }

}
