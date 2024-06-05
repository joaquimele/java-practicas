public class ArgumentosLineaComandoCalculadora {
    public static void main(String[] args) {

        if(args.length != 3) { // Si no se ingresan 3 argumentos, se imprime un mensaje y se termina el programa
            System.out.println("Debe ingresar 3 argumentos");
            System.exit(-1); // Se termina el programa
        }

        String operacion = args[0]; // Se obtiene la operación a realizar

        int a = Integer.parseInt(args[1]); // Se obtiene el primer número
        int b = Integer.parseInt(args[2]); // Se obtiene el segundo número
        double resultado = 0.00;

        switch(operacion) {
            case "sumar":
                resultado = a + b;
                break;
            case "restar":
                resultado = a - b;
                break;
            case "multiplicar":
                resultado = a * b;
                break;
            case "dividir":
                if(b == 0) {
                    System.out.println("No se puede dividir por cero");
                    System.exit(-1); // Se termina el programa
                }
                resultado = (double) a / b;
                break;
            default:
                System.out.println("Operación no válida");
                System.exit(-1); // Se termina el programa
        }
        System.out.println("Resultado de la operación = " + operacion + " es: " + resultado);
    }
}
