import java.util.Scanner;

public class PracticaSeccion10CalcularAreaCirculo {
    public static void main(String[] args) {

        //Se pide primero el radio de un círculo y se calcula su área
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese un número para asignar el radio del círculo: ");

        double radio = s.nextDouble();
        double area = Math.round(Math.PI * Math.pow(radio, 2));

        System.out.println("radio = " + radio);
        System.out.println("area = " + area);


    }
}
