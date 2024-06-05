public class EjemploAutomovilRelacionesObjetos {
    public static void main(String[] args) {

        // Creación de un objeto de la clase Automóvil
        Rueda[] ruedasToyota = new Rueda[5];

        Persona conductorToyota = new Persona("Juan", "Perez");

        Automovil toyota = new Automovil("Toyota", "Corolla", Color.NEGRO,
                new Motor(3.5, TipoMotor.DIESEL), new Tanque(50),
                conductorToyota, ruedasToyota);

        toyota.setTipo(TipoAutomovil.SEDAN);



        for(int i = 0; i < ruedasToyota.length; i++) {
            toyota.addRueda(new Rueda("Michelin", 16, 215));
        }

        //Creación de un objeto Automóvil
        Rueda[] ruedasNissan = new Rueda[5];

        Persona conductorNissan = new Persona("Pepe", "Marquez");

        Automovil nissan = new Automovil("Nissan", "Sentra", Color.ROJO,
                new Motor(3.5, TipoMotor.DIESEL), new Tanque(40),
                conductorNissan, ruedasNissan); // Creación de un objeto de la clase Automovil

        nissan.setTipo(TipoAutomovil.SEDAN);

        for (int i = 0; i < ruedasNissan.length; i++){
            nissan.addRueda(new Rueda("Yokohama Tyres", 16, 215));
        }

        //Creación de un objeto Automóvil
        Rueda[] ruedasMitsubichi = new Rueda[5];



        Persona conductorMitsubichi = new Persona("Luci", "Martinez");

        Automovil mitsubichi = new Automovil("Mitsubichi", "Lancer",
                Color.AZUL, new Motor(3.5, TipoMotor.DIESEL), new Tanque(30),
                conductorMitsubichi, ruedasMitsubichi);

        mitsubichi.setTipo(TipoAutomovil.HATCHBACK);

        for (int i = 0; i < ruedasMitsubichi.length; i++){
            mitsubichi.addRueda(new Rueda("Pirelli", 16, 215));
        }

        //Invoco todos los métodos
        System.out.println(toyota.verDetalle()); //Invoco el método detalle()
        System.out.println(nissan.verDetalle()); //Invoco el método detalle()
        System.out.println(mitsubichi.verDetalle()); //Invoco el método detalle()



    }
}
