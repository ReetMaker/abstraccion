
package abstraccionejercicio1;

/**
 *
 * @author Tomás
 */
public class Novelas extends Libro{
    private String genero;

    public Novelas(String genero, String titulo, String autor) {
        super(titulo, autor);
        this.genero = genero;
    }

    @Override
    public void Imprimir() {
        System.out.println("Titulo = "+this.titulo+
                "Autor = "+this.autor+
                "Precio = "+this.precio+
                "Genero de libro = "+this.genero);
    }

    
    
}
