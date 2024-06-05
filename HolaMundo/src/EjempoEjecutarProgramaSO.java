import java.io.IOException;

public class EjempoEjecutarProgramaSO {
    public static void main(String[] args) {

        Runtime rt = Runtime.getRuntime(); // Obtenemos una instancia de la clase Runtime

        Process proceso; // Creamos una variable de tipo Process


        try { // Utilizamos un bloque try-catch para capturar posibles excepciones
            if (System.getProperty("os.name").contains("Windows 11")) {

                proceso = rt.exec("notepad"); // Ejecutamos el comando notepad.exe

            } else if(System.getProperty("os.name").toLowerCase().contains("Mac")){

                proceso = rt.exec("open -a TextEdit"); // Ejecutamos el comando open -a TextEdit

            } else if(System.getProperty("os.name").toLowerCase().contains("Linux")
                    || System.getProperty("os.name").toLowerCase().contains("nix")){

                proceso = rt.exec("gedit"); //

            } else {

                proceso = rt.exec("gedit"); // Ejecutamos el comando gedit

            }
            proceso.waitFor(); // Esperamos a que el proceso termine
        } catch (Exception e) { // Capturamos la excepción si se produce un error

            System.err.println("\nError al ejecutar el comando\n" + e.getMessage());
            System.exit(1);
        }

        System.out.println("Se ha cerrado el editor de texto");
        System.exit(0);
    }
}
