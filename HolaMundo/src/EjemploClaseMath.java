public class EjemploClaseMath {
    public static void main(String[] args) {
        
        int absoluto = Math.abs(-3); //Nos devuelve el valor absoluto de un número, sin importar si es positivo o negativo
        System.out.println("absoluto = " + absoluto);
        
        absoluto = Math.abs(3);
        System.out.println("absoluto = " + absoluto);
        
        double max = Math.max(3.5, 1.2); //Nos devuelve el número mayor de los dos que le pasamos como argumento
        System.out.println("max = " + max);
        
        double min = Math.min(3.5, 1.2); //Nos devuelve el número menor de los dos que le pasamos como argumento
        System.out.println("min = " + min);
        
        double redondeoHaciaArriba = Math.ceil(3.5); //Nos devuelve el número entero mayor más cercano al número que le pasamos como argumento
        System.out.println("redondeoHaciaArriba = " + redondeoHaciaArriba);
        
        double redondeoHaciaAbajo = Math.floor(3.5); //Nos devuelve el número entero menor más cercano al número que le pasamos como argumento
        System.out.println("redondeoHaciaAbajo = " + redondeoHaciaAbajo);
    
        double redondeo = Math.round(Math.PI); //Nos devuelve el número entero más cercano al número que le pasamos como argumento
        System.out.println("redondeo = " + redondeo);

        //-----------TRIGONOMETRIA-----------

        double exp = Math.exp(2); //Nos devuelve el número e elevado a la potencia que le pasamos como argumento
        System.out.println("exp = " + exp);

        double log = Math.log(10); //Nos devuelve el logaritmo natural del número que le pasamos como argumento
        System.out.println("log = " + log);

        double potencia = Math.pow(10, 3); //Nos devuelve el número que resulta de elevar el primer número al segundo número que le pasamos como argumento
        System.out.println("potencia = " + potencia);

        double raiz = Math.sqrt(25); //Nos devuelve la raíz cuadrada del número que le pasamos como argumento
        System.out.println("raiz = " + raiz);
        
        //-----------TRIGONOMETRIA-----------
        
        double grados = Math.toDegrees(1.57); //Convierte el número que le pasamos como argumento de radianes a grados
        grados = Math.round(grados); //Redondeamos el resultado
        System.out.println("Convertir de radianes a grados = " + grados);

        double radianes = Math.toRadians(90d); //Convierte el número que le pasamos como argumento de grados a radianes
        System.out.println("Convertir de grados a radianes = " + radianes);

        System.out.println("seno de 90 grados = " + Math.sin(radianes)); //Nos devuelve el seno del número que le pasamos como argumento
        System.out.println("coseno de 90 grados = " + Math.cos(radianes)); //Nos devuelve el coseno del número que le pasamos como argumento
        System.out.println("tangente de 90 grados = " + Math.tan(radianes)); //Nos devuelve la tangente del número que le pasamos como argumento


    }
}
