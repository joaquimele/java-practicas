import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class ClaseBorrador {
    public static void main(String[] args) {

        // los Map (o mapas) los veremos mas adelante en el curso en profundidad
        // pero son como un arreglo asociativo, asocia un nombre (o indice) a un valor
        // también se les conoce como diccionarios para almacenar datos en base a un nombre.
        Map<String, Integer> opciones = new HashMap<>();
        opciones.put("Actualizar", 1);
        opciones.put("Eliminar", 2);
        opciones.put("Agregar", 3);
        opciones.put("Listar", 4);
        opciones.put("Salir", 5);



    }
}
