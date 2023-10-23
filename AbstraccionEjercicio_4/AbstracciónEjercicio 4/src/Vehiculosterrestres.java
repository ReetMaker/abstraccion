public class Vehiculosterrestres extends Vehiculo implements Motor{
    private int cantidadDeLlantas;

    private String usoDelVehiculo;

    public Vehiculosterrestres(int velocidadActual, int velocidadMaxima, int cantidadDeLlantas, String usoDelVehiculo) {
        super(velocidadActual, velocidadMaxima);
        this.cantidadDeLlantas = cantidadDeLlantas;
        this.usoDelVehiculo = usoDelVehiculo;
    }

    @Override
    public int calcularRevolucionesMotor(int fuerza, int radio) {
        int revolucionmotor = fuerza * radio;
        return revolucionmotor;
    }

    @Override
    public void Acelerar(int velocidadIncremental) {
        if (velocidadActual+velocidadIncremental>velocidadMaxima) {
            System.out.println("La velocidad actuaal no puede ser mayor a la maxima.");
        } else {
            velocidadActual = velocidadActual + velocidadIncremental;
        }
    }

    @Override
    public void Frenar(int velocidadDecremental) {
        if (velocidadActual-velocidadDecremental<0) {
            System.out.println("La velocidad actual no puede ser negativa.");
        } else {
            velocidadActual = velocidadActual - velocidadDecremental;
        }
    }
}
