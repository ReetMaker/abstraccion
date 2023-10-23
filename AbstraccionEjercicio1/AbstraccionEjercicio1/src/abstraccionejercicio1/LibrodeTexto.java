
package abstraccionejercicio1;

/**
 *
 * @author Tomás
 */
public class LibrodeTexto extends Libro{
    
    private String editorial; 
    private String curso;

    public LibrodeTexto(String editorial, String curso, String titulo, String autor) {
        super(titulo, autor);
        this.editorial = editorial;
        this.curso = curso;
    }

    @Override
    public void Imprimir() {
        System.out.println("Titulo = "+this.titulo+
                "Autor = "+this.autor+
                "Precio = "+this.precio+
                "Editorial = "+this.editorial+
                "Curso = "+this.curso);
    }    
}
