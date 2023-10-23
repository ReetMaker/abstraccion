public class Vehiculosaacuaticos extends Vehiculo implements Vela {
    private String tipo;

    private int cantidadPasajeros;

    public Vehiculosaacuaticos(int velocidadActual, int velocidadMaxima, String tipo, int cantidadPasajeros) {
        super(velocidadActual, velocidadMaxima);
        this.tipo = tipo;
        this.cantidadPasajeros = cantidadPasajeros;
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

    @Override
    public void recomendarVelocidad(int velocidadViento) {
        if (velocidadViento>80 || velocidadViento<10) {
            System.out.println("No se recomienda salir.");
            velocidadActual = 0;
        } else {
            System.out.println("Se recomienda salir.");
        }
    }
}
