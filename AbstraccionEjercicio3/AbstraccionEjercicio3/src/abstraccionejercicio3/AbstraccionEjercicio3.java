
package abstraccionejercicio3;

/**
 *
 * @author Tomás
 */
public class AbstraccionEjercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fraccion frac1= new Fraccion(1, 3);
        
        System.out.println(frac1.sumar(3,5));
        System.out.println(frac1.restar(3, 5));
        System.out.println(frac1.multiplicar(3, 5));
        System.out.println(frac1.dividir(3, 5));
        
    }
    
}
