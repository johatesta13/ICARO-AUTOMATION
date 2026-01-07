import java.util.Scanner;

public class ejerciciowhile
{

   public void main(){
       Scanner sc = new Scanner(System.in);

       int numero;
       int contador = 0;

       do {
           System.out.print("Ingresá un número: ");
           numero = sc.nextInt();
           contador++;
       } while (numero <= 500);

       System.out.println("Cantidad de números ingresados: " + contador);
   }
}
