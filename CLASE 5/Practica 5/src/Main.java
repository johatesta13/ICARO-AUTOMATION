public class Main {
    public static void main(String[] args) {
        // Crear objetos
        Perro max = new Perro("Max", 3);
        Gato michi = new Gato("Michi", 2);

        System.out.println(max.getNombre() + "dice" + max.comunicarse());
        System.out.println(michi.getNombre() + "dice" + michi.comunicarse());

        System.out.println("Usando polimorfismo");

        Animal animal1 =  new Gato("Michi Polimorfismo",4);
        Animal animal2 =  new Perro("Michi Polimorfismo",4);

        System.out.println(animal1.getNombre() + "dice" + animal1.comunicarse());
        System.out.println(animal2.getNombre() + "dice" + animal2.comunicarse());
    }
}