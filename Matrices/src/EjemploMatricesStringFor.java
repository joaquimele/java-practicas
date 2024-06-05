public class EjemploMatricesStringFor {
    public static void main(String[] args) {

        String[][] nombres = new String[2][3]; //2 filas y 3 columnas

        //Primera fila
        nombres[0][0] = "Juan";
        nombres[0][1] = "Karla";
        nombres[0][2] = "Miguel";

        //Segunda fila
        nombres[1][0] = "Maria";
        nombres[1][1] = "Laura";
        nombres[1][2] = "Eva";

        System.out.println("número de filas: " + nombres.length); //Largo de filas
        System.out.println("número de columnas: " + nombres[0].length); //Cantidad de elementos en la columna 0 de 3

        System.out.println("Primer elemento de la matriz: " + nombres[0][0]);
        System.out.println("último elemento de la matriz: " + nombres[nombres.length -1][nombres[1].length -1] + "\n");

        System.out.println("Iterando con un for: ");
        for (int i = 0; i < nombres.length; i++) {

            for (int j = 0; j < nombres[i].length; j++) {
                System.out.print(nombres[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nIterando con un for each: ");
        for(String[] fila : nombres){
            for(String nombre : fila){
                System.out.print(nombre + "\t");
            }
            System.out.println();
        }
    }
}
