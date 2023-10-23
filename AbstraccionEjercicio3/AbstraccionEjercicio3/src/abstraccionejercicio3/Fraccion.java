
package abstraccionejercicio3;

public class Fraccion implements Numerica{
    private int numerador;
    private int denominador;

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    @Override
    public double sumar(int numero1, int numero2) {
        double resultado = denominador*numero2;
        resultado = ((resultado/denominador*numerador)+(resultado/numero2*numero1))/resultado;
        return resultado;
    }

    @Override
    public double restar(int numero1, int numero2) {
        double resultado = denominador*numero2;
        resultado = ((resultado/denominador*numerador)-(resultado/numero2*numero1))/resultado;
        return resultado;
    }

    @Override
    public double multiplicar(int numero1, int numero2) {
        return (double)(numerador*numero1)/(denominador*numero2);
    }

    @Override
    public double dividir(int numero1, int numero2) {
        return (double)(numerador*numero2)/(denominador*numero1);
        //return (double)(numerador/denominador)/ (double)(numero1/numero2);
    }
    
    
}
