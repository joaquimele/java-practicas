public enum Color {
    BLANCO("Blanco"),
    NEGRO("Negro"),
    AMARILLO("Amarillo"),
    AZUL("Azul"),
    ROJO("Rojo"),
    GRIS_OSCURO("Gris oscuro");

    private final String color;

    Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return this.color;
    }
}
