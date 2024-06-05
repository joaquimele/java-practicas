import java.util.Scanner;

public class PracticaSeccion4NumerosOrdenados{
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese el primer número: ");
        int numero1 = s.nextInt();

        System.out.println("Ingrese el segundo número: ");
        int numero2 = s.nextInt();

        String numOrdenados = (numero1 > numero2) ? "El orden es: " + numero1 + ", " + numero2 : "El orden es: " + numero2 + ", " + numero1;
        System.out.println(numOrdenados);

    }

}
