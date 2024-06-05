import java.util.Scanner;

public class PracticaSeccion5MultiplicarNumeros {
    public static void main(String[] args) {

        int resultado = 0;
        int a;
        int b;

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de números a evaluar: ");
        int cantidad = s.nextInt();

        System.out.println("Ingrese el primer número: ");
        b = s.nextInt();
        System.out.println("Ingrese el segundo número: ");
        a = s.nextInt();

        boolean esNegativo = b < 0; //b es true cuando es menor a 0, por ende negativo
        b = Math.abs(b); //Función que toma como valor absoluto respetando su signo

        for(int i = 0; i < b; i++){
            resultado = resultado + a; //Iterando hasta b, resultado toma el valor de a y lo vuelve a sumar
        }
        if(esNegativo){
            resultado = -resultado; //Si esNegativo es FALSE el resultado queda positivo
        }
        System.out.println("resultado = " + resultado);

    }
}
