import java.util.Scanner;

public class PracticaSeccion4EstadoGasolina {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Digite por favor los litros de gasolina: ");
        double digitoIngresadoGasolina = s.nextDouble();

        if(digitoIngresadoGasolina == 70){
            System.out.println("Su tanque está lleno");
        } else if ((digitoIngresadoGasolina >= 60) && (digitoIngresadoGasolina < 70)) {
            System.out.println("Su tanque está casi lleno");
        } else if ((digitoIngresadoGasolina >= 40) && (digitoIngresadoGasolina < 60)) {
            System.out.println("Su tanque está en 3/4");
        } else if ((digitoIngresadoGasolina >= 35) && (digitoIngresadoGasolina < 40)) {
            System.out.println("Medio tanque");
        } else if ((digitoIngresadoGasolina >= 20) && (digitoIngresadoGasolina < 30)) {
            System.out.println("Suficiente");
        } else if ((digitoIngresadoGasolina >= 1) && (digitoIngresadoGasolina < 20)) {
            System.out.println("Insuficiente");
        }
    }
}
