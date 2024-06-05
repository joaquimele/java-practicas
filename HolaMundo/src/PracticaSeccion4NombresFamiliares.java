import javax.swing.*;
import java.util.Arrays;

public class PracticaSeccion4NombresFamiliares {
    public static void main(String[] args) {

        String inputNombre1 = JOptionPane.showInputDialog(null, "Ingrese nombre 1");
        String inputNombre2 = JOptionPane.showInputDialog(null, "Ingrese nombre 2");
        String inputNombre3 = JOptionPane.showInputDialog(null, "Ingrese nombre 3");

        //Guardo cada nombre separado en una posición de array usando la clase Array y convirtiendo en objetos String de Arrays
        String[] nombres = {Arrays.toString(inputNombre1.split(" ")), Arrays.toString(inputNombre2.split(" ")), Arrays.toString(inputNombre3.split(" "))};

        String nombreMasLargo;

        if((inputNombre1.length() > inputNombre2.length()) &&(inputNombre1.length() > inputNombre3.length())){
            nombreMasLargo = inputNombre1;
        } else if ((inputNombre2.length() > inputNombre1.length()) &&(inputNombre2.length() > inputNombre3.length())) {
            nombreMasLargo = inputNombre2;
        } else {
            nombreMasLargo = inputNombre3;
        }

        JOptionPane.showMessageDialog(null, nombreMasLargo + " es el nombre más largo.");
    }
}
