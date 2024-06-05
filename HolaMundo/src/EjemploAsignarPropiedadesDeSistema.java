import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class EjemploAsignarPropiedadesDeSistema {
    public static void main(String[] args) {
        try {
            FileInputStream archivo = new FileInputStream("src/config.properties"); //Creo un flujo de entrada para leer el archivo

            Properties p = new Properties(System.getProperties()); //Obtengo las propiedades del sistema
            p.load(archivo); //Cargo las propiedades del archivo
            p.setProperty("mi.propiedad.personalizada", "Mi valor guardado en el archivo de propiedades"); //Asigno una propiedad personalizada

            System.setProperties(p); //Asigno las propiedades al sistema
            System.getProperties().list(System.out); //Imprimo las propiedades del sistema

            System.out.println("ps.getPropery(...) = " + p.get("mi.propiedad.personalizada")); //Imprimo la propiedad personalizada
            System.out.println("ps.getPropery(...) = " + p.get("config.puerto.servidor")); //Imprimo la propiedad personalizada

        } catch (Exception e) {
            System.out.println("No existe el archivo: " + e);
            System.exit(1);
        }
    }
}
