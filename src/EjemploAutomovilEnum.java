public class EjemploAutomovilEnum {
    public static void main(String[] args) {

        // Creación de un objeto de la clase Automóvil
        Automovil toyota = new Automovil("Toyota", "Corolla");


        toyota.setColor(Color.BLANCO); //Asigno un valor al atributo color
        toyota.setMotor(new Motor(3.0, TipoMotor.GASOLINA)); //Asigno un valor al atributo cilindros
        toyota.setTipo(TipoAutomovil.COUPE); //Asigno un valor al atributo tipo
        toyota.setTanque(new Tanque(45)); //Asigno un valor al atributo cilindros
        //Creación de un objeto Automóvil
        Automovil nissan = new Automovil("Nissan", "Sentra", Color.ROJO, new Motor(3.0, TipoMotor.GASOLINA)); // Creación de un objeto de la clase Automovil

        TipoAutomovil tipo = toyota.getTipo(); //Obtengo el tipo de automóvil
        System.out.println("Tipo Toyota: " + tipo); //Imprimo el tipo de automóvil
        System.out.println("Tipo descripción Toyota: " + tipo.getDescripcion()); //Imprimo la descripción del tipo de automóvil

        tipo = toyota.getTipo();
        switch (tipo){
            case CONVERTIBLE -> System.out.println("Es es un auto deportivo");
            case COUPE -> System.out.println("Es un auto pequeño");
            case SEDAN -> System.out.println("Es un auto normal");
            case STATION_WAGON -> System.out.println("Es un auto grande");
            case PICK_UP -> System.out.println("Es una camioneta");
            case HATCHBACK -> System.out.println("Es un auto compacto");
            case FURGON -> System.out.println("Es un vehículo de carga");
        }

        TipoAutomovil[] tipos = TipoAutomovil.values();

        for (TipoAutomovil tipoAutomovil : tipos) {
            System.out.println(tipoAutomovil + " -> " + tipoAutomovil.name() + ", " +
                    tipoAutomovil.getNombre() + ", " +
                    tipoAutomovil.getDescripcion() + ", " +
                    tipoAutomovil.getNumeroPuertas() + ", ");

            System.out.println();
        }

    }
}
