public abstract class Vehiculo {
    protected int velocidadActual;

    protected int velocidadMaxima;

    public Vehiculo(int velocidadActual, int velocidadMaxima) {
        this.velocidadActual = velocidadActual;
        this.velocidadMaxima = velocidadMaxima;
    }

    public abstract void Acelerar(int velocidadIncremental);

    public abstract void Frenar(int velocidadDecremental);

    public void imprrimir() {
        System.out.println("Velocidad Actual = "+ velocidadActual+
                ".\bVelocidad Maxima = "+ velocidadMaxima + ".");
    };
}
