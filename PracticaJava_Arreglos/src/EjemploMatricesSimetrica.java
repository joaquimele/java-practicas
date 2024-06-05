public class EjemploMatricesSimetrica {
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3, 4},
                {2, 1, 0, 5},
                {3, 0, 1, 6},
                {4, 5, 6, 7}
        };

        boolean simetrica = true; // Suponemos que la matriz es simétrica


        salir:
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < i; j++) {

                if (matriz[i][j] != matriz[j][i]) { //Si un elemento no coincide, la matriz no es simétrica

                    simetrica = false; // Cambiamos el valor de la variable a false y terminamos el bucle

                    break salir;
                }
            }
        }

        if (simetrica) {
            System.out.println("La matriz es simétrica");
        } else {
            System.out.println("La matriz no es simétrica");
        }
    }
}
