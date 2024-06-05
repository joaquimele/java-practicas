public class EjemploMatricesSumarFilasYColumas {
    public static void main(String[] args) {

        int sumaFilas;
        int sumaColumnas;

        int[][] a = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };


        // Sumar filas y columnas
        for(int i = 0; i < a.length; i++){
            sumaFilas = 0;
            sumaColumnas = 0;
            for(int j = 0; j < a[i].length; j++){

                sumaFilas += a[i][j];
                sumaColumnas += a[j][i];
            }

            System.out.println("La suma de la fila " + i + " es: " + sumaFilas);
            System.out.println("La suma de la columna " + i + " es: " + sumaColumnas);
        }

    }
}
