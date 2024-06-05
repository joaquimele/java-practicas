import java.util.Map;

public class EjemploVarialblesDeEntorno {
    public static void main(String[] args) {

        Map<String, String> varEnv = System.getenv(); //Obtiene todas las variables de entorno
        System.out.println("Variable de ambiente del sistema = " + varEnv);

        System.out.println("Listando las variables de entorno del sistema");
        for(String key : varEnv.keySet()) { //.keySet() obtiene todas las llaves del mapa
            System.out.println(key + " => " + varEnv.get(key));
        }

        varEnv.get("LOCALAPPDATA"); //Obtiene la variable de entorno LOCALAPPDATA
        System.out.println("varEnv.get() = " + varEnv.get("LOCALAPPDATA")); //Imprime la variable de entorno LOCALAPPDATA

        String username = System.getenv("USERNAME"); //Obtiene la variable de entorno USERNAME
        System.out.println("username = " + username);

        String temDir = System.getenv("TEMP"); //Obtiene la variable de entorno TEMP
        System.out.println("temDir = " + temDir);
    }
}
