public class EjemploMatricesTranspuesta {
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        //Muestra la matriz original
        System.out.println("Matriz original\n");
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }


        //Convertimos la matriz transpuesta
        int temp;
        for(int i = 1; i < matriz.length; i++){
            for(int j = 0; j < i; j++){

                temp = matriz[i][j]; //Guardamos el valor de la matriz original
                matriz[i][j] = matriz[j][i]; //Cambiamos el valor de la matriz original por el de la transpuesta
                matriz[j][i] = temp; //Cambiamos el valor de la matriz transpuesta por el de la original
            }
        }

        System.out.println("\nMatriz transpuesta: \n");
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
