public class Motor {
    private double cilindrada;
    private TipoMotor tipoMotor;

    public Motor() {
        this.cilindrada = 1.6;
        this.tipoMotor = TipoMotor.DIESEL;
    }

    public Motor(double cilindrada, TipoMotor tipoMotor) {
        this.cilindrada = cilindrada;
        this.tipoMotor = tipoMotor;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public TipoMotor getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(TipoMotor tipoMotor) {
        this.tipoMotor = tipoMotor;
    }
}
