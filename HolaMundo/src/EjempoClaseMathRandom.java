import java.util.Random;

public class EjempoClaseMathRandom {
    public static void main(String[] args) {

        String[] colores = {"azul", "amarillo", "rojo", "verde", "blanco", "violeta"};
        double random = Math.random(); //Nos devuelve un número aleatorio entre 0.0 y 1.0
        System.out.println("random = " + random); //El 1 no está incluído

        random *= colores.length; //Multiplicamos el número aleatorio por la longitud del arreglo
        System.out.println("random = " + random); //Nos devuelve un número aleatorio entre 0.0 y 8.0

        random = Math.floor(random); //Redondeamos el número aleatorio hacia abajo
        System.out.println("random = " + random); //Nos devuelve un número aleatorio entre 0.0 y 7.0

        System.out.println("colores = " + colores[(int) random] + " -> posición -> " + random); //Nos devuelve un color aleatorio y parseamos a int los string


        //--------OBJETO RANDOM--------

        //Creamos un objeto de la clase Random
        Random randomObj = new Random();
        int randomInt = randomObj.nextInt(); //Nos devuelve un número entero aleatorio
        System.out.println("randomInt = " + randomInt); //Nos devuelve un número entero aleatorio

        int randomIntRango = 15+randomObj.nextInt(25-15); //Nos devuelve un número entero aleatorio entre 15 y 25
        System.out.println("randomIntRango = " + randomIntRango); //Nos devuelve un número entero aleatorio

        randomInt = randomObj.nextInt(colores.length); //Nos devuelve un número entero aleatorio entre 0 y 5
        System.out.println("randomInt = " + randomInt);
        System.out.println("colores = " + colores[randomInt] + " -> posición -> " + randomInt); //Nos devuelve un color aleatorio


    }
}
