//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

     Estudiante est= new Estudiante(100, "MARIA TESTA",9.5f);
     Estudiante est2 = new Estudiante(101,"Juana Testa",7.0f);
     Estudiante est1= new Estudiante();

      est1.setNombreCompleto("Ana");
      est1.setId(25);
      est1.setPromedio(3.0f);

    System.out.println("ID: " + est.getId());
    System.out.println("Nombre Completo: " + est.getNombreCompleto());
    System.out.println("Promedio: " + est.getPromedio());

    //ejemplo constructor vacio
    System.out.println("ID: " + est1.getId().toString());
    System.out.println("Nombre Completo: " + est1.getNombreCompleto());
    System.out.println("Promedio: " + est1.getPromedio());



    //ejemplo get privado clase Estudiante2

    Estudiante2 estudiante2 = new Estudiante2(105,"Johana Testa", 4.0f);

   // System.out.println("ID: " + estudiante2.getId());

    //System.out.println(estudiante2.id);
    estudiante2.setPromedio(11f);

}

