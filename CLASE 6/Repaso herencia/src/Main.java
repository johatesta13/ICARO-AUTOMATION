void main (){

        Cliente cliente1 = new Cliente("Juan Pérez", "12345678");
        ClienteVip cliente2 = new ClienteVip("María García", "87654321");

        cliente1.depositar(1000);
        cliente2.depositar(1000); // Recibe bonificación

        System.out.println("\n--- Información de clientes ---");
        cliente1.mostrarInfo();
        System.out.println();
        cliente2.mostrarInfo();
    }

