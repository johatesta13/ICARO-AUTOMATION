public class Gato extends Animal {

        // Constructor vacío
        public Gato() {
            super();
        }

        // Constructor con parámetros
        public Gato(String nombre, int edad) {
            super(nombre, edad);
        }



       @Override
        public String comunicarse() {
        return "Maullando...";
    }
    }


