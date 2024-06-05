import java.util.Scanner;

public class PracticaSeccion3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //Scanner para el ingreso por consola
        String[] nombres = new String[3]; //Defino el array con 3 args del tipo string

        for(int i = 0; i < 3; i++){

            System.out.print("Ingrese el nombre del integrante " + (i + 1) + ": "); //El (i + 1) indica "ingresante 1...", "ingresante 2...", etc
            nombres[i] = scanner.nextLine(); //Guardo los nombres del array en el scanner

            String nombre = nombres[i]; //La var nombre adopta cada iteracion de los ingresos del nombre
            String transformacion = nombre.substring(1, 2).toUpperCase() + "." + nombre.substring(nombre.length() - 2); //Transformo los strings
            nombres[i] = transformacion; //Almacena el nombre transformado en el array

        }

        String resultado = String.join("_", nombres); //Añado un caracter _ a cada string al final
        System.out.println("resultado = " + resultado);

        scanner.close();
    }
}

