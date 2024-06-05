import java.text.DecimalFormat;
import java.util.Scanner;

public class PracticaSeccion2 {
    public static void main(String[] args) {

        //Genero el scanner para el input por consola
        Scanner scannerFactura = new Scanner(System.in);
        System.out.println("Ingrese su factura por favor");

        String nombreFactura = scannerFactura.nextLine();

        //Inicializo variables del precio de las facturas en 0
        double precioFactura1 = 0;
        double precioFactura2 = 0;

        //Pido por consola el primer monto
        Scanner scannerPrimerMonto = new Scanner(System.in);
        System.out.println("\nPor favor ingrese el primer monto: ");
        //Pido por consola el segundo monto
        Scanner scannerSegundoMonto = new Scanner(System.in);
        System.out.println("\nPor favor ingrese el segundo monto: ");

        try{
            precioFactura1 = scannerPrimerMonto.nextDouble();
            precioFactura2 = scannerSegundoMonto.nextDouble();

        }catch (Exception e){

            System.out.println("Error, el precio debe ser un monto numérico solamente.");
            main(args);
            System.exit(0);
        }

        System.out.println("Primer monto = " + precioFactura1);
        System.out.println("Segundo monto = " + precioFactura2);

        //Generoel subtotal dando la suma del primer monto + el segundo
        double subtotalFacturacion = precioFactura1 + precioFactura2;
        System.out.println("Subtotal = " + subtotalFacturacion);

        double impuesto = (subtotalFacturacion*19)/100;
        double totalFinal = subtotalFacturacion + impuesto;

        //Delimito la cantidad de decimales a la derecha de la coma
        DecimalFormat formatoDecimal = new DecimalFormat("#, ###. ##");

        System.out.println("Su factura ingresada es: " + nombreFactura + "\nTotal bruto de la factura: " +
                formatoDecimal.format(subtotalFacturacion) + "\nTotal neto: " + formatoDecimal.format(totalFinal));

    }
}
