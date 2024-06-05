public enum TipoAutomovil {

    SEDAN("Sedan", "Auto normal", 4),
    STATION_WAGON("Station wagon", "Auto grande", 5),
    HATCHBACK("Hatchback", "Auto compacto", 5),
    PICK_UP ("Pickup", "Camioneta", 4),
    COUPE("Coupé", "Auto pequeño", 3),
    CONVERTIBLE("Convertible", "Auto deportivo", 2),
    FURGON("Furgón", "Vehículo de carga", 4);

    private final String nombre;
    private final int numeroPuertas;
    private final String descripcion;

    TipoAutomovil(String nombre, String descripcion, int numeroPuertas){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.numeroPuertas = numeroPuertas;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return this.nombre + " - " +  this.descripcion;
    }
}
