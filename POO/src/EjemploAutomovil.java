public class EjemploAutomovil {
    public static void main(String[] args) {

        Motor motorToyota = new Motor(2.0, TipoMotor.DIESEL);
        // Creación de un objeto de la clase Automóvil
        Automovil toyota = new Automovil("Toyota", "Corolla");

        //toyota.setFabricante(); //Asigno un valor al atributo fabricante
        //toyota.setModelo(); //Modifico el valor asignado al atributo modelo
        toyota.setColor(Color.BLANCO); //Asigno un valor al atributo color
        toyota.setTanque(new Tanque()); //Asigno un valor al atributo cilindros

        //Creación de un objeto Automóvil
        Motor motorNissan = new Motor(3.0, TipoMotor.GASOLINA);
        Automovil nissan = new Automovil("Nissan", "Sentra", Color.ROJO, motorNissan); // Creación de un objeto de la clase Automovil
        nissan.setTanque(new Tanque(45));
        //nissan.setFabricante("Nissan"); //Asigno un valor al atributo fabricante
        //nissan.setModelo("Sentra"); //Modifico el valor asignado al atributo modelo
        ////nissan.setCilindros(2.0); //Asigno un valor al atributo cilindros

        Motor motorMitsubichi = new Motor(1.8, TipoMotor.GASOLINA);
        Automovil mitsubichi = new Automovil("Mitsubichi", "Lancer", Color.NEGRO, motorMitsubichi);
        mitsubichi.setTanque(new Tanque());

        //Invoco todos los métodos
        System.out.println(mitsubichi.verDetalle());
        System.out.println(nissan.verDetalle()); //Invoco el método detalle()
        System.out.println(toyota.verDetalle()); //Invoco el método detalle()
        System.out.println(nissan);

        //Llamo un atributo por el get
        System.out.println("toyota.obtenerFabricante() = " + toyota.getFabricante());


        System.out.println(toyota.acelerar(3000)); //Invoco el método acelerar()
        System.out.println(toyota.frenar());

        System.out.println();

        System.out.println(nissan.acelerarFrenar(2000));

        System.out.println("\nKilómetros por litro: " + toyota.calcularConsumo(300, 0.75f)); //Invoco el método calcularConsumo()

        System.out.println("Kilómetros por litro: " + toyota.calcularConsumo(300, 75)); //Invoco el método calcularConsumo()

    }
}
