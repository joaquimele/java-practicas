public class EjemploAutomovilStatic {
    public static void main(String[] args) {

        // Creación de un objeto de la clase Automóvil
        Automovil toyota = new Automovil("Toyota", "Corolla");

        toyota.setColor(Color.NEGRO); //Asigno un valor al atributo color
        toyota.setMotor(new Motor(3.5, TipoMotor.DIESEL)); //Asigno un valor al atributo cilindros
        toyota.setTipo(TipoAutomovil.SEDAN);

        //Creación de un objeto Automóvil
        Automovil nissan = new Automovil("Nissan", "Sentra", Color.ROJO, new Motor(3.5, TipoMotor.DIESEL)); // Creación de un objeto de la clase Automovil
        nissan.setTipo(TipoAutomovil.SEDAN);

        //Creación de un objeto Automóvil
        Automovil mitsubichi = new Automovil("Mitsubichi", "Lancer",
                Color.AZUL, new Motor(3.5, TipoMotor.DIESEL));
        mitsubichi.setTipo(TipoAutomovil.HATCHBACK);


    }
}
