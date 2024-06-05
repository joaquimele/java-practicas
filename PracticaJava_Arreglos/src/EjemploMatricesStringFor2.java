public class EjemploMatricesStringFor2 {
    public static void main(String[] args) {

        String[][] nombres = {{"Juan", "Karla"}, {"Miguel", "Maria"}, {"Laura", "Eva"}}; //2 filas y 3 columnas

        //Se simplifica el código, pero solo es recomendable utilizar
        // esta matriz definida cuando sabemos la cantidad de filas y columnas
        // que vamos a tener

        System.out.println("\nIterando con un for each: ");
        for(String[] fila : nombres){
            for(String nombre : fila){
                System.out.print(nombre + "\t");
            }
            System.out.println();
        }
    }
}
