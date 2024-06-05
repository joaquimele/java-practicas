import java.util.Properties;

public class EjemploPropiedadesDeSistemas {
    public static void main(String[] args) {
        String username = System.getProperty("user.name"); //Obtiene el nombre del usuario
        System.out.println("username = " + username); //Imprime el nombre del usuario

        String home = System.getProperty("user.home"); //Obtiene el directorio home del usuario
        System.out.println("home = " + home); //Imprime el directorio home del usuario

        String workspace = System.getProperty("user.dir"); //Obtiene el directorio de trabajo
        System.out.println("workspace = " + workspace); //Imprime el directorio de trabajo

        String java = System.getProperty("java.version"); //Obtiene la versión de java
        System.out.println("java = " + java); //Imprime la versión de java

        String lineSeparator = System.getProperty("line.separator"); //Obtiene el separador de líneas
        System.out.println("lineSeparator = " + lineSeparator); //Imprime el separador de líneas

        String javaHome = System.getProperty("java.home"); //Obtiene el directorio de instalación de java
        System.out.println("javaHome = " + javaHome); //Imprime el directorio de instalación de java


        Properties p = System.getProperties(); //Obtiene todas las propiedades del sistema
        p.list(System.out); //Imprime todas las propiedades del sistema

    }
}
