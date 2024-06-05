import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class PracticaSeccion7CalcularEdad {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); //Defino un objeto Scanner para que pregunte y guarde la edad por input del usuario.
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy"); // Formato de fecha, para que el usuario ingrese la fecha en el formato correcto.


        try {
            System.out.println("Ingrese su año de nacimiento: ");


            Date fecha = format.parse(s.next()); // Se parsea la fecha ingresada por el usuario.
            Calendar calendario = Calendar.getInstance(); // Se crea un objeto de tipo Calendar.
            calendario.setTime(fecha); // Se setea la fecha ingresada por el usuario en el objeto de tipo Calendar.
            System.out.println("fecha = " + fecha); // Se imprime la fecha ingresada por el usuario.

            Date fechaActual = new Date(); // Se crea un objeto de tipo Date.
            Calendar calendarioActual = Calendar.getInstance(); // Se crea un objeto de tipo Calendar.
            calendarioActual.setTime(fechaActual); // Se setea la fecha actual en el objeto de tipo Calendar.
            System.out.println("fechaActual = " + fechaActual);

            int anioUsuario = calendario.get(Calendar.YEAR); // Se obtiene el año de nacimiento del usuario.
            int anioActual = calendarioActual.get(Calendar.YEAR); // Se obtiene el año actual.

            if (anioUsuario >= 2024) { //Si la edad es igual o mayor a la actual debe dar error. Sino, continúa el código.
                System.out.println("Error, el año no puede ser igual o mayor al actual");
            } else {

                int edadDelUsuario = (anioUsuario - anioActual);

                boolean edadNegativa = edadDelUsuario < 0; //Genero una variable boolean TRUE sobre la edad negativa o menor a 0.
                edadDelUsuario = Math.abs(edadDelUsuario); //A la edad del usuario le doy un valor absoluto negativo

                if (edadNegativa) {
                    edadDelUsuario = +edadDelUsuario;
                    System.out.println("La edad del usuario es: " + edadDelUsuario + "años.");
                }
            }
        } catch (ParseException e) {  // La excepción es si el usuario ingresa un formato inválido.
            System.out.println("El formato ingresado no es válido. Debe ser 'dd/MM/yyyy'");
        }

    }
}
