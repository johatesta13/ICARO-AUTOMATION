public class OperadorLogico {

    public void main(){

        int edad= 20;
        boolean tieneDni= true;

        System.out.println(edad>=18 && tieneDni);
        System.out.println(edad>=25 && tieneDni);

        System.out.println( edad<18 || tieneDni);
        System.out.println( edad<25 || tieneDni);
        System.out.println(!tieneDni);
    }
}
