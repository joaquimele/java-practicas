public class Tanque {
    private int capacidad;

    public Tanque() { //Constructor sin parametros definido dentro del mismo
        this.capacidad = 40;
    }

    public Tanque(int capacidad) { //Constructor con un parametro int
        this.capacidad = capacidad;
    }

    public int getCapacidad() { //Solamente retorno un valor int
        return capacidad;
    }
}
