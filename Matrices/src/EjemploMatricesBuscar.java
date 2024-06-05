public class EjemploMatricesBuscar {
    public static void main(String[] args) {

        int[][] matriz = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        int numero = 7;
        boolean encontrado = false;

       buscar: for (int i = 0; i < matriz.length; i++) { //Guardamos el bucle en una etiqueta
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == numero) {
                    encontrado = true;
                    break buscar; //Con este break salimos del bucle etiquetado
                }
            }
        }

        if (encontrado) {
            System.out.println("El número " + numero + " ha sido encontrado en la matriz");
        } else {
            System.out.println("El número " + numero + " no ha sido encontrado en la matriz");
        }
    }
}
