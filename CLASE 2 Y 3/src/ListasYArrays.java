import java.util.ArrayList;


public class ListasYArrays {

    public void main () {
        //array tamaño fijo

        int[] temperaturas = {25,26,33};

        //lista arraylist

        ArrayList<Integer> notas = new ArrayList<>();

        notas.add(5);
        notas.add(9);
        notas.add(10);


        System.out.println("Notas: " + notas);
        System.out.println("Temperatura[2]: " + temperaturas[2] );


    }

}
