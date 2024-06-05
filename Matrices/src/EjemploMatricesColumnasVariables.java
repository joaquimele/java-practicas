public class EjemploMatricesColumnasVariables {
    public static void main(String[] args) {

        int[][] matriz = new int[3][];

        matriz[0] = new int[2]; //Primera fila con 2 columnas
        matriz[1] = new int[3]; //Segunda fila con 3 columnas
        matriz[2] = new int[4]; //Tercera fila con 4 columnas

        System.out.println("Número de filas: " + matriz.length);
        System.out.println("Número de columnas de la primera fila: " + matriz[0].length);
        System.out.println("Número de columnas de la segunda fila: " + matriz[1].length);
        System.out.println("Número de columnas de la tercera fila: " + matriz[2].length);

        System.out.println("Valores de la matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = i * j;
            }
            System.out.println();
        }

        //Recorremos la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
